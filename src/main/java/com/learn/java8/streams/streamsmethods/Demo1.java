package com.learn.java8.streams.streamsmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Usuage of sorted element
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,5,1,8,3,9,4);
        List<Integer> result = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);


        List<String> list2 = Arrays.asList("John","Mary","Smith");
        List<String> result2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result2);

    }
}
