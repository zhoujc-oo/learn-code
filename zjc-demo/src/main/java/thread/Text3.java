package thread;


import java.time.LocalTime;

/**
 * 21/7/28
 * zhou
 * 中断线程
 */
public class Text3 {
    public static void main(String[] args) throws InterruptedException{

        Thread t = new MyThreat();
        t.start();//开始
        Thread.sleep(1);//暂停1毫秒
        t.interrupt();//中断t线程
        t.join();//等待t线程结束
        System.out.println("end");
    }
}
class MyThreat extends Thread{
   public void run(){
       Thread hello = new HelloThreat();
       hello.start();
       try {
           hello.join();
       }catch (InterruptedException e){
           System.out.println("interrupted!");
       }
       hello.interrupt();
   }
}
class HelloThreat extends Thread{
    public void run(){
        int n = 0;
        while(! isInterrupted()){
            n++;
            System.out.println(n + "hello");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}

class TimerThreat extends Thread{
    @Override
    public void run(){
        System.out.println(LocalTime.now());
        try{
            Thread t = new Thread();
            //守护线程
            t.setDaemon(true);
            t.sleep(1000);


        }catch (InterruptedException e){
            return;
        }
    }
}