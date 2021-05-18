package cn.zjc.test;

public class Student {
        int sno;
        String name;
        int age;
        int grade;

        @Override
        public String toString () {
            return "Student{" + "sno=" + sno + ", name='" + name + '\'' + ", age=" + age + ", grade=" + grade + '}';
        }


    }
