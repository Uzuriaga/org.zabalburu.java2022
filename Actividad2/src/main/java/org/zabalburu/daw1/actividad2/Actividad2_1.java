/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.daw1.actividad2;

/**
 *
 * @author ichueca
 */
public class Actividad2_1 {

    public static void main(String[] args) {
        double precioCoste = 120.45;
        double precioVenta = 150.45;
        int stock = 34;
        final double IVA = 0.21;
        final int PRODUCTOS_EN_CAJA = 10;
        double beneficio = precioVenta - precioCoste;
        System.out.println("Beneficio : " + beneficio  + "€");
        double stockValorado = stock * precioCoste;
        System.out.println("Stock Valorado : " + stockValorado  + "€");
        double precioVentaConIva = precioVenta * ( 1 + IVA);
        System.out.println("Precio de Venta con IVA : " + precioVentaConIva + "€");
        double porcBeneficio = beneficio / precioCoste * 100;
        System.out.println("Porcentaje Bº : " + porcBeneficio +"%");
        double precioVentaConDto = precioVenta * 0.95;
        System.out.println("Precio Venta con Dto : " + precioVentaConDto + "€");
        //double precioVentaConDtoEIva = precioVentaConDto * (1 + IVA);
        double precioVentaConDtoEIva = precioVentaConIva * 0.95;
        System.out.println("Precio Venta con Dto e Iva : " + precioVentaConDtoEIva + "€");
        int cajas = stock / PRODUCTOS_EN_CAJA;
        System.out.println("Necesitamos " + cajas + " cajas para almacenar " + stock + " productos. Sobran algunas");
        cajas += (stock % PRODUCTOS_EN_CAJA !=0)?1:0;
        System.out.println("Necesitamos " + cajas + " cajas para almacenar " + stock + " productos.");
        
    }
}
