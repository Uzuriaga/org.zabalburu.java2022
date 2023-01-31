/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dao.LibroDAO;
import dao.LibroMatriz;
import modelo.Libro;

/**
 *
 * @author Junior
 */

    public class LibroServicio {
    private LibroDAO dao = new LibroMatriz();
    
    public Libro buscarLibro(String titulo){
        return dao.buscarLibro(titulo);
    }
    
    public Libro[] getLibros(){
        return dao.getLibros();
    }
    
    public Libro[] getLibrosTema(String tema){
        return dao.getLibrosTema(tema);
    }
    
}

