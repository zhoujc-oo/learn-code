package cn.zjc.learn;


public class RefArray {

    public static void zhoujiacheng(int a,String... args){

    }
    public static void Method(String name){

    }
    public static void main(String... args) {

        zhoujiacheng(1,"周","jia","成");
        Merchandise[] merchandises = new Merchandise[9];
        merchandises[0] = new Merchandise();
        merchandises[1] = new Merchandise();
        merchandises[2] = new Merchandise();
        merchandises[0].name = "笔记本";
        merchandises[1].name = "铅笔";
        merchandises[2].name = "ren";
        System.out.println(merchandises[0].name);
        System.out.println(merchandises[1].name);
        System.out.println(merchandises[2].name);

    }
}
