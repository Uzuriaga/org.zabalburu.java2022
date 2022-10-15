/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.zabalburu.daw1.actividad13;

import javax.swing.JOptionPane;

/**
 *
 * @author ichueca
 */
public class Actividad13 {

    private static int amigos = 0;
    private static double bote = 0.0;

    private static final int BOTE_PERSONA = 10; // CONSTANTE

    public static void main(String[] args) {
        int opc;
        do {
            String resp = JOptionPane.showInputDialog(
                    "1. Añadir Amigos\n"
                    + "2. Nueva Aportación\n"
                    + "3. Pagar Ronda\n"
                    + "4. Quitar Amigos\n"
                    + "5. Salir\n\n"
                    + "Opción [1-5]");
            opc = Integer.parseInt(resp);
            switch (opc) {
                case 1:
                    añadirAmigos();
                    break;
                case 2:
                    nuevaAportacion();
                    break;
                case 3:
                    pagarRonda();
                    break;
                case 4:
                    quitarAmigos();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                    "La opción debe ser un valor entre 1 y 5",
                    "Opción Incorrecta",
                    JOptionPane.ERROR_MESSAGE);
            }
        } while (opc != 5);
    }

    private static void añadirAmigos() {
        String resp = JOptionPane.showInputDialog("Nº de Amigos a Añadir");
        int añadidos = Integer.parseInt(resp);

        if (bote == 0) {
            amigos += añadidos;
            bote = amigos * BOTE_PERSONA;
        } else {
            double botePagarNuevos = bote / amigos;
            bote = bote + añadidos * botePagarNuevos;
            amigos += añadidos;
        }

        /*if (amigos == 0) {
            bote = añadidos * BOTE_PERSONA;
        } else {
            if (bote == 0) {
                bote = amigos * BOTE_PERSONA;
            } else {
                double botePagarNuevos = bote / amigos;
                bote = bote + añadidos * botePagarNuevos;
            }
        }
        amigos += añadidos;*/
        JOptionPane.showMessageDialog(null,
                "Se han añadido " + añadidos + " amigos\n"
                + "Actualmente hay " + amigos + " amigos\n"
                + "El bote actual es de " + bote + "€");
    }

    private static void pagarRonda() {
        if (bote > 0) {
            String resp = JOptionPane.showInputDialog("Importe de la Ronda");
            double importe = Double.parseDouble(resp);
            if (importe > bote) {
                JOptionPane.showMessageDialog(null,
                        "No hay suficiente BOTE!. Sólo quedan " + bote + "€",
                        "No hay bote!!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                bote = bote - importe;
                JOptionPane.showMessageDialog(null,
                        "Después de Pagar la Ronda quedan " + bote + "€.");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay BOTE!",
                    "No hay bote!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void nuevaAportacion() {
        if (amigos > 0) {
            bote += amigos * BOTE_PERSONA;
            JOptionPane.showMessageDialog(null,
                    "Tras la Aportación hay " + bote + "€ en el bote!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay ningún amigo",
                    "No hay amigos!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void quitarAmigos() {
        if (amigos > 0) {
            String resp = JOptionPane.showInputDialog("Nº de Amigos que se Van");
            int quitados = Integer.parseInt(resp);
            if (quitados <= amigos) {
                if (bote > 0) {
                    double boteDevolver = bote / amigos;
                    bote = bote - boteDevolver * quitados;
                    JOptionPane.showMessageDialog(null,
                            "Hay que dar " + boteDevolver + "€ a cada uno\n"
                            + "Quedan " + bote + "€ en el bote.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No hay bote para devolver",
                            "No hay bote!!",
                            JOptionPane.ERROR_MESSAGE);
                }
                amigos = amigos - quitados;
                JOptionPane.showMessageDialog(null,
                        "Quedan " + amigos + " amigos");
            } else {
                JOptionPane.showMessageDialog(null,
                    "No hay TANTOS amigos. Hay " + amigos + " amigos",
                    "No hay amigos!!",
                    JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay ningún amigo",
                    "No hay amigos!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
