/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import javax.swing.JOptionPane;

/**
 * Pedir tres números y mostrar cuál es el MENOR de los tres
 *
 * @author daw1
 */
public class Actividad3_Alternativas4 {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número ENTERO"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número ENTERO"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número ENTERO"));
        int menor;

       /* if (num1 < num2) {
            if (num1 < num3) {
                menor = num1;
            } else {
                menor = num3;
            }
        }else {
            if (num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }
        }*/
       
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        }else if (num2 < num3) {
            menor = num2;
        } else{
            menor = num3;
        }
        JOptionPane.showMessageDialog(null, "El menor es " + menor);

    }
}
