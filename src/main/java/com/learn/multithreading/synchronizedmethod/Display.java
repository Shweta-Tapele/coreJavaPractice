package com.learn.multithreading.synchronizedmethod;

public class Display {
    public static synchronized void wish(String s)
    {
        try {
            for (int i = 0; i < 10; i++) {


                Thread.sleep(2000);
                System.out.println("Good morning" + s);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread extends Thread{

    Display d;
    String s;

    MyThread(Display d, String s)
    {
        this.d=d;
        this.s=s;
    }
    @Override
    public void run() {
        d.wish(s);
    }
}


class SynchronizedDemo
{
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread t1 = new MyThread(d1,"Shweta");
        MyThread t2 = new MyThread(d1, "Sainz");
        t1.start();
        t2.start();
    }

}