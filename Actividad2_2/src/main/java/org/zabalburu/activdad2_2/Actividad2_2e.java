/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.activdad2_2;

import javax.swing.JOptionPane;

/**
 * e.- Recoger dos valores del teclado en dos variables diferentes, intercambiar
 * sus contenidos y finalmente visualizarlos.
 *
 * @author Junior
 */
public class Actividad2_2e {
   public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog("Introduza el primer valor entero");
        int num1 = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("Introduza el segundo valor entero");
        int num2 = Integer.parseInt(resp);
        double producto = num1 * num2;
        double suma = num1 + num2;
        double media = suma / 2;
        JOptionPane.showMessageDialog(null,
                num1 + " * " + num2 + " = " + producto + "\n" +
                num1 + " + " + num2 + " = " + suma + "\n" +
                "Media de " + num1 + " y " + num2 + " = " + media + "\n");
    }
    
}

