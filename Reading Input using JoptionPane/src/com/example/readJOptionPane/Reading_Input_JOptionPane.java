package com.example.readJOptionPane;

import javax.swing.*;

public class Reading_Input_JOptionPane
{
    public static void main(String[] args) {
        String name;
        String surname;

        name= JOptionPane.showInputDialog("Please enter your name: ");
        surname=JOptionPane.showInputDialog("Please enter your surname:");

        JOptionPane.showMessageDialog(null,name+ "" +surname);

        int firstNumber;
        int secondNumber;
        String input;

        input= JOptionPane.showInputDialog("Please enter the first Number: ");
        firstNumber= Integer.parseInt(input);
        input= JOptionPane.showInputDialog("Please enter the second number: ");
        secondNumber= Integer.parseInt(input);+
        double average=(firstNumber+ secondNumber)/2.0;

        JOptionPane.showMessageDialog(null,average);
    }
}
