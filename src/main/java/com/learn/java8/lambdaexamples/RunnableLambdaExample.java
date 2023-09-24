package com.learn.java8.lambdaexamples;


class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method ccalled");
    }
}


public class RunnableLambdaExample {


    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();


        //Runnable runnable = ()->System.out.println("run method called using Lambda");

        Thread threadLambda = new Thread(()->System.out.println("run method called using Lambda"));
        threadLambda.start();
    }
}
