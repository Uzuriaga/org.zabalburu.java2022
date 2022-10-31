/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad7;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class App {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Iphone";
        p1.precio = 1300;
        p1.unidadesAlmacen = 30;

        Producto p2 = new Producto();
        p2.nombre = "Samsumg";
        p2.precio = 1100;
        p2.unidadesAlmacen = 20;

        Producto p3 = new Producto();
        p3.nombre = "Xiaomi";
        p3.precio = 1000;
        p3.unidadesAlmacen = 10;

        int opc;
        do {
            String resp = JOptionPane.showInputDialog(
                    "Producto : " + p1.nombre + "\n"
                    + "Producto : " + p2.nombre + "\n"
                    + "Producto : " + p3.nombre + "\n"
                    + "Productos [1-3] Pusle [0] para finalizar"
            );
            opc = Integer.parseInt(resp);
            if (opc != 0) {
                Producto p;
                switch (opc) {
                    case 1:
                        p = p1;
                        break;
                    case 2:
                        p = p2;
                        break;
                    default:
                        p = p3;
                        break;
                }
                /*resp = Integer.parseInt(JOptionPane.showInputDialog(
                  "Producto: " + p.nombre + "\n"+
                  "Unidades: " + p.unidadesAlmacen + "\n" +
                  "Precio: " + p.precio + "\n"+
                  "Pulse [V] para vender y [A] para aumentar las unidades" ^*/

                resp = JOptionPane.showInputDialog(
                        "Producto: " + p.nombre + "\n"
                        + "Unidades: " + p.unidadesAlmacen + "\n"
                        + "Precio: " + p.precio + "\n"
                        + "Pulse [V] para vender y [A] para aumentar las unidades"
                );

                if (resp.equalsIgnoreCase("v")) {
                    vender(p);
                }
            }

        } while (opc != 0);
        mostrarResumen(p1,p2,p3);
    }

    private static void vender(Producto p) {
        String resp;
        resp = JOptionPane.showInputDialog("Unidades");
        int unidades = Integer.parseInt(resp);
        double importe = p.vender(unidades);
        if (importe == -1) {
            JOptionPane.showMessageDialog(null,
                    "No hay suficientes unidades en el almacén\n"+
                    "Unidades restantes " + p.unidadesAlmacen ,
                    "No hay unidades",
                    JOptionPane.ERROR_MESSAGE
                    
                    );
        } else {
            JOptionPane.showMessageDialog(null,
                    "Importe venta: " + importe);
        }
    }

    private static void mostrarResumen(Producto p1, Producto p2, Producto p3) {
       
    }

}
