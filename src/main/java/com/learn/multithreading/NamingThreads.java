package com.learn.multithreading;

public class NamingThreads extends Thread{


}

class Test
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        NamingThreads n = new NamingThreads();
        System.out.println(n.getName());
        Thread.currentThread().setName("Carlos Sainz");
        System.out.println(Thread.currentThread().getName());

    }
}