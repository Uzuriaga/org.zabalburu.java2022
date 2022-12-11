/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.zabalburu.actividad8;

import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Actividad8 {

    public static void main(String[] args) {

        do {
            Persona.numPersonas++;
            String nombre = JOptionPane.showInputDialog("Introduzca el nombre de la persona");
            //edad
            String resp = JOptionPane.showInputDialog("Introduzca la edad de la persona");
            int edad = Integer.parseInt(resp);
            //DNI
            String dni = JOptionPane.showInputDialog("Introduzca el DNI");
            //genero
            resp = JOptionPane.showInputDialog("Introduzca el genero \n\n"
                    + "[M] Para asignar Mujer\n"
                    + "[H] Para asignar Hombre\n"
                    + "[N] No binario\n");
            char genero = resp.charAt(0);
            //peso
            resp = JOptionPane.showInputDialog("Introduzca el peso");
            double peso = Double.parseDouble(resp);
            
            //Altura
             resp = JOptionPane.showInputDialog("Introduzca la Altura");
             double altura = Double.parseDouble(resp);
             
             
             //Crear la persona
             
             Persona persona = new Persona(nombre, edad, genero, peso, altura);
        } while (JOptionPane.showConfirmDialog(null,
                "Desea introducir otra Persona",
                "PREGUNTA",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
