package com.learn.string;

public class Case7 {

    public static void main(String[] args) {
        String s1= new String("You cannot change me");
        String s2= new String("you cannot change me");
        System.out.println(s1==s2);//false

        String s3= "You cannot change me";
        System.out.println(s1==s3 );//false

        String s4= "You cannot change me";
        System.out.println(s3==s4);//true


        String s5= "You cannot "+"change me";
        System.out.println(s5==s4);//true


        String s6 = "You cannot ";
        String s7 = s6+"change me";
        System.out.println(s7==s4);//false

        final String s8 ="You cannot ";
        String s9 = s8+"change me";
        System.out.println(s4==s9);



    }
}
