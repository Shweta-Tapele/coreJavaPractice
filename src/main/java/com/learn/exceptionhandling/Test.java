package com.learn.exceptionhandling;

public class Test {
    public static void main(String[] args) {
        dostuff();
        System.out.println(10/0);
    }
        public static void dostuff()
        {
            domorestuff();
            System.out.println("Hi");
        }


    private static void domorestuff() {
        
        System.out.println("Hello");
    }


}

