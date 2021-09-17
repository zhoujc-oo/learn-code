package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @descriptionj
 * ReentrantLock可以替代synchronized进行同步；
 *
 * ReentrantLock获取锁更安全；
 *
 * 必须先获取到锁，再进入try {...}代码块，最后使用finally保证释放锁；
 *
 * 可以使用tryLock()尝试获取锁。
 * @Author zhoujc
 * @Date 2021/8/4
 */
public class ReentrantLock1 {
    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int n) {
        lock.lock();
        try {
            count += n;
        } finally {
            {
                lock.unlock();
            }
        }
    }
}
