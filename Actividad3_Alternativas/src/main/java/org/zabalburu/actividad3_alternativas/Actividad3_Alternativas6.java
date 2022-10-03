/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import javax.swing.JOptionPane;

/**
 * 6.Perdir al usuario el dia de la semana como un número de 1 a 7 (Lunes a
 * Domingo) y mostrar una cadena con el nombre de dicho dia
 *
 * @author Junior
 */
public class Actividad3_Alternativas6 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Inserte un día de la semana (Entero) "));
        if (dia < 1 || dia > 7) {
            JOptionPane.showMessageDialog(null, "El día debe ser un valor entre 1 y 7", "Día erroneo", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombredia;
            switch (dia) {
                case 1:
                    nombredia = "Lunes";
                    break;
                case 2:
                    nombredia = "Martes";
                    break;
                case 3:
                    nombredia = "Miércoles";
                    break;
                case 4:
                    nombredia = "Jueves";
                    break;
                case 5:
                    nombredia = "Viernes";
                    break;
                case 6:
                    nombredia = "Sábado";
                    break;
                default:
                    nombredia = "Domingo";

            }
            JOptionPane.showMessageDialog(null, "El día de la semana es: " + nombredia);
        }
    }
}
