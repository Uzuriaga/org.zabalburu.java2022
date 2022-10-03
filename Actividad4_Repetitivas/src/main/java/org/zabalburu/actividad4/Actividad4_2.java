/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad4;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Actividad4_2 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número inicial"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número final"));

        for (int i = num1; i <= num2; i++) {
            System.out.println("----TABLA DEL " + i + "-----");
            for (int j = 1; j <= 9; j++) {

                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }

    }
}
