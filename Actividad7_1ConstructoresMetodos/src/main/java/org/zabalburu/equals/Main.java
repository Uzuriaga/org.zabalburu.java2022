/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.equals;

import org.zabalburu.modelo.Candidato;

/**
 *
 * @author Junior
 */
public class Main {

    public static void main(String[] args) {
        Candidato c1 = new Candidato("Junior");
        Candidato c2 = new Candidato("Junior");

        Candidato c3 = c1;

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);
        System.out.println("c1==c2 : " + (c1 == c2));
        System.out.println("c1.equals(c3) : " + c1.equals(c2));
        System.out.println("c2==c3 : " + (c2 == c3));
        System.out.println("c2.equals(c3) : " + c2.equals(c3));
        System.out.println("c1==c3 : " + (c1 == c3));
        System.out.println("c1.equals(c3) : " + c1.equals(c3));
        
        
        //Tener en cuenta el metodo equals definido en la clase!
    }
}
