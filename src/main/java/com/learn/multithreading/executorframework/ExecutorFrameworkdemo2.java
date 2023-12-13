package com.learn.multithreading.executorframework;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    int number;

    Task(int number)
    {
        this.number=number;
    }
    public void run(){
        System.out.println("Task" +number+"Has started");
        for(int i=number*100;i<=number*100+99;i++)
        {
            System.out.print(i);
        }
        System.out.println("Task" +number+"Has ended");
    }
}
public class ExecutorFrameworkdemo2 {
    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(2);
        service.execute(new Task(1));
        service.execute(new Task(2));
        service.execute(new Task(3));
        service.execute(new Task(4));

        service.shutdown();

    }
}
