package cn.zjc.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int uname = 100000;
        String password = "123456";
        int i = 3 ;
        Scanner input = new Scanner(System.in);
        System.out.println("QQ");
        int qq = input.nextInt();
        System.out.println("密码");
        String pwd = input.next();
        do{
            if(qq==uname&&pwd.equals(password)){
                System.out.println("登入成功");
                break;
            }else{
                i--;
                System.out.println("用户名与密码错误，请重新输入");
                System.out.println("QQ号");
                qq = input.nextInt();
                System.out.println("密码");
                pwd = input.next();
            }
        }while(i>0);
    }
}
