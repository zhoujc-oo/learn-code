package com.zjc.zoo.animal;

public class Cat extends Animal{

    /**
     * 猫叫
     */
    public void cry() {
        System.out.println("猫叫了一声");
        // 运行猫叫的音频文件
    }

    public void cry(String decibel){
        System.out.println("猫这么叫"+decibel);

    }

    public void eatFish() {

    }

}
