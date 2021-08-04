package thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/3
 */
public class wait_notify {
    public static void main(String[] args)throws InterruptedException{
        TaskQueue q = new TaskQueue();
        ArrayList ts = new ArrayList<Thread>();
        for (int i= 0; i<5; i++){
            Thread t = new Thread(() -> {
                while(true){
                    try{
                        String s = q.getTask();
                        System.out.println("execute task:" + s);
                    }catch (InterruptedException e){
                        return;
                    }
                }
            });
            t.start();
            ts.add(t);
        }
        Thread add = new Thread(() -> {
            for (int i=0; i<10; i++) {
                // 放入task:
                String s = "t-" + Math.random();
                System.out.println("add task: " + s);
                q.addTask(s);
                try { Thread.sleep(100); } catch(InterruptedException e) {}
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
//        for (ts t : ts) {
//            t.interrupt();
//        }
    }
}

class TaskQueue{
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notify();
    }
    public synchronized String getTask() throws InterruptedException{
        while (queue.isEmpty()){
            this.wait();
        }
        return queue.remove();
    }
}
