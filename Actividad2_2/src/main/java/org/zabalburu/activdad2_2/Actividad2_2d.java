/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.activdad2_2;

import javax.swing.JOptionPane;

/**
 * d.- Recoger del teclado un precio y unas unidades y visualizar el importe
 * correspondiente sin incluir el IVA, el IVA (21%) y el importe total IVA
 * incluido. NOTA: Definir el IVA como una constante
 *
 * @author Junior
 */
public class Actividad2_2d {

    public static void main(String[] args) {
        int unidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de unidades"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el precio"));
        final double IVA = 1.21;
        double importe = valor * unidades;
        double precioIVA = IVA * importe;
        
         JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><tr><th>Resultados "
                + "</th></tr><tr><td>Unidades</td><td>" + unidades + "</td></tr>"
                + "</tr><tr><td>Importe </td><td>" + importe + "</td></tr>"
                + "</tr><tr><td>Precio mas IVA</td><td>" + precioIVA + "</td></tr></table></html>");
    }
}
