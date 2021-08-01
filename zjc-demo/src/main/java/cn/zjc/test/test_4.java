package cn.zjc.test;

public class test_4 {
    private String address;
    private int age;
    private String name;
    private int son;
    private String phone;


boolean flag;
    public void text_3(){
        this.address = "望城";
        this.age = 10;
        this.name = "王炜";
        this.son = 1;
        this.phone = "123456";
        flag = false;

        System.out.println("性别" + son + "名字" + name + "年龄" + age + "电话" + phone + "地址" + address
        + (flag == true? "有朋友" : "没有朋友"));

    }
    public void zou(String name){

        System.out.println("朋友的名字" + name);
    }

}
