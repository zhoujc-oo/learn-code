package cn.zjc.filesIO;

import java.io.*;

/**
 * 所有使用的服务器在不需要或者不用时都需要及时关闭
 * 所有代码中所写的服务器都要写关闭语句
 * */

public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {

        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        //构造FileOutputStream的对象，如果文件不存在的话会自动新建；

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        //构造OutputStreamWriter的对象，参数可以指定编码默认为操作系统编码，writer上是gbk；

        writer.append("输入中文");
        //写入到缓冲区；

        writer.append("\r\n");
        //换行；

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip,"utf-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
          //  sb.append((char) reader.ready());
            // 转成char加到StringBuffer对象中

        }

        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源

    }
}
