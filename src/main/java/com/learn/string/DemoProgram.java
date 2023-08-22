package com.learn.string;

public class DemoProgram {
public static void main (String[] args)
{
    String str1 = "Hello";
    String str2 = "Hello";


    String str3 = new String("Hi");
    String str4 = new String("Hi");

    System.out.println(str4==str3);
    System.out.println(str4.equals(str3));


    //String concatenation
    StringBuilder sb = new StringBuilder();
    sb.append("Hello").append(" ").append("World");

    String str5 = sb.toString();
    System.out.println(str5);




}

}
