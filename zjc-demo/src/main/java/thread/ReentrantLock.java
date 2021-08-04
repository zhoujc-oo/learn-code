package thread;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/4
 */
public class ReentrantLock {
    private int count;

    public void add(int n){
        synchronized (this){
            count += n;
        }
    }
}
