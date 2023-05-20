package com.learn.java8;


import java.util.*;

public class Collection_Lambda {
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(17);
        System.out.println(l);
        Comparator<Integer> c = (o1,o2) ->  (o1<o2)?-1:(o1>o2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);


    }


}

