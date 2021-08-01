package thread;

/**
 * 21/7/27
 * zhou
 * New：新创建的线程，尚未执行；
 * Runnable：运行中的线程，正在执行run()方法的Java代码；
 * Blocked：运行中的线程，因为某些操作被阻塞而挂起；
 * Waiting：运行中的线程，因为某些操作在等待中；t.join();//join(long)的重载方法也可以指定一个等待时间，超过等待时间后就不再继续等待。
 * Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
 * Terminated：线程已终止，因为run()方法执行完毕。
 */
public class Text1 {
    public static void main(String[] args) {
        System.out.println("主要的新线程。。。");
        Thread t = new Thread(() -> {
            System.out.println("跑线程...");
            try {
                Thread.sleep(10);
            } catch (
                    InterruptedException ignored) {
            }
            System.out.println("结束线程.");
        });
        t.start();
        try{
            Thread.sleep(20);
        }catch (InterruptedException ignored){

    }
        System.out.println("主要的结束");
}

static class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("开始新的线程");
    }
}}
