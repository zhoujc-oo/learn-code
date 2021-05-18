package cn.zjc.OO;

public class StyPolymorphism {

        public static void main(String[] args) {

            //实例其子类对象.
            Woman woman = new Woman("女", "白");
            // 可以直接调用类的方法.
            System.out.println(woman.getSex());
            // 可以直接调用类的方法.
            System.out.println( woman.getColor());
        }
    }
    // 定义抽象类人
// abstact关键字用来定义抽象类

    abstract class humanity{
        private String sex;
        private String color;
        //方法
        public String getSex() {
            return sex;
        }
        //方法
        public String getColor() {
            return color;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
        public void setColor(String color) {
            this.color = color;
        }
        //构造方法
        humanity(String sex,String color){
            this.color=color;
            this.sex=sex;
        }
        //重写toString方法
        public String toString() {
            return("性别:"+this.sex+"肤色:"+this.color);
        }
    }
// 继承抽象类.woman类可以作为humanity类的一个对象,这就是向上转型.
    class Woman extends humanity{
    // 必须要有构造方法.
        Woman(String sex, String color) {
            super(sex, color);
        }
    }
   /** interface 操作符可以判断一个引用指向的对象是否是某一个类型或者其子类
    interface man{
    public void eat();
    public void work();
    public void play();
    }
    */
