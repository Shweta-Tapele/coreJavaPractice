package com.learn.multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
       // ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(new Task1());
        service.execute(new Task2());
        for(int i=200;i<299;i++)
        {
            System.out.println(i);
        }
        System.out.println("Task3 completed");
        System.out.println("Main completed");
        service.shutdown();
    }
}
class Task1 extends Thread{
    @Override
    public void run() {
        for(int i=101;i<199;i++)
        {
            System.out.print(i);
            System.out.println("Task1 Done");
        }
    }
}


class Task2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<99;i++)
        {
            System.out.print(i);
            System.out.println("Task2 Done");
        }
    }
}

