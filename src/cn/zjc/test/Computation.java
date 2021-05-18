package cn.zjc.test;

import java.util.Arrays;
import java.util.Scanner;

public class Computation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int i = in.nextInt();
        if (i>1000 || i<10000){
            int[] s = new int[4];
            s[0] = i%10;
            s[1] = i/10%10;
            s[2] = i/100%10;
            s[3] = i/1000;
            System.out.println(s[0] + s[1] + s[2] + s[3]);
            Arrays.sort(s);
            System.out.println(s[0]);
        }

    }
}


