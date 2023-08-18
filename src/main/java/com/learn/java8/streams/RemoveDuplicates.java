package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("Java", "SpringBoot", "KAFKA", "Java", "AWS");

        //Removing duplicates using Java 8 streams

        List<String> resultList = list.stream()//to get sequential stream
                .distinct()//to get unique elements
                .collect(Collectors.toList());


        System.out.println(list);
        System.out.println(resultList);
    }
}
