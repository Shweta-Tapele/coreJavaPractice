package com.learn.java8.functionalinterfaces.defaultmethods;

import java.util.function.Predicate;

public class PredicateTest {


    public static void main(String[] args)
    {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));
    }
}
