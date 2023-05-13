package com.learn.collections;

import java.util.HashMap;
import java.util.*;

public class HashMapDemo {


    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        hm.put("Anne",1000);
        hm.put("Tom",300);
        hm.put("Lee",400);
        System.out.println(hm);

        hm.put("Anne",2000);
        System.out.println(hm);
        Set s = hm.keySet();
        System.out.println(s);
        Collection c = hm.values();
        System.out.println(c);
        Set s1=hm.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+ m1.getValue());
            if(m1.getKey().equals("Anne")){
                m1.setValue(1500);
            }
        }
        System.out.println(hm);
    }
}
