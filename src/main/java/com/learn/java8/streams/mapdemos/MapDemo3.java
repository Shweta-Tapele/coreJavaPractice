package com.learn.java8.streams.mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,3,4,5,6);
        List<Integer> resultList = new ArrayList<>();

        //Before java 8

        /*for(int i :numberList)
        {
            resultList.add(i*3);
        }

        System.out.println(resultList);
    */


       // resultList = numberList.stream().map(i->i*3).collect(Collectors.toList());
        numberList.stream().map(i->i*3).forEach(System.out::println);
        //System.out.println(resultList);
    }
      }
