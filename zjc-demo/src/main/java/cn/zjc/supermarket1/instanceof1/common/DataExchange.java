package cn.zjc.supermarket1.instanceof1.common;

import java.io.*;
import java.net.Socket;
public class DataExchange {
    private static final String DEFAULT_CHARSET = " ";
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private boolean isClosed = false;
    public DataExchange(Socket socket) throws IOException {
        this.socket = socket;
        init(socket);
    }
    private void init(Socket socket) throws IOException {
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), DEFAULT_CHARSET));
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), DEFAULT_CHARSET));
    }
    public void send(ChatMessage chatMessage) {
        writer.println(chatMessage.toMessageString());
        writer.flush();
    }
    public ChatMessage receive() throws IOException {
        String line = null;
        while (true) {
            line = reader.readLine();
            if (line != null && line.length() > 0) {
                break;
            }
        }
        return ChatMessage.buildFrom(line);
    }
    public void close() {
        try {
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        isClosed = true;
    }

}