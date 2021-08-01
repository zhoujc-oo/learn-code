package cn.zjc.test;


public class Main{
    public static void main(String[] args) {
        PersoneTest p = new StudentTest("Xiao Ming");
        p.run();
    }
}

interface PersoneTest {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class StudentTest implements PersoneTest {
    private final String name;

    public StudentTest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

