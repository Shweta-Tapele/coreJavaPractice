package com.learn.collections.map;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args)
    {
        Hashtable h = new Hashtable();
        h.put(new Tempo(5),"A");
        h.put(new Tempo(6),"H");
        h.put(new Tempo(4),"D");
        h.put(new Tempo(23),"T");
        h.put(new Tempo(16),"W");
        h.put(new Tempo(56),"Q");

        System.out.println(h);
    }
}

class Tempo
{
     int i;
     Tempo(int i)
     {
         this.i = i;
     }
     public int hashCode()
    {
    return i;
    }
    public  String toString()
    {
        return i+" ";
    }
}
