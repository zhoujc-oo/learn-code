package cn.zjc.test;

public class School {
    public void zs(){
        System.out.println("学校开始招生");
    }

    public  void zs1(String[] sname){
        for (int i = 0; i<sname.length; i++){
            System.out.println(sname[i] + "学校开始招生");
        }
    }
}
