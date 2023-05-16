package com.learn.collections.utilityclasses;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

    public static  void main(String[] args){
        int a[] = {10,24,5,34,21,9};
        System.out.println("Arrays before sorting");
        for(int a1 : a)
        {
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,10));
        System.out.println("Arrays after sorting");
        for(int a1 : a)
        {
            System.out.println(a1);
        }

        String[]  s ={"A", "N", "X", "W" };
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"N"));
        System.out.println(Arrays.binarySearch(s,"H"));
        System.out.println("Arrays before sorting");
        for(String s1 : s)
        {
            System.out.println(s1);
        }
        Arrays.sort(s);
        System.out.println("Arrays after sorting");
        for(String s1 : s)
        {
            System.out.println(s1);
        }
        System.out.println("Arrays before sorting");
        for(String s2 : s)
        {
            System.out.println(s2);
        }
        Arrays.sort(s, new MyComparator1());
        System.out.println(Arrays.binarySearch(s,"T",new MyComparator1()));
        System.out.println("Arrays after sorting");
        for(String s2 : s)
        {
            System.out.println(s2);
        }
    }




}


class MyComparator1 implements  Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}