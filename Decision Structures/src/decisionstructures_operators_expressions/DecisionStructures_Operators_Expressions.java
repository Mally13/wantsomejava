package decisionstructures_operators_expressions;

import javax.swing.*;

public class DecisionStructures_Operators_Expressions {
    public static void main(String[] args) {
        int number;
        String input;

        input= JOptionPane.showInputDialog("Please enter mark: ");
        number= Integer.parseInt(input);

/*
        if (number==5) {
            JOptionPane.showMessageDialog(null, "The number is exactly 5!");
        }
        else if(number>10)
        {
         JOptionPane.showMessageDialog(null,"The number is greater than 10!");
        }
        else if(number> 5)
        {
            JOptionPane.showMessageDialog(null,"The number is greater than 5!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The number is less than 5!");
        }

 */
        if (number< 50 && number>=45)//failed
        {
                JOptionPane.showMessageDialog(null, "You can write re-assesment!");
        }
        else if(number < 45)
                {
                JOptionPane.showMessageDialog(null, "You Failed!");
                }
        else
        {
            if (number >=75)
            {
                JOptionPane.showMessageDialog(null, "You have a distinction!");
            }
            else
                {
                    JOptionPane.showMessageDialog(null,"You Passed!");
                }
                            System.exit(0);
                }
    }
}
