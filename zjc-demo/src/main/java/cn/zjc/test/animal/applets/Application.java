package cn.zjc.test.animal.applets;
/**
 *
 * @Author zhoujc
 * @Date 2021/8/5
 */
public class Application {

    public static void main(String[] args) {
        Computer cmp = new Computer();
        User user = new User();
        Rstimate app = new Rstimate();
        app.play(user,cmp);
    }
}
