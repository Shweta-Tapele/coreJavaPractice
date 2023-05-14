package com.learn.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
            public static void main(String[] args)
            {
                TreeMap m = new TreeMap(new MyComparator());
                m.put("AAA",100);
                m.put("BBB",101);
                m.put("CCC",102);
                m.put("DDD",103);
                m.put("EEE",104);
                System.out.println(m);
            }

}

class MyComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
