package cn.zjc.filesIO;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //这里修改自己的测试目录；
        File folder = new File("/tmp/java");
        deleteFolder(folder);
    }

    //删除文件及目录
     public static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        if(files != null){
            for (File f :files){
                if (f.isDirectory()){
                    deleteFolder(f);
                }else{
                    f.delete();
                }
            }
        }
        folder.delete();
     }
}
