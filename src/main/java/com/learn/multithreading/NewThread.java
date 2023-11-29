package com.learn.multithreading;

public class NewThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<=10;i++)
            {
                System.out.println("I am lazy thread");
                Thread.sleep(10000);
            }


        }catch(InterruptedException ie)
        {
            System.out.println("I got interrupted");
        }
    }
}
