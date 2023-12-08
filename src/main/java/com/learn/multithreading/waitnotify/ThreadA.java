package com.learn.multithreading.waitnotify;

public class ThreadA extends Thread{

    int total =0;

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("Child Thread starts execution");
            for (int i = 1; i <=100; i++) {
                total = total + i;
            }
            System.out.println("Child Thread gives notification");
            this.notify();
        }
    }
}


class ThreadB
{
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();
        synchronized (a)
        {
            System.out.println("Main thread trying to call wait method");
            a.wait();
            System.out.println("Main thread gets notification");
            System.out.println(a.total);

        }
    }
}