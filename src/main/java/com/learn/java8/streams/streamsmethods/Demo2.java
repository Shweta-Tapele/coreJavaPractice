package com.learn.java8.streams.streamsmethods;

import java.util.HashSet;
import java.util.Set;

//anyMatch
//allMatch
//noneMatch
public class Demo2 {
    public static void main(String[] args) {


        Set<String> s = new HashSet<>();
        s.add("One apple");
        s.add("One banana");
        s.add("Two apple");
        s.add("Two banana");
        s.add("Three apple");


        boolean result = s.stream().anyMatch(value->
        {
            return value.startsWith("One");
        });
        System.out.println(result);


        result= s.stream().allMatch(value->
        {
            return value.startsWith("One");
        });
        System.out.println(result);


        result = s.stream().noneMatch(value->
        {
            return value.startsWith("One");
        });
        System.out.println(result);
    }
}
