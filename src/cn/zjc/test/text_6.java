package cn.zjc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class text_6 {
        public static void main(String[] args) {

            int i=1;
            int max, min;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入整数或输入0完成输入：");
            /**Scanner in = new Scanner(System.in);
            in.nextInt();**/
            try {

                i= Integer.parseInt(br.readLine().trim());

            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            max=i;
            min=i;
            while(i!= 0){
                try {
                    Scanner io = new Scanner(System.in);
                    System.out.println("请输入整数：");
                    i= Integer.parseInt(br.readLine().trim());

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if(i>max && i !=0){
                    max = i;
                }
                if(i<min && i !=0){
                    min = i;
                }
            }
            System.out.println("最大为："+max+"最小为："+min);
        }
    }

