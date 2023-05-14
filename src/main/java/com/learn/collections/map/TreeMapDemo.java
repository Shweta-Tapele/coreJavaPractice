/* Treemap allows keys as homogenous
* */
package com.learn.collections.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args)
    {
        TreeMap m = new TreeMap();
        m.put(100,"ZZZ");
        m.put(102,"YYY");
        m.put(101,"AAA");
        m.put(104,"UUU");
        m.put(107,"NNN");
        //m.put("FFFF","TTT");
        m.put(108,110);
       // m.put(null,"XXX");
        System.out.println(m);
    }
}
