package com.learn.collections;

import java.util.*;

public class CursorsDemo {
            public static  void main(String[] args)
            {
                Vector v = new Vector<>();
                Enumeration e = v.elements();
                ArrayList l = new ArrayList();
                Iterator itr = l.iterator();
                LinkedList ll = new LinkedList();
                ListIterator ltr = ll.listIterator();

                System.out.println(e.getClass().getName());
                System.out.println(itr.getClass().getName());
                System.out.println(ltr.getClass().getName());

            }



}

