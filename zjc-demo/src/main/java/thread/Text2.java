package thread;


/**
 * 21/7/27
 * zhou
 * 线程的状态
 */
public class Text2 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(()-> System.out.println("hello"));

        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}
