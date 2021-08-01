package cn.zjc.test;

public class text_5  extends text_3{

    public static void zhoua(){
        System.out.println("ajs");
    }

    public static text_3 getInstance(){
        return new text_5();
    }
    @Override
    public void jia() {
        System.out.println("ahsd");
    }
}



