package com.learn.multithreading.executorframework;

import java.util.concurrent.*;

class CallableTask implements Callable<String>
{

    private  String name;
    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return "Hello "+name;

    }
}
public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<String> stringFuture= service.submit(new CallableTask("Shweta"));
        System.out.println("Task completed");
        String welcomemessage= stringFuture.get();

        System.out.println("Welcome "+welcomemessage);

        service.shutdown();


    }
}
