package com.learn.collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args)
    {
        LinkedList l= new LinkedList();
        l.add("shweta");
        l.add(18);
        l.add(null);
        l.add("shweta");
        System.out.println(l);
        l.set(0,"Tapele");
        System.out.println(l);
        l.add(0,"Sainz");
        l.removeLast();
        l.addFirst("miss");
        System.out.println(l);
    }
}
