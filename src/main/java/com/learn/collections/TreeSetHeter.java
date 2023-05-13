package com.learn.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetHeter {

        public static void main(String[] args)
        {
            Set t = new TreeSet<>(new MyComparator());
            t.add("A");
            t.add(new StringBuffer("BBBB"));
            t.add("BB");
            t.add(new StringBuffer("ABCDD"));
            t.add("A");
            t.add("XX");
            System.out.println(t);

        }

}

class MyComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        int l1= s1.length();
        int l2=s2.length();

        if(l1 < l2)
        {
            return -1;
        } else if (l1 > l2) {
            return +1;

        }
        else
           return s1.compareTo(s2);


    }
}