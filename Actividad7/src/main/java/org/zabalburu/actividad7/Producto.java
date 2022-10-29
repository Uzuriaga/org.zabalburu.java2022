/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.actividad7;

/**
 *
 * @author Junior
 */
public class Producto {

    
    //Campos de instancia
    public String nombre;
    public int unidadesAlmacen = 0;
    public double precio = 0;
    public int unidadesVendidas = 0;
    public double ventasProducto = 0;
    
    
    
    //Campos de clase
    public static final double IVA = 21;
    public static double descuento = 5;
    public static double importeMinimo = 100;
    public static double ventasTotales = 0;
    
    
    public void aumentarUnidades (int unidades){
        unidadesAlmacen=+unidades;
    }
    
    private double importe (int unidades){
        double importe = unidades * precio * (1 + IVA / 100);
        return importe;
        
    }
    
    public static double descuento (double importe){
        double dto;
        if (importe<importeMinimo) {
            dto = 0;
        } else{
            dto = importe * (descuento /100);
        }
        return dto;
        
    }
    
    public double vender (int unidades){
        if (unidades>unidadesAlmacen) {
            return -1;
        }
        double importe = importe(unidades);
        double descuento = descuento(importe);
        double importeFinal = importe - descuento;
        unidadesVendidas += unidades;
        unidadesAlmacen -= unidades;
        ventasProducto += importe;
        ventasTotales += importe;
        return importeFinal;
    }
}
