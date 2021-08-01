public class SimpleFor {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        int c = 0;
        for(int i = 0;i<100 && c<10;i++) {
            if (a % b == 0) {
                System.out.println(a+"可以整除"+b+"商为"+a/b);
                c++;
            }
            b++;
        }
    }
}
