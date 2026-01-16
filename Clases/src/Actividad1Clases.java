package Clases.src;

import Clases.src.prueba.Matematicas;
import Clases.src.prueba.Persona0;

public class Actividad1Clases {
    public static void main(String[] args) {
        Persona0 p = new Persona0("Domingo",40);
        p.imprimePersona();

        double a=4;
        double b=5;

        System.out.println(Matematicas.suma(a,b));

        System.out.println(p.getNombre());
    }   
}