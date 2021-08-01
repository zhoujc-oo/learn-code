
package cn.zjc.unusual;

import java.util.Scanner;

public class CheckingAccount {
    Scanner in = new Scanner(System.in);
    //balance为余额，number为卡号
    private double balance;
    private int number;
    public CheckingAccount(int number)
    {
        this.number = number;
    }
    //存钱
    public void deposit(double amount) {
        balance += amount;//总共的金额
    }

    public void deposit() {
        double money = in.nextDouble();
        System.out.println("请输入你所存金额：" + money);
        balance +=  money;
    }

    //取钱
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount <= balance) {
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    //返回余额
    public double getBalance()
    {
        return balance;
    }
    //返回卡号
    public int getNumber()
    {
        return number;
    }

}
