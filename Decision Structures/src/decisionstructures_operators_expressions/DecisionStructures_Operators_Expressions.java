package decisionstructures_operators_expressions;

import javax.swing.*;

public class DecisionStructures_Operators_Expressions {
    public static void main(String[] args) {
        int number;
        String input;

        input= JOptionPane.showInputDialog("Please enter number: ");
        number= Integer.parseInt(input);

        if (number==5)
        {
            JOptionPane.showMessageDialog(null,"The number is exactly 5" );
        }
        



    }
}
