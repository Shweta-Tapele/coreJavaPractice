/*in this example temp is not eligible for Gc as its associated with HashMap
* if we replace HashMap with WeakHashMap then temp eligible for gc*/


package com.learn.collections.map;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception
    {
        WeakHashMap m = new WeakHashMap<>();
        Temp t = new Temp();
        m.put(t,"Shweta");
        System.out.println(m);
        t=null;
        System.gc();
        System.out.println(m);

    }
}


class  Temp
{
    public String toString()
    {
        return  "temp";

    }
    public void finalize()
    {
        System.out.println("finalaize called");
    }
}