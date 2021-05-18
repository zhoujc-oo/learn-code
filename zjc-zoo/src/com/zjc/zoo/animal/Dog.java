package com.zjc.zoo.animal;

public class Dog extends Animal{

    private String dogColour;

    public String getDogColour() {
        return dogColour;
    }

    public void setDogColour(String dogColour) {
        this.dogColour = dogColour;
    }

    /**
     * 重写
     */
    public void cry() {
        System.out.println("狗叫");
    }

    /**
     * 重载
     * @param decibel
     */
    public void cry(int decibel) {

        System.out.println("狗叫" + decibel);
    }

    public void cry(String type) {
        System.out.println("狗怎么叫：" + type);
    }

    public void cry(int decibel, String type) {

        System.out.println("狗怎么叫" + decibel + ", " + type);
    }
    public void cry(int widh,boolean dwhik){
        System.out.println("汪汪汪"+dwhik);
    }

    public String wagTail() {
        System.out.println("狗摇尾巴");
        return "虱子";
    }

}
