package com.learn.java8.streams.filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shweta","sansa", "John", "Daenerys");
        List<String> longnames = new ArrayList<>();


        longnames=
        names.stream().filter(s->s.length()>6 && s.length()<8).collect(Collectors.toList());

        System.out.println(longnames);
    }
}
