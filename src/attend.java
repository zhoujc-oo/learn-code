import java.util.Scanner;

public class attend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请问你是男的还是女的");

        String sex = in.nextLine();

        System.out.println("请问你跑多少米");

        int distance = in.nextInt();
        int i = 0;
        //int distance =(int)(Math.random() *5000);
        if(sex == "男"){
            System.out.println("你是女子组运动员");
        }else {
            System.out.println("你是男子组运动员");
        }
        if (distance >= 1000){
            System.out.println("你是长跑组");
        }else {
            System.out.println("你是短跑组");
        }
        System.out.println(distance);
    }
}
