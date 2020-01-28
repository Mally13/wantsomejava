package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput
{
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner Keyboard= new Scanner(System.in);

        System.out.println( "Please enter the First Number:");
        firstNumber= Keyboard.nextInt();

        System.out.println("Please enter the Second Number: ");
        secondNumber= Keyboard.nextInt();

        double average=(firstNumber+ secondNumber)/2.0;

        System.out.println("The Average Is: " +average);

        String name;
        String surname;

        Keyboard.nextLine();
        System.out.println("Please enter your name:");
        name =Keyboard.nextLine();

        System.out.println("Please enter your surname:");
        surname=Keyboard.nextLine();
        System.out.println("Your name is: " +name +" "+surname);
    }
}
