package com.learn.collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args)
    {
        HashSet h = new HashSet();
        h.add("A");
        h.add("B");
        h.add("Z");
        System.out.println(h.add("A"));
        System.out.println(h);
    }
}
