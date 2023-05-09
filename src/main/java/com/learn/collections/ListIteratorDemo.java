package com.learn.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args)
    {
        LinkedList l= new LinkedList<>();
        l.add("Manu");
        l.add("Leo");
        l.add("Lee");
        l.add("Manulee");


        ListIterator ltr = l.listIterator();
        while(ltr.hasNext())
        {
            String s = (String)ltr.next();
            if(s.equals("Manu"))
            {
                ltr.remove();
            } else if (s.equals("Leo")) {
                ltr.set("DarlinLeo");

            } else if (s.equals("Manulee")) {
                ltr.add("Boka, Kitty, Katty");
            }
            else
            {
                ltr.add("Manu");
            }

        }

        System.out.println(l);



    }
}
