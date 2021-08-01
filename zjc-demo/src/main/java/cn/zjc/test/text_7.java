package cn.zjc.test;

public class text_7 {
    public static void main(String[] args) {

        //抽象类中的static方法可以直接调用。
        text_5.zhoua();
        text_3 zhou = new text_5();

        text_3 a = text_5.getInstance();
        a.zhouz();

        zhou.jia();
    }

    }
