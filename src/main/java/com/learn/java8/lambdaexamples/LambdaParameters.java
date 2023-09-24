package com.learn.java8.lambdaexamples;


interface Addable{
    int addition(int a, int b);
}


class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaParameters {
    public static void main(String[] args) {
        Addable add = ( a, b) ->(a+b);
        System.out.println(add.addition(10,20));
    }
}
