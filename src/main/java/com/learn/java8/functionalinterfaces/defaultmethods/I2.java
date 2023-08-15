package com.learn.java8.functionalinterfaces.defaultmethods;

public interface I2 {
    default String getGreeting() {
        return "Good Afternoon!";
    }
}
