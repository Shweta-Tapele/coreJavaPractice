package com.learn.java8.streams.filterdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(40);

        numberList.add(30);
        numberList.add(70);
        numberList.add(80);

        List<Integer> even= new ArrayList<>();
       /* for(int i :numberList)
        {
            if(i%2==0)
            {
                even.add(i);
            }
        }*/
        //even= numberList.stream().filter(i->i%2==0).collect(Collectors.toList());
        //System.out.println(even);
        numberList.stream().filter(i->i%2==0).forEach(System.out::println);

    }
}
