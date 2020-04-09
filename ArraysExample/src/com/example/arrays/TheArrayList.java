package com.example.arrays;

import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args)
    {
//        Standard java arrays are of fixed length. after arrays are created,
//        they cannot grow or shrink, which means you must know in advance
//        how many elements an array will hold.
//
//
//        Array lists are created with an initial size. When that size is
//        exceeded the collection is automatically enlarged. When objects
//        are removed the array may be shrunk

        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");
        names.add("Peter");
        names.add("Jake");
        names.add(3,"Paul");// this will shift and replace Jake to another position
        names.set(1, "Peters");

        names.remove(0);

        for (int i=0; i< names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
