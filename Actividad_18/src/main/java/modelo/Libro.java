/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Junior
 */
public class Libro {
    private String titulo;
    private String tema;
    private double precio;
    private int unidades;
    private double ventas=0;

    public Libro(String titulo, String tema, double precio, int unidades) {
        this.titulo = titulo;
        this.tema = tema;
        this.precio = precio;
        this.unidades = unidades;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getVentas() {
        return ventas;
    }
    
    
    public double vender(int numLibros){
        if (numLibros > this.unidades) {
            return 0;
        }
        this.unidades -= numLibros;
        this.ventas += numLibros;
        return numLibros * this.precio;
    }
}
