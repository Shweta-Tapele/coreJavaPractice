/**
 * This is a basic example of Streams used to just filter out arraylist of integer to list of even integers onlu
 */

/



package com.learn.stream;
import java.util.*;
import java.util.stream.*;
public class TestStream {

    public static void main(String[] args)
    {
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(10);
        arrl.add(47);
        arrl.add(23);
        arrl.add(70);
        arrl.add(100);

        System.out.println("arraylist is:"+arrl);
        List<Integer> l1 = arrl.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
        System.out.println(l1);

    }
}
