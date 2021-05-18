package cn.zjc.geektime;

public class LearnStringBuilder {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();

        long longVal = 123456789;

        strBuilder.append(true).append("abc").append(longVal);

        System.out.println(strBuilder.toString());
        System.out.println(strBuilder.reverse().toString());//reverse()反转
        System.out.println(strBuilder.toString());
        System.out.println(strBuilder.reverse().toString());//reverse()反转过后需要在reverse()才能回到原来的形式；
        System.out.println(strBuilder.toString());

        System.out.println(strBuilder.delete(0,4).toString());//(0,4)只会删除0，1，2，3

        System.out.println(strBuilder.insert(3,"LLLL").toString());
    }
}
