/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad3_alternativas;

import javax.swing.JOptionPane;

/**
 * 5. Diseñar un programa que pida el nombre de un alumno y sus notas en ENT,
 * BD, FOL, SI, PRO, IT y LM. Tras ello mostrar la siguiente información:
 *
 *
 *
 * Nota media del alumno (asumiendo que todas las notas valen lo mismo) Número
 * de aprobados y suspensos totales Si el alumno pasa o no de curso. NO pasa de
 * curso si tiene más de dos módulos suspendidos o si el número de horas básicas
 * es mayor de 275 (tenéis las horas básicas de cada módulo en la Agenda)
 *
 * @author daw1
 */
public class Actividad3_Alternativas5 {

   public static void main(String[] args) {
        int numModulos = 0;
        int numSuspensos = 0;
        int sumaNotas = 0;
        int horasSuspendidas = 0;
        String nombre = JOptionPane.showInputDialog("Nombre Alumno");
        String resp = JOptionPane.showInputDialog("Nota de FOL");
        int fol = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += fol;
        if (fol < 5){
            numSuspensos++;
            horasSuspendidas += 99;
        }
        resp = JOptionPane.showInputDialog("Nota de ENT");
        int ent = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += ent;
        if (ent < 5){
            numSuspensos++;
            horasSuspendidas += 99;
        }
        resp = JOptionPane.showInputDialog("Nota de IT");
        int it = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += it;
        if (it < 5){
            numSuspensos++;
            horasSuspendidas += 33;
        }
        resp = JOptionPane.showInputDialog("Nota de SI");
        int si = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += si;
        if (si < 5){
            numSuspensos++;
            horasSuspendidas += 165;
        }
        resp = JOptionPane.showInputDialog("Nota de BD");
        int bd = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += bd;
        if (bd < 5){
            numSuspensos++;
            horasSuspendidas += 198;
        }
        resp = JOptionPane.showInputDialog("Nota de PRO");
        int pro = Integer.parseInt(resp);
        sumaNotas += pro;
        numModulos++;
        if (pro < 5){
            numSuspensos++;
            horasSuspendidas += 264;
        }
        resp = JOptionPane.showInputDialog("Nota de LM");
        int lm = Integer.parseInt(resp);
        numModulos++;
        sumaNotas += lm;
        if (lm < 5){
            numSuspensos++;
            horasSuspendidas += 132;
        }
        double media = (double) sumaNotas / numModulos;
        boolean noPasaCurso = numSuspensos > 2 || horasSuspendidas > 300;
        JOptionPane.showMessageDialog(null,
            "Estadísticas de " + nombre + "\n\n" +
            "Nota Media : " + media + "\n" +
            "Nº Suspensos : " + numSuspensos + "\n" +
            "Nº Aprobados : " + (numModulos - numSuspensos) + "\n" +
            "Promociona  ( " + horasSuspendidas + " ) : " +  (noPasaCurso?"NO":"Sí"));
    }
    
}
