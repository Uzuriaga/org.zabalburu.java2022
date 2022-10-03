/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Actividad3_Alternativas1 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo número"));

        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Son iguales");

        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El mayor es " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es " + num2);
        }
    }
    }

