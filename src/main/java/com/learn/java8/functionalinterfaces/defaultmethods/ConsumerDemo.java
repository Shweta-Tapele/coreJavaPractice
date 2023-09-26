package com.learn.java8.functionalinterfaces.defaultmethods;


import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{



    @Override
    public void accept(String o) {
        System.out.println(o);
    }
}


public class ConsumerDemo
{
    public static void main(String[] args) {
        Consumer<String> con = new ConsumerImpl();
     con.accept("Hello");
    }


}
