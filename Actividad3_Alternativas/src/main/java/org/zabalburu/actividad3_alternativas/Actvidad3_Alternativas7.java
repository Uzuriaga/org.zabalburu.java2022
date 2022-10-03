/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Actvidad3_Alternativas7 {
        public static void main(String[] args) {
        final double COSTE_NORMAL = 1.5;
        final double COSTE_EXPRESS = 2.0;
        final double COSTE_RAPIDO = 4.0;
        double costeKg;
        String tipoEnvioTexto;
        String resp = JOptionPane.showInputDialog(
                "Tipo de Envío\n" +
                "------------------\n\n" +
                "1. Normal\n" +
                "2. Expréss\n" +
                "3. Rápido\n\n" +
                "Opción [1-3] :");
        int tipoEnvio = Integer.parseInt(resp);
        switch (tipoEnvio) {
            case 1:
                costeKg = COSTE_NORMAL;
                tipoEnvioTexto = "Envío Normal";
                break;
            case 2:
                tipoEnvioTexto = "Envío Express";
                costeKg = COSTE_EXPRESS;
                break;
            default:
                tipoEnvioTexto = "Envío Rápido";
                costeKg = COSTE_RAPIDO;
                break;
        }
        resp = JOptionPane.showInputDialog("Kg. Envío");
        double kg = Double.parseDouble(resp);
        double importe = kg * costeKg;
        System.out.println("Tipo Envio : " + tipoEnvioTexto);
        System.out.println("Coste / Kg. : " + costeKg);
        System.out.println("Peso : " + kg + " kg.");
        System.out.println("Importe : " + importe + "€");
        double descuento;
        if (tipoEnvio == 3 && kg > 5){
            descuento = (kg-5)*0.05;
            System.out.println("5% descuento a partir de 5 kg. : " + descuento + "€");
            importe -= descuento;
            System.out.println("Importe Total : " + importe + "€");
        }
    }
}
