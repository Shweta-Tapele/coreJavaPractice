package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> marks  = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        System.out.println(marks);
        //long noofFailedstudents = marks.stream().filter(m->m<35).count();
        List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

        //Our own customized sorting
        //List<Integer> l1 = marks.stream().sorted(  )
    }

}
