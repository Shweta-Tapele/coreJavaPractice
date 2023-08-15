package com.learn.java8.functionalinterfaces.defaultmethods;

public interface I1 {
    default String getGreeting() {
        return "Good Morning!";
    }
}
