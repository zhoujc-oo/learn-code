package cn.zjc.unusual;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 如果系统不支持GBK编码，就会捕获UnsupportedEncodingException:
            // 打印异常的信息
            System.out.println(e);
            // 尝试使用用默认编码
            return s.getBytes();
        }
    }
}

