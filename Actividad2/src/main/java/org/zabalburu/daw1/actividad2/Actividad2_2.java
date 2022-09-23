/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad2;

/**
 *
 * @author ichueca
 */
public class Actividad2_2 {
    public static void main(String[] args) {
        String curso = "ASIR1";
        char seccion = 'f';
        int nota1 = 8;
        int nota2 = 5;
        int nota3 = 1;
        boolean repetidor = true;
        double media = (nota1+nota2+nota3) / 3.0;
        System.out.println("Nota Media : " + media);
        boolean aprobado = media >= 5;
        System.out.println("Aprobado : " + (aprobado?"Sí":"No"));
        System.out.println("Curso DAW1 y Sección A : " + (curso.equals("DAW1") && seccion == 'A'));
        boolean rdo = curso.equalsIgnoreCase("DAW1") && (seccion == 'A' || seccion == 'a');
        System.out.println("Curso DAW1 y Sección A : " + rdo);
        System.out.println("Repetidor y suspenso en nota1 : " + (repetidor && nota1<5));
        boolean algunSuspenso = nota1<5 || nota2<5 || nota3<5;
        System.out.println("Tiene suspensos : " + algunSuspenso);
        rdo = (curso.equalsIgnoreCase("ASIR1") || curso.equalsIgnoreCase("DAW1"))
                &&
              (seccion=='A' || seccion == 'a' || seccion=='B' || seccion == 'b');
        System.out.println("ASIR1 o DAW1 y sección A o B : " + rdo);
        boolean nota1MasAlta = nota1 >= nota2 && nota1 >= nota3;
        System.out.println("Nota 1 más alta : " + nota1MasAlta);
        double notaFinal = nota1 * 0.3 + nota2 *0.5 + nota3 * 0.2;
        System.out.println("Nota Final : " + notaFinal);
        int notaMasAlta = (nota1 > nota2 && nota1 > nota3)?nota1:(nota2>nota3)?nota2:nota3;
        System.out.println("Nota Más Alta : " + notaMasAlta);
        notaMasAlta = (nota1>nota2)?((nota1>nota3)?nota1:nota3):(nota2>nota3)?nota2:nota3;
        System.out.println("Nota Más Alta : " + notaMasAlta);
    }
}
