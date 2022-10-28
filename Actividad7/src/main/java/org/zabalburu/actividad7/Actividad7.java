/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.actividad7;

/**
 *
 * @author Junior
 */
public class Actividad7 {

    public String nombre;
    public int unidadesAlmacen = 0;
    public double precio = 0;
    public int unidadesVendidas = 0;
    public double ventasProducto = 0;
    
    
    public static final double IVA = 21;
    public static double descuento = 5;
    public static double importeMinimo = 100;
    public static double ventasTotales = 0;
    
    
    public void aumentarUnidades (int unidades){
        unidadesAlmacen=+unidades;
    }
    
}
