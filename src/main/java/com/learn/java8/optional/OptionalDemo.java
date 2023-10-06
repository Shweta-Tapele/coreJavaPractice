package com.learn.java8.optional;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Optional;
import java.util.Map;

public class OptionalDemo {

    public static void main(String[] args) {


        String email =null;
        //of,empty, ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);


        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);




    }
}
