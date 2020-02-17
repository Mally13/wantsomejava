package com.example.arrays;

public class CompareArrays
{
    public static void main(String[] args)
    {
        int[] numbers1={2,3,4,5,67};
        int[] number2 = {2,3,4,5,6};

        boolean arraysEqual= true;
        int i =0;

        if (numbers1.length != number2.length)
        {
            arraysEqual=false;
        }
        while (arraysEqual && i< numbers1.length)
        {
            if (numbers1[i] != number2[i])
            {
                arraysEqual=false;
            }
            i++;
        }
        if (arraysEqual)
        {
            System.out.println("The arrays are equal");
        }
        else
        {
            System.out.println("The arrays are not equal");
        }

    }
}
