import java.util.Scanner;

public class ReadStringAndIntFromCosole {
    public static void main(String[] args) {
        //创建Scanner来读取用户的键盘输入dwhu
        Scanner in = new Scanner(System.in);

        System.out.println("请问你的名字是?");

        String str = in.nextLine();

        System.out.println(str+",你好");

        System.out.println("那么请问你几岁了呢？");

        int age = in.nextInt();

        System.out.println("好的，"+str+age+"岁了。");
    }
}
