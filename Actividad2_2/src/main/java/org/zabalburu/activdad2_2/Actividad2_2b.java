/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.activdad2_2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * b.- Recoger dos valores enteros por teclado e imprimir su producto, su suma y
 * su media aritmética (incluyendo decimales)
 *
 * @author daw1
 */
public class Actividad2_2b {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        int valorUno = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el primer valor entero"));
        int valorDos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el segundo valor entero"));

        double producto = valorDos * valorUno;
        double suma = valorDos + valorUno;
        double media = (valorDos + valorUno) / 2;

        JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><tr><th>Resultados "
                + "</th></tr><tr><td>El valor de la multiplicación (producto)</td><td>" + producto + "</td></tr>"
                + "</tr><tr><td>El valor de la suma </td><td>" + suma + "</td></tr>"
                + "</tr><tr><td>El valor de la media</td><td>" + media + "</td></tr></table></html>");

        // JOptionPane.showMessageDialog(null, "El producto es =" + producto);
        // JOptionPane.showMessageDialog(null, "La suma de los dos números =" + suma);
        //  JOptionPane.showMessageDialog(null, "La media de los dos números  =" + media);
    }
}
