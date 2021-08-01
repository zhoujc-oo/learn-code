package cn.zjc.test;

import java.util.EmptyStackException;
import java.util.Stack;

public class test {
    static void showpush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + ")");
        System.out.println("stack:" + st);
    }
    static void showpop(Stack<Integer> st){
        System.out.println("pop ->");
        Integer a = (Integer)st.pop();
        System.out.println(a);
        System.out.println("stack:" + st);
    }

    public void test(int x){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        s1.push(x);
        s2.push(x);
        int p1 = s1.peek();
        int p2 = s2.peek();
        System.out.println(p1==p2);
        System.out.println(s1.peek() == s2.peek());
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
