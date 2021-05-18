package cn.zjc.test;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String yzm = "dhAi23";
        System.out.println("请输入一个验证码");
        String x = str.next();
        if(x.toLowerCase().equals(yzm.toLowerCase())){
            System.out.println("正确");
        }else {
            System.out.println("输入错误");
        }

    }
}
