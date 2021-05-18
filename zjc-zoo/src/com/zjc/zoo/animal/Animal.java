package com.zjc.zoo.animal;

import com.zjc.zoo.AnimalApi;

public class Animal implements AnimalApi {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println("动物跑步：" + name + ", " + age);
    }

    @Override
    public void run(int speed) {
        System.out.println("动物跑步：" + name + ", " + age + "," + speed);
    }

    public void cry() {
        System.out.println("动物叫");
        // 运行猫叫的音频文件
    }

    public void cry(int decibel) {
        System.out.println("动物叫");
        // 运行猫叫的音频文件
    }
}
