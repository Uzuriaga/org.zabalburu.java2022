/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Libro;

/**
 *
 * @author Junior
 */
public interface LibroDAO {
    Libro buscarLibro(String titulo);
    Libro[] getLibros();
    Libro[] getLibrosTema(String tema);
}
