package cn.zjc.geektime;

public class string {
    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";

// boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
        //创建字符串对象
        String s = "helloworld";

// int length():获取字符串的长度，其实也就是字符个数
        System.out.println(s.length());
        System.out.println("‐‐‐‐‐‐‐‐");

// String concat (String str):将将指定的字符串连接到该字符串的末尾.
        String i = "helloworld";
        String i2 = i.concat("**hello");
        System.out.println(s2);// helloworld**hello

// char charAt(int index):获取指定索引处的字符
        System.out.println(i.charAt(0));
        System.out.println(i.charAt(1));
        System.out.println("‐‐‐‐‐‐‐‐");

// int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
        System.out.println(i.indexOf("l"));
        System.out.println(i.indexOf("owo"));
        System.out.println(i.indexOf("ak"));
        System.out.println("‐‐‐‐‐‐‐‐");

// String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(i.substring(0));
        System.out.println(i.substring(5));
        System.out.println("‐‐‐‐‐‐‐‐");

// String substring(int start,int end):从start到end截取字符串。含start，不含end。
        //System.out.println(i.substring(0, i.length));
        System.out.println(i.substring(3,8));

        //创建字符串对象
        String j = "abcde";

// char[] toCharArray():把字符串转换为字符数组
        char[] chs = j.toCharArray();
        for(int x = 0; x < chs.length; x++) {
            System.out.println(chs[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

// byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes = j.getBytes();
        for(int x = 0; x < bytes.length; x++) {
            System.out.println(bytes[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

//world替换为WORLD
        String str = "hello world";
        String replace = str.replace("world", "WORLD");
        System.out.println(replace); // hello WORLD
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");


    }
}
