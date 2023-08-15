package com.learn.java8.functionalinterfaces.defaultmethods;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Child implements  I1,I2{

    @Override
    public String getGreeting()
    {
        return I1.super.getGreeting();
    }
    public static void main(String[] args)
    {
        System.out.println(new Child().getGreeting());
    }
}
