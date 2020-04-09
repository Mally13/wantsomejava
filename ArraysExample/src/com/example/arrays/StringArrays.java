package com.example.arrays;

public class StringArrays {
    public static void main(String[] args) {
        String[] names = getNames();

        for (int i = 0; i < names.length; i++) {
            if(names[i] !=null) {
                System.out.println(names[i].charAt(0));
            }
        }

    }

    public static String[] getNames() {
        String[] names = new String[6];

        names[0] = "John";
        names[1] = "Paul";
        names[2] = "Peter";
        names[3] = "Simon";
        names[4] = "Chuck";

        return names;

    }
}