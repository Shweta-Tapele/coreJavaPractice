/*The following code demonstrates how to sort StringBuffer using Comparator as it doesnt have natural sorting order aka does not implement Comparable interface
* */


package com.learn.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetStringBuffer {
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new OneComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("S"));
        t.add(new StringBuffer("R"));
        System.out.println(t);

    }
}


class OneComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1); // Descending order
        //return s1.compareTo(s2); Ascending order


    }
}