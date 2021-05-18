import java.util.Scanner;

public class attend1 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
        Scanner in = new Scanner(System.in);

        System.out.println("今天星期几？");

        int week = in.nextInt();

        int zhou = week;
        switch (zhou) {
            case 1:
                System.out.println("吃饭");
                break;
            case 2:
                System.out.println("吃饭2");
                break;
            case 3:
                System.out.println("吃饭3");
                break;
            case 4:
                System.out.println("吃饭4");
                break;
            case 5:
                System.out.println("吃饭5");
                break;
            case 6:
                System.out.println("吃饭6");
                break;
            case 7:
                System.out.println("吃饭7");
                break;
        }
        }
    }
}
