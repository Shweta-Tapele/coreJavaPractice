package com.learn.java8.lambdaexamples;

interface Shape{
    void draw();
}




/*
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method");
    }
}
*/
public class LambdaExample {
public static void main(String[] args)
{

    String str = "hello";

    Shape rectangle = () -> System.out.println("Rectangle  class");
    rectangle.draw();
    Shape square = () -> System.out.println("Square class : draw() method");
    square.draw();

    Shape circle = () -> System.out.println("Circle class : draw() method");
    circle.draw();
}
}



