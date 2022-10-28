/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.modelo;

/**
 *
 * @author Junior
 */
public class App {
    public static void main(String[] args) {
        Candidato junior = new Candidato("Junior Uzuriaga");
        junior.prueba1 = 3;
        junior.prueba2 = 5;
        junior.prueba3 = 8;
        
        System.out.println("Resultados\n");
    System.out.println("Para Aprobar : " + Candidato.VALOR_APROBADO + "%\n");
    System.out.printf("%-20s%10s%10s%10s%10s%10s%n","Candidato","Prueba1", "Prueba2","Prueba3","Resultado","Aprobado");
    System.out.printf("%-20s%10s%10s%10s%10s%10s%n","=========","=======", "=======","=======","=========","========");
    System.out.printf("%-20s%10.2f%10.2f%10.2f%9.2f%%%6s%n",junior.nombre,junior.prueba1, junior.prueba2,junior.prueba3
                     ,junior.resultadoFinal(), ((junior.aprobado()?"Sí":"No")));
    }
}
