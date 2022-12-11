/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.zabalburu.daw1.actividad10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Actividad10 {

    private static String mostrar(GregorianCalendar gc){
        int dia = gc.get(Calendar.DATE);
        int mes = gc.get(Calendar.MONTH)+1;
        int año = gc.get(Calendar.YEAR);
        String diaText = ((dia<10)?"0":"") + dia;
        String mesText = ((mes<10)?"0":"") + mes;
        int diaSemNum = gc.get(Calendar.DAY_OF_WEEK);
        /*String diaSem;
        switch (diaSemNum) {
            case Calendar.MONDAY:
                diaSem = "Lunes";
                break;
            case Calendar.TUESDAY:
                diaSem = "Martes";
                break;
            case Calendar.WEDNESDAY:
                diaSem = "Miércoles";
                break;
            case Calendar.THURSDAY:
                diaSem = "Jueves";
                break;
            case Calendar.FRIDAY:
                diaSem = "Viernes";
                break;
            case Calendar.SATURDAY:
                diaSem = "Sábado";
                break;
            default:
                diaSem = "Domingo";
                break;
        }*/
        String diaSem = gc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es"));
        return diaText + "-" + mesText + "-" + año + " (" + diaSem + ")";
    }
    
    public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog("Fecha (dd/mm/aaaa)");
        int pos1 = resp.indexOf("/");
        int pos2 = resp.lastIndexOf("/"); // resp.indexOf("/",pos1+1)
        int dia = Integer.parseInt(resp.substring(0, pos1));
        int mes = Integer.parseInt(resp.substring(pos1+1,pos2));
        int año = Integer.parseInt(resp.substring(pos2+1));
        if (año < 100){
            año += 2000; // 22 --> 2022
        }
        // mes 1-12 y el calendar coge de 0 a 11
        mes--;
        GregorianCalendar gc = new GregorianCalendar(año, mes, dia);
        System.out.println(Actividad10.mostrar(gc));
        gc.add(Calendar.DATE,30);
        System.out.println("Tras 30 días");
        System.out.println(Actividad10.mostrar(gc));
        if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            gc.add(Calendar.DATE,2);
        } else if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            gc.add(Calendar.DATE,1);
        } 
        System.out.println("Si era sábado o domingo la hemos pasado al lunes");
        System.out.println(Actividad10.mostrar(gc));
        if (gc.get(Calendar.DATE)>15){
            // Cambiamos de mes
            gc.add(Calendar.MONTH,1);
        }
        // Poner 15 como día
        gc.set(Calendar.DATE,15);
        System.out.println("Ponemos el siguiente día 15");
        System.out.println(Actividad10.mostrar(gc));
        int trim = gc.get(Calendar.MONTH) / 3 + 1;
        System.out.println("Trim " + trim);
        if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
                gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            System.out.println("Es FESTIVO!!!");
        } else {
            System.out.println("es laborable");
        }
        int diasEnAño = gc.get(Calendar.DAY_OF_YEAR);
        System.out.println("Han pasado " + diasEnAño + " dias");
        int diasRestanMes = gc.getActualMaximum(Calendar.DATE) - gc.get(Calendar.DATE);
        System.out.println("Quedan " + diasRestanMes + " días hasta fin de mes");
        System.out.println("El año" + (!gc.isLeapYear(gc.get(Calendar.YEAR))?" NO ":" ") +
                "es bisiesto");
        /*switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                break;
            case Calendar.TUESDAY:
                gc.add(Calendar.DATE,6);
                break;
            case Calendar.WEDNESDAY:
                gc.add(Calendar.DATE,5);
                break;
            case Calendar.THURSDAY:
                gc.add(Calendar.DATE,4);
                break;
            case Calendar.FRIDAY:
                gc.add(Calendar.DATE,3);
                break;
            case Calendar.SATURDAY:
                gc.add(Calendar.DATE,2);
                break;
            default:
                gc.add(Calendar.DATE,1);
                break;
        }*/
        if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            gc.add(Calendar.DATE,1);
        } else  if (gc.get(Calendar.DAY_OF_WEEK) > Calendar.MONDAY){ 
            gc.add(Calendar.DATE, 9-gc.get(Calendar.DAY_OF_WEEK));
        }
        System.out.println("Siguiente LUNES:");
        System.out.println(Actividad10.mostrar(gc));
    }
}
