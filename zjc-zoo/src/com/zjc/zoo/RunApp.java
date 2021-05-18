package com.zjc.zoo;

import com.zjc.zoo.animal.Cat;
import com.zjc.zoo.animal.Dog;

public class RunApp {


    /**
     * 1. 正常运行
     * 2. 动物在表演
     * 3. 动物在这里生存
     */


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("www");
        dog.setAge(3);
        dog.setDogColour("yellow");
        dog.run();
        dog.cry();
        dog.cry(60);
        dog.cry(60, "tt");
      String result = dog.wagTail();
        System.out.println("狗摇尾巴的结果：" + result);

        Cat cat = new Cat();
        cat.setName("catA");
        cat.setAge(2);
        cat.run();
        cat.cry();
        cat.cry("汪汪汪");
    }
}
