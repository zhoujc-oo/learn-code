package cn.zjc.Enum_;

import java.util.Scanner;

public class UseEnum {

    public static void main(String[] args) {

        for (Category category : Category.values()){
            System.out.println("----------" + category.getId() + "------------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }

        System.out.println();

        System.out.println(Category.valueOf("FOOD"));
//        System.out.println(Category.valueOf("food"));

        Scanner in = new Scanner(System.in);
        System.out.println("请输入枚举的名字:");
        String categoryName = in.next();
        Category enumInput = Category.valueOf(categoryName.trim().toUpperCase());
        System.out.println("枚举的信息" + enumInput.toString());

        System.out.println("请输入要比较的枚举名字:");
        String categoryName2 = in.next();
        Category enumInput2 = Category.valueOf(categoryName2.trim().toUpperCase());
        System.out.println("第二次输入枚举的信息：" + enumInput2.toString());


        System.out.println(enumInput == enumInput2);
    }

}
