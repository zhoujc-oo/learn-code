package http_Server;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

class Handler extends Thread{
     Socket sock;

     public Handler(Socket sock){
         this.sock=sock;
     }
     public void run(){
         try(InputStream input = this.sock.getInputStream()){
             try (OutputStream output = this.sock.getOutputStream()){
                 handle(input, output);

             }
         }catch (Exception e){
             try{
                 this.sock.close();
             }catch (IOException ioe){
                ioe.printStackTrace();
             }
             e.printStackTrace();
             System.out.println("client disconnected");
         }

     }
     private void handle(InputStream input,OutputStream output) throws IOException{
         System.out.println("Process new http request...");
         BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output,StandardCharsets.UTF_8));

         boolean requestOk = false;
         String first  = reader.readLine();
         if(first.startsWith("GET/GTTP/1.")){
             requestOk = true;
         }
         for (;;){
             String header = reader.readLine();
             if (header.isEmpty()){
                 break;
             }
             System.out.println(header);
         }
         System.out.println(requestOk ? "Response Ok" : "Response Error");
         if (!requestOk){
             writer.write("HTTp/1.0 404 Not Fond\r\n");
             writer.write("content-LEngth:0\r\n");
             writer.write("r\n");
             writer.flush();
         }else {
             String data = "<html><body><h1> Hollo, world!<h1><body><html>";
             int length = data.getBytes(StandardCharsets.UTF_8).length;
             writer.write("HTTp/1.0 200 OK \r\n");
             writer.write("Connection: close\r\n");
             writer.write("Content-Type: text/html\r\n");
             writer.write("\r\n");
             writer.write(data);
             writer.flush();
         }
     }

}
