package com.password.test;

import javax.swing.*;

public class PasswordTester {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static void main(String[]args) {
        int condicion = 0;
        while (condicion != 1) {
            String contra = JOptionPane.showInputDialog("Password: ");
            JOptionPane.showMessageDialog(null, "Password Status: " + assesPassword(contra));

             condicion = JOptionPane.showOptionDialog(
                    null,
                    "Choose an option",
                    "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] { "Enter new password", "Exit" },   // null para YES, NO y CANCEL
                    "opcion 1");


        }

    }

    public static SecurityLevel assesPassword(String password){

        if (password.length()<8){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
