package cn.zjc.test;

public class test1 {
    public static void main(String[] args) {
        String str = "askd,disj,sdj";
        String str1 = "sdhiadj";
        String a = "拼接后的字符串为";
        System.out.println(a+str+str1);

        String b = a.concat(str);
        System.out.println(b);


        //eauals比较两个字符串是否相等
        boolean boo = str.equals(str);
        System.out.println(boo);

        //返回字符串在此字符串中第一个索引
        int index = str.indexOf("s");
        System.out.println(index);

    }
}
