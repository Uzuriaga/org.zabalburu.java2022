/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.activdad2_2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 * a.- Calcular el peso en libras de un hombre cuyo peso, en kg, se pedirá 
 * al usuario (NOTA : una libra equivale a 0,453592 kg.).
 */
public class Actividad2_2a {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte su peso (Kg)"));
        final double LIBRAKG = 0.453592;
        double equivale = peso * LIBRAKG;
        JOptionPane.showMessageDialog(null, "Su peso en Kg "+ peso + " equivale a " + df.format(equivale) +"lb");
        
    }
}
