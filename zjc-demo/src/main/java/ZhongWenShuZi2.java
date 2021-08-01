import java.util.Scanner;

public class ZhongWenShuZi2 {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("请输入你想找到的数字：");
        n =in.nextInt();
        String str=n+"对应的中文数字是：";
        //循环语句switch
        switch (n){
            case 1:
                str +="壹";
                break;
            case 2:
                str +="贰";
                break;
            case 3:
                str +="叁";
                break;
            case 4:
                str +="肆";
                break;
            case 5:
                str +="伍";
                break;
            case 6:
                str +="陆";
                break;
            case 7:
                str +="柒";
                break;
            case 8:
                str +="捌";
                break;
            case 9:
                str +="玖";
                break;
            default:
                System.out.println("错误的值"+n+".值需要大于等于1，小于等于9.");
        }
        System.out.println(str);
    }
}
