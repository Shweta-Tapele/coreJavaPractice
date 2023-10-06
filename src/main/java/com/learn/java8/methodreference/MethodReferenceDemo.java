package com.learn.java8.methodreference;

public class MethodReferenceDemo {

    public static void m1()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
        Runnable r = MethodReferenceDemo::m1;
        //Here we can replace the lambda expression by refering the method which is already implemented by using Class name and "::" method name
    //The target method can be static/ instance method. We need to follow if its instance use the instance of the class , if its static method then directly class name can be used
    //but only rule is that different arguments type is not allowed in method reference

                /*() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };*/



        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread");
        }


    }
}
