package cn.zjc.test.animal.applets;

import java.util.Scanner;

/**
 *
 * @Author zhoujc
 * @Date 2021/8/5
 */
public class Rstimate {

    public void play(User user, Computer cmp) {
        int bout;

        int userWin = 0;
        int computerWin = 0;
        String userChoose;
        String computerChoose = null;

        System.out.println("-----------石头剪刀布游戏-----------");
        System.out.println("游戏为三局两胜！！！\n游戏开始");


        for (bout = 1;bout <=3;bout++ ){
            Scanner in = new Scanner(System.in);
            System.out.println("第" + bout + "回合");
            System.out.println("请在石头，剪刀，布内选择输入：");
            userChoose = in.next();
            System.out.println("OK,你选择的是：" + userChoose);
            Computer cmp1 = new Computer();
            cmp1.launch();
            System.out.println("电脑选择的是：" + computerChoose);


//            if (userChoose == computerChoose){
//                System.out.println("平局");
//                continue;
//            }else if (userChoose <= computerChoose)


        }
    }
   
}
