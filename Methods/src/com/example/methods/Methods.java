package com.example.methods;

public class Methods
{
    public static void main(String[] args)
    {
        /*
        //void method
        System.out.println("This is a void method!");
        //A value returning method
        int number=Integer.parseInt("700");

         */
        printAverage(20,30);
        double average= getAverage(30,30);
        System.out.println("Average: "+ average);


        String fullName =fullName("John", "Rambo");
        System.out.println("Average: " +fullName);

        int value = 40;
        if (isValid(value))
        {
            System.out.println("The value is in range");
        }
        else
        {
            System.out.println("The value is invalid");
        }

    }

    /**
     * This method prints the average of two numbers
     * @param val1 the first value
     * @param val2 the second value
     */
    public static void printAverage(int val1, int val2)
    {
        double average= (val1+ val2)/2.0;
        System.out.println("Average: " +average);
    }

    /**
     * This method calculates the average and returns it
     * @param val1 The first value
     * @param val2 the  second value
     * @return The average
     */
    public static double getAverage(int val1, int val2)
    {
        return (val1 + val2)/ 2.0;
    }
    public static String fullName(String name,String surname)
    {
       return name + " " +surname;
    }
    public static boolean isValid(int number)
    {

        return (number >=1 && number <=100);
    }
}
