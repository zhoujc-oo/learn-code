package cn.zjc.calculate;

import java.util.Scanner;

public class Computers {
    public void addition(double a, double b, String fh){
        switch(fh) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
            default:
                System.out.println("输入错误");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computers means = new Computers();
        for(int i= 0;i<=100; i++) {
            System.out.println("请输入所计算的符号：+  —  *  /");
            String fh = in.next();
            System.out.println("请输入想计算的数字：a   b ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            means.addition(a, b, fh);

            System.out.println("是否继续计算：继续为0或退出为1");
            int j = in.nextInt();
            if (j == 0){
                System.out.println("--------计算继续--------");
            }else{
                break;
            }
        }
    }
}
/***
 * 1，怎么可以完全像计算机一样，可以同时完成多个加减乘除
 * 2. 整数计算时没有小数
 * 3，小数只精确到本该位数
 * 4，代码容易看清楚
 */
