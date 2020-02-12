package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args)
    {
        String name1= JOptionPane.showInputDialog("Please enter name1: ");
        String name2= JOptionPane.showInputDialog("Please enter name2: ");
//
//        if(name1.equals(name2))
//        {
//            JOptionPane.showMessageDialog(null,"name1 is equal to name2!");
//        }
//        else
//            {
//                JOptionPane.showMessageDialog(null,"name1 is not equal to name2!");
//            }

        if (name1.compareTo(name2)==0)
        {
            JOptionPane.showMessageDialog(null,"name 1 is equal to name 2!");
        }
        if (name1.compareTo(name2)<0)
        {
            JOptionPane.showMessageDialog(null,"name 1 is first and name 2 second!");
        }
        if(name1.compareTo(name2)>0)
        {
            JOptionPane.showMessageDialog(null,"name 2 is first and name 1 is second!");
        }
        System.exit(0);
    }
}
