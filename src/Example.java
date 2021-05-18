public class Example {
    public static void main(String[] args) {
        int a = 66;
        int b = 99;
        int c = 88;
        if (a == b && b == c) {
            System.out.println("a,b和c都相等" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大值，为" + a);
                } else {
                    if (a == c) {
                        System.out.println("a和c都是最大值，为" + a);
                    } else {
                        System.out.println("c为最大值，为" + c);
                    }
                }
            } else {
                if (b > c) {
                    if (a == b) {
                        System.out.println("a,b一样大，为" + b);
                    } else {
                        System.out.println("b最大，为" + b);
                    }
                } else {
                    if (c == b) {
                        System.out.println("b,c最大，为" + c);
                    } else {
                        System.out.println("c最大，为" + c);
                    }
                }
            }
        }
    }
}




