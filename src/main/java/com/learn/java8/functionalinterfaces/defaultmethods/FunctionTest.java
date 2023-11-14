package com.learn.java8.functionalinterfaces.defaultmethods;
import java.util.function.*;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(10));

    }
}
