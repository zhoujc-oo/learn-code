package cn.zjc.code;

public class privatefield {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);

        System.out.println(ming.getName() + "," + ming.getAge());
    }
}
//使用方法method来让外部代码也可以修改field
class Person{
    private String name;
    private int age;

    public Person(String 小明, int i) {
    }

    public Person() {

    }

    public String getName() {
        return this.name;

    }
    public void setName(String name){
        this.name= name;
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();//去除首位空格
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

}