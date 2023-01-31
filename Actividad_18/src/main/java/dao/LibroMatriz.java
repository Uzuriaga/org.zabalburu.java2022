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
public class LibroMatriz implements LibroDAO {

    private Libro[] libros = new Libro[9];

    public LibroMatriz() {
        libros[0] = new Libro("Aprenda C Ya", "Programación", 75.12, 5);
        libros[1] = new Libro("Microsoft Office", "Ofimática", 58.6, 12);
        libros[2] = new Libro("Windows 10", "Sistemas Operativos", 45, 8);
        libros[3] = new Libro("C Avanzado", "Programación", 90, 3);
        libros[4] = new Libro("Word Básico", "Ofimática", 64.6, 10);
        libros[5] = new Libro("Windows 2015 Server", "Sistemas Operativos", 52.3, 7);
        libros[6] = new Libro("Access 2015", "Ofimática", 32.45, 5);
        libros[7] = new Libro("Diseño de Algoritmos", "Programación", 90.15, 10);
        libros[8] = new Libro("Excel 2015", "Ofimática", 52.58, 4);
    }

    @Override
    public Libro buscarLibro(String titulo) {
        int i;
        for (i = 0;
                i < libros.length && !titulo.equalsIgnoreCase(libros[i].getTitulo());
                i++);
        if (i < libros.length) {
            return libros[i];
        } else {
            return null;
        }
    }

    @Override
    public Libro[] getLibros() {
        return this.libros;
    }

 @Override
    public Libro[] getLibrosTema(String tema) {
        Libro[] librosTema = new Libro[libros.length];
        int numLibrosTema = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getTema().equalsIgnoreCase(tema)){
                librosTema[numLibrosTema] = libros[i];
                numLibrosTema++;
            }
        }
        // For Colecciones
        /*for(Libro l : libros){
            if (l.getTema().equalsIgnoreCase(tema)){
                librosTema[numLibrosTema] = l;
                numLibrosTema++;
            }
        }*/
        Libro[] temp = new Libro[numLibrosTema];
        for (int i = 0; i < numLibrosTema; i++) {
            temp[i] = librosTema[i];
        }
        return temp;
    }
}
