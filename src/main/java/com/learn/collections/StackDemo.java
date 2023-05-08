package com.learn.collections;
import  java.util.Stack;

public class StackDemo {
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        s.search("z");
        s.pop();
        System.out.println(s);
    }
}
