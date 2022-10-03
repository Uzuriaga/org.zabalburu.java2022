/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * En un bar cobran cada pintxo a 2.25€ pero si se piden más de 5 pinchos se
 * aplica un descuento del 5% sobre el precio total y si piden más de 10 el
 * descuento será del 10%. Diseñar un programa que pida cuántos pintxos ha
 * pedido un determinado cliente y muestre su precio final (indicando, en su
 * caso, el descuento a aplicado en porcentaje y en total)
 *
 * @author daw1
 */
public class Actividad3_Alternativas3 {

    public static void main(String[] args) {
        double pintxo = 2.25;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de pinxtos"));
        double pintxoCantidad = cantidad * pintxo;

        DecimalFormat df = new DecimalFormat("#.00");
        final double DESCUENTO_CINCO = 0.05;
        final double DESCUENTO_DIEZ = 0.10;

        if (cantidad > 5) {
            JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><th>Total a pagar</th><tr><td>" + df.format(pintxoCantidad - (pintxoCantidad * DESCUENTO_CINCO)) +"€</td></tr></table></html>");
        } else if (cantidad > 10) {
            JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><th>Total a pagar</th><tr><td>" + df.format(pintxoCantidad - (pintxoCantidad * DESCUENTO_DIEZ)) +"€</td></tr></table></html>");
        } else {
            JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><th>Total a pagar</th><tr><td>" + df.format(pintxoCantidad) +"€</td></tr></table></html>");
        }

    }
}
