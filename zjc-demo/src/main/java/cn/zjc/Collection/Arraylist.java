package cn.zjc.Collection;

import java.util.*;

//ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
public class Arraylist{
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        // 第一种，For-Each 遍历 List
        for(int i=0;i<list.size();i++) {
            System.out.println(i);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++)
        {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }
}