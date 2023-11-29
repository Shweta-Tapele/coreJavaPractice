package com.learn.multithreading;

public class ThreadInterruptDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
       // nt.interrupt();
        for(int i=0;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
