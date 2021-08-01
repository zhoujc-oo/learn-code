package cn.zjc.code;

public class ingerit2 {
        public static void main(String[] args) {
            Person2 p = new Person2("小明", 12);
            Student s = new Student("小红", 20, 99);
            System.out.println(s.getName());
            //  定义PrimaryStudent，从Student继承，新增grade字段:
            Student ps = new PrimaryStudent("小军", 9, 100, 5);
            System.out.println(ps.getScore());
        }
    }

    class Person2 {
        protected String name;
        protected int age;

        // 构造函数
        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person2(){

        }

        public String getName() {
            return name;
        }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    class Student extends Person2 {
        protected int score;

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public Student() {
            super("name", 12);
        }

        public int getScore() { return score; }
    }


