/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.actividad4_repetitivas.ciclos;

import javax.swing.JOptionPane;

/**
 *1. Pedir al usuario un número y mostrar su tabla de multiplicar. Por ejemplo, para el número 5 la salida debería ser:
5 x 1 : 5
5 x 2 : 10
...
5 x 9 : 45
5 x 10 : 50
 * @author Junior
 */
public class Actividad4_1dowhile {

    public static void main(String[] args) {

        int cont = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        /*for (int j = 1; j <= 10; j++) {
            JOptionPane.showMessageDialog(null, num+" x "+  j + "=" + num*j );
        }*/
        /*while (cont <= 10) {
            int total = num * cont;
            System.out.println( num + "x" + cont + "=" + total );
            cont++;
        }

    */
        do {
            int total = num * cont;
            System.out.println( num + "x" + cont + "=" + total );
            cont++;
        } while (cont <=10);
    }
}
