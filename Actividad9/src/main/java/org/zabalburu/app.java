/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class app {

    public static void main(String[] args) {
        //Contador Enviods
        
        //Totales
        String listado = "<html><h1>Resúmen</h1>"
                + "<table border=1 bgcolor=white width=400px>"
                + "<tr><th>Envio</th><th>Tipo</th><th>Coste Base</th>"
                + "<th>Coste</th><th>Coste(descuento)</th></tr>";
        do {
            
            String remitente = JOptionPane.showInputDialog(null,
                    "Ingrese el remitente",
                    "Remitente",
                    JOptionPane.PLAIN_MESSAGE);
            String destinatario = JOptionPane.showInputDialog(null,
                    "Ingrese el destinatario",
                    "Destinatario",
                    JOptionPane.PLAIN_MESSAGE);
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingrese el peso",
                    "Peso",
                    JOptionPane.PLAIN_MESSAGE));
            
            while (!(peso>0 && peso>=1000000)) {                
                  //Mostrar error
                  JOptionPane.showMessageDialog(null,"El peso no debe superar los 1000k ni ser menor que 0",
                        "Error", JOptionPane.ERROR_MESSAGE);
                  
                   peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingrese el peso",
                    "Peso",
                    JOptionPane.PLAIN_MESSAGE));
                  
            }
           
            
            Envio env = new Envio();
            //Remitente
            env.setRemitente(remitente);
            //Destinatario
            env.setDestinatario(destinatario);
            //Peso(Gramos)
            env.setPeso(peso);
        } while (JOptionPane.showConfirmDialog(null,
                "Desea ingresar Otro",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                ==
                JOptionPane.YES_OPTION);
    }
}
