package cn.zjc.test.animal.applets;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/5
 */
public class Computer {

    public String launch() {
        int random;
        String random1;
        random = (int) (Math.random() * 3);
        System.out.println(random);
        if (random == 2) {
            random1 = "石头";
        } else if (random == 1) {
            random1 = "剪刀";
        } else if (random == 0) {
            random1 = "布";
        } else {
            System.out.println("计算机判断错误请重新开始游戏");
        }
        return this.launch();
    }
}
