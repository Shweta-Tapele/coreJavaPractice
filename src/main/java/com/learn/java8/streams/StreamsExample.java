package com.learn.java8.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsExample {


    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(30);
        marks.add(45);

        System.out.println(marks);

        long  noOfFailedStudents = marks.stream().filter(i->i<35).count();
        System.out.println(noOfFailedStudents);
    }
}
