package cn.zjc.OO;


 class sty_extends {
    public static void main(String[] args) {
        Father father = new Father("爹", "工人");
        Son son = new Son("仔", "男", "程序员");
        System.out.println(father.getName());
        father.work();
        System.out.println(son.getName());
        son.work();
    }
}
// 构建父类
class Father{
    private String name;
    private String work;
    // 成员方法
    public String getName() {
        return name;
    }
    public String getWork() {
        return work;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWork(String work) {
        this.work = work;
    }
    //构造方法
    public  Father(String name,String work){
        this.work=work;
        this.name=name;
    }
    // 新增方法
    public void work(){
        System.out.println(this.work);
    }
}
// 构建子类
// 通过extends 继承父类

class Son extends Father{
     //添加新的属性

    private String sex;


    // 重写构造方法,属性继承了父类属性,还将新属性添加进去.
    public Son(String name, String sex,String work) {
        super(name, work);
        this.sex=sex;
    }
    // 直接调用父类的方法。
    public String getName() {
        return super.getName();
    }
    // 重写父类work方法
    public void work(){
        System.out.println("子类"+super.getName()+"的工作是:"); // 重写内容
        super.work();  // 直接调用父类方法.
    }
}