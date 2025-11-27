package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {
/*  Actividad: Crea las clases en JAVA para hacer un sistema de préstamos
    de una biblioteca. En este caso usarás ArrayList. */
    
    //Atributos
    class ListaLibros {}
    class nombre {};
    Collection<nombre> Libros = List.of(new nombre(), new nombre());
    private ArrayList<ListaLibros> LibrosList; 

    //Constructor
    public Biblioteca(){
        this.LibrosList = new ArrayList<ListaLibros>();
    }
    
    //Gets y Setters

    public Collection<nombre> getLibros() {
        return Libros;
    }

    public void setLibros(Collection<nombre> libros) {
        Libros = libros;
    }

    public ArrayList<ListaLibros> getLibrosList() {
        return LibrosList;
    }

    public void setLibrosList(ArrayList<ListaLibros> librosList) {
        LibrosList = librosList;
    }
    
    //Metodos Propios
    
    @Override
    public String toString() {
        return "Biblioteca [Libros=" + Libros + ", LibrosList=" + LibrosList + "]";
    }
}