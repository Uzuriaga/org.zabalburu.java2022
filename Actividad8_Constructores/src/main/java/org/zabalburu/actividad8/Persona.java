/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad8;

/**
 *
 * @author Junior
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI = "00000000X";
    private char sexo = 'M';
    private double kilos;
    private double altura;

    public static int numPersonas = 0;

    public Persona() {
    }

    public Persona(String nombre, int entero, char sexo) {
        this.nombre = nombre;
        this.edad = entero;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double kilos, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.kilos = kilos;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntero() {
        return edad;
    }

    public void setEntero(int entero) {
        this.edad = entero;
    }

    public char getSexo() {
        switch (sexo) {
            case 'm':
                sexo = 'M';
                numPersonas++;
                break;
            case 'h':
                sexo = 'H';
                numPersonas++;
                break;
            case 'n':
                sexo = 'N';
                numPersonas++;
                break;
            default:
                sexo = 'M';
                numPersonas++;
                break;
        }
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static int getNumPersonas() {
        return numPersonas;
    }

    public static void setNumPersonas(int numPersonas) {
        Persona.numPersonas = numPersonas;
    }

    
    //DNI
        private void isValidoDNI(String DNI) throws Exception{
        if (!(DNI.length()>8 && DNI.length()<=9)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
        
        String parte_numerica = DNI.substring(0,DNI.length()-1);
        int numeroDNI = 0;
        
        try {
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }
        
        char letra = DNI.substring(DNI.length()-1,DNI.length()).toUpperCase().charAt(0);
        
        if (!(letra>='A' && letra<='Z')) {
            throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);
        }
        
        //Validar el formato letras que van en el char
        
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'O', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int resto = numeroDNI % 23;
        
        String nuevoDNI = numeroDNI +"" + letrasNIF[resto];
        
        if (DNI.startsWith("0")) {
            nuevoDNI = "0"+nuevoDNI;
        }
        if (!(nuevoDNI.equals(DNI))) {
            throw new DNIException(DNIException.FORMATO_NO_VALIDO);
            
        }
    }
}
