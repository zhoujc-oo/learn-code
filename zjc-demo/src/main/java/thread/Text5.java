package thread;

import java.util.Arrays;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/7/30
 */
public class Text5 {

//    List <String> list = new ArrayList<String>();
//    list.add("Hello");
//    list.add("World");
//
//    String first = list.get(0);
//    String second = list.get(1);

    public static void main(String[] args){
        Person[] ps =new Person[]{
                new Person("Bob",61),
                new Person("Alice",88),
                new Person("Lily",75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name,int score){
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
//    Person String toString(){
//        return this.name + "," + this.score;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

