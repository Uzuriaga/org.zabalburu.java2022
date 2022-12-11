/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad8;

/**
 *
 * @author daw1
 */
public class DNIException extends Exception{
    
    public static final String LONGITUD_NO_CORRECTA = "La longitud debe estar entre 8 y 9";
    public static final String PARTE_NUMERICA_NO_CORRECTA = "La parte numerica del DNI no es correcta";
    public static final String PARTE_LETRA_NO_CORRECTA = "La parte de la letra debe contener un caracter valido";
    public static final String FORMATO_NO_VALIDO  = "El formato no es valido";
    
    public DNIException (String mensaje){
    super(mensaje);
    }
}