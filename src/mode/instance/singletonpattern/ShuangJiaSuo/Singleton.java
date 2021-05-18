package mode.instance.singletonpattern.ShuangJiaSuo;

public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton ==null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;

    }

}
/**
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * **/
