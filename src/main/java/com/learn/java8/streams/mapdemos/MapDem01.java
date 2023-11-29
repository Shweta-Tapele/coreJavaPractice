package com.learn.java8.streams.mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDem01 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bus","train", "plane");
        List<String> uppercaseVehicles = new ArrayList<>();


        uppercaseVehicles = vehicles.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseVehicles);
    }
}
