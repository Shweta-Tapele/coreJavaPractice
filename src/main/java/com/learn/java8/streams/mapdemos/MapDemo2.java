package com.learn.java8.streams.mapdemos;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car","bicycle");


        //before java 8 w/o using streams
     /*   for(String c:vehicles)
        {
            System.out.println(c.length());
        }
      */
        vehicles.stream().map(vname->vname.length()).forEach(len-> System.out.println(len));
    }
}
