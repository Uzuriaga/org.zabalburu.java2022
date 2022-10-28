/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.modelo;

import java.util.Objects;

/**
 *
 * @author Junior
 */
public class Candidato {
    public static final int VALOR_APROBADO = 60;
    //Propiedad estatica publica(1 por cada clase)
    
    /*Retorna el vvalor de la prueba (Valores entre 0 y 10) como la parte proporcional del pòrcentaje
    Ejemplos
    si el porcentaje es un 20 (20%)
    prueba = 0 ---> retorna 0
    prueba = 5 ---> retorna 10 (la mitad del 20%)
    prueba = 7 ---> retorna 14
    prueba = 10 ---> retorna 20
    */
    
    private static double resultadoPorcentaje (double  prueba, double porcentaje){
        //solo accesible desde la propia clase ya que es static
        //NO SE PUEDE ACCEDER A PRUEBA1 , PRUEBA2 , PRUEBA 3 y nombre desde aquí dado que nos encontramos en la clase y no en el objeto
        return prueba*porcentaje /10;
        
    }
    
    //Propiedad de instancia pública (1 por candidato)
    public String nombre;
    //Propiedad de instancia protegida 1 por candidato
    protected double prueba1;
    //Propiedad de instancia de tipo paquete (1 por candidadto)
    double prueba2;
    double prueba3;
    private int noAccesible; // Esta propiedad NO ES ACCESIBLE, no se podia invocar desde el main

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidato other = (Candidato) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    //Constructor sin argumentos
    
    public Candidato(){
       this("");
    }
    
    public Candidato(String nombre){
        this(nombre,0,0,0);
    }

    public Candidato(String nombre, double prueba1, double prueba2, double prueba3) {
        this.nombre = nombre;
        this.prueba1 = prueba1;
        this.prueba2 = prueba2;
        this.prueba3 = prueba3;
    }
    
    
  public double prueba1ComoPorcentaje()  {
    // Podemos acceder a las propiedades y métodos de instancia y de clase
    // dado que estamos en el objeto (método de instancia)
    return Candidato.resultadoPorcentaje(this.prueba1, 40);
  }

  public double prueba2ComoPorcentaje()  {
    return Candidato.resultadoPorcentaje(this.prueba2, 35);
  }

  public double prueba3ComoPorcentaje()  {
    return Candidato.resultadoPorcentaje(this.prueba3, 25);
  }

  public double resultadoFinal(){
    return this.prueba1ComoPorcentaje() + this.prueba2ComoPorcentaje() + this.prueba1ComoPorcentaje();
  }

  public boolean aprobado(){
    // El emplear this y Candidato permite dejar claro que el método es de instancia
    // y la constante es de CLASE
    return this.resultadoFinal()>=Candidato.VALOR_APROBADO;
  }
  
}

