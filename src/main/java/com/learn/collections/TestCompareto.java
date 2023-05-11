package com.learn.collections;

public class TestCompareto {

    public static void main(String[] args)
    {
        System.out.println("A".compareTo("B")); //-ve
        System.out.println("B".compareTo("A")); //+ve
        System.out.println("A".compareTo("A")); //0
        System.out.println("A".compareTo(null));// Exception
    }


}
