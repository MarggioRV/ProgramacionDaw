package Actividades3.src;

import java.util.ArrayList;
import java.util.Scanner;

/* Actividad de grupo: Utilizando las funciones de String, vas a diseñar el
juego del ahorcado. De un array de palabras vas a coger una al azar y se
creará el vector con * de la longitud para que cuando el usuario acierte
una letra se vaya sustituyendo hasta que o bien la palabra se puede leer
(ganas) o acaba el juego si fallas 7 veces (pierdes) */

public class ActivX {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner teclado=new Scanner(System.in);
        String palabra;
        boolean salida=false;
        do {
            System.out.println("Introduce una palabra o fin para terminar: ");
            palabra=teclado.nextLine();
            lista.add(palabra);
            if (palabra.equalsIgnoreCase("fin")) {
                salida=true;}
        } while (!salida);
    }

    //Sacar una palabra al azar

}