package com.learn.collections;

import java.util.Vector;

public class VectorDemo {


    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(10);
        v.addElement("Rudresh");
        System.out.println(v.get(1));
        System.out.println(v);
        v.removeElement("Rudresh");
        System.out.println(v);
        System.out.println(v.capacity());
        for(int i =0 ;i <10 ;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
    }
}
