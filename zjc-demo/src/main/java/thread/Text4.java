package thread;


/**
 * 21/7/28
 * zhou
 * 线程同步
 * 多线程同时读写共享变量时，会造成逻辑错误，因此需要通过synchronized同步；
 *
 * 同步的本质就是给指定对象加锁，加锁后才能继续执行后续代码；
 *
 * 注意加锁对象必须是同一个实例；
 *
 * 对JVM定义的单个原子操作不需要同步。
 */

public class Text4 {
    public static void main(String[] args) throws Exception{
        Thread[] ts = new Thread[]{
                new AddStudentThread(), new DecStudentThread(),new AddTeacherThread(), new DecTeacherThread()};
        for(Thread t : ts){
            t.start();
        }
        for (Thread t : ts){
            t.join();
        }
        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);
//        DecThreat dec = new DecThreat();
//        add.start();
//        dec.start();
//        add.join();
//        dec.join();
//        System.out.println(Counter.count);
    }
}
class Counter{
    public static final Object lock = new Object();
//    public static final Object lock2 = new Object();
//    public static int count = 0;
    public static int studentCount = 0;
    public static int teacherCount = 0;
}

class AddStudentThread extends Thread{
    public void run(){
        for (int i=0; i < 10000;i++){
            synchronized (Counter.lock) {
                Counter.studentCount += 1;
            }
        }
    }
}
class DecStudentThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock) {
                Counter.studentCount -= 1;
            }
        }
    }
}
class AddTeacherThread extends Thread{
    public void run(){
        for (int i = 0; i<10000; i++){
            synchronized (Counter.lock){
                Counter.teacherCount += 1;
            }
        }
    }
}
class DecTeacherThread extends Thread{
    public void run(){
        for (int i = 0;i<10000;i++){
            synchronized (Counter.lock){
                Counter.teacherCount -= 1;
            }
        }
    }
}