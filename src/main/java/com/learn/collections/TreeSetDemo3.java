package com.learn.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args)
    {
        Set<Integer> t = new TreeSet<>(new ImplComparator());
        t.add(10);
        t.add(4);
        t.add(20);
        t.add(30);
        System.out.println(t);
    }
}


class ImplComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {

        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

        if(I1 < I2)
        {
            return +1;
        } else if (I1 > I2) {
            return - 1;

        }
        else
            return 0;

    }
}
