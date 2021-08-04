package cn.zjc.test;

public class text_8 {
    public static void main(String[] args) {
        Person ming = new Person("周嘉城",18);
        Person hong = new Person("周志刚",26);

        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);

    }
}
class Person{
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
}
