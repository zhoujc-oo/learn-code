package cn.zjc.test;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++){
        System.out.println("你是男的还是女的");
        Scanner in = new Scanner(System.in);
        String sex = in.nextLine();
            System.out.println("你跑多少米");
            //int i = (int)(Math.random()*5*1000);
            int i = in.nextInt();

        switch(sex) {
            case "男":
                System.out.println("你是男子运动员");
                if (i > 1000) {
                    System.out.println("你是长跑运动员" + i);
                } else {
                    System.out.println("你是短跑运动员" + i);
                }
                break;

            case "女":
                System.out.println("你是女子运动员");
                if (i > 1000) {
                    System.out.println("你是长跑运动员" + i);
                } else {
                    System.out.println("你是短跑运动员" + i);
                }
                break;
            default:
                System.out.println("看不懂，滚！！！");
        }
        }
    }
}
