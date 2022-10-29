/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.activdad2_2;

import javax.swing.JOptionPane;

/**
 * c.- Recoger por teclado los siguientes datos correspondientes a un
 * trabajador:
 *
 * Horas trabajadas Salario por hora Porcentaje a descontar del salario en
 * concepto de impuesto (4 à 4%)
 *
 * Una vez recogidos estos datos, se visualizará el salario bruto (salario hora
 * multiplicado por las horas trabajadas) , los impuestos que debe pagar el
 * trabajador (aplicados al salario bruto) y el sueldo neto (salario bruto menos
 * impuestos).
 *
 * @author daw1
 */
public class Actividad2_2c {

    public static void main(String[] args) {
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de horas trabajadas"));
        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el salario por hora de trabajo"));
        double descuento = Double.parseDouble(JOptionPane.showInputDialog(null, "Porcentaje a descontar"));
        double salarioBruto = horasTrabajadas * salarioHora;
        double impuestos = (salarioBruto * (descuento/100));
        double salarioNeto = salarioBruto - impuestos;

        JOptionPane.showMessageDialog(null, "<html><table bgcolor='white' border=1 width='300px'><tr><th>Resultados "
                + "</th></tr><tr><td>Salario bruto</td><td>" + salarioBruto + "</td></tr>"
                + "</tr><tr><td>Impuestos a pagar </td><td>" + impuestos + "</td></tr>"
                + "</tr><tr><td>Salario neto</td><td>" + salarioNeto + "</td></tr></table></html>");
    }
}
