package Actividades3.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ActivY {
    public static void main(String[] args) {
        //Crear el vector dinamico
        String[] vector = new String[0];
        //Palabras de la suerte
        String[] palabras = {"Ana"};
        Random random = new Random();
        
        Scanner teclado = new Scanner(System.in); 
        
        //Insertar un Valores
        String entrada; /* Para la vs do while, doble función */
        System.out.println("Esc palabras para agregar o -1 para comenzar: ");
        do {
            entrada = teclado.nextLine();
                if (!entrada.equals("-1")) { /* Cualq cosa menos eso */
                palabras = push(palabras, entrada); /* Ya no es neceseario leer por segunda vez, directo la variable */
                }
        } while (!entrada.equals("-1"));

        //System.out.println("Introduce tus #s de la suerte: ");
        //For que solo permite 6 valores
        // for (int i = 0; i < 1; i++) {
        //     palabras = push(palabras, teclado.nextLine());
        // }

        System.out.println("Tus #s de la suerte son: " + Arrays.toString(palabras));
        System.out.println();
        System.out.println("Tu palabra de la suerte es: " + randomSeleccion(random, palabras));
        System.out.println();
        secretoCod(randomSeleccion(random, palabras));
        teclado.nextLine(); //limpiador_buffer
        
        System.out.println("\nEscb la posibles letras de la palabra");
        teclado.close();
    } 
    
    // Función push para String
    public static String[] push(String[] vector, String push) {
        String[] palabras = new String[vector.length + 1];
        for (int i = 0; i < vector.length; i++)
        palabras[i] = vector[i];
        palabras[vector.length] = push;
        return palabras;
    }

    // Función push
    // public static int[] push(int[] array, int valor){
    //     int longitud;
    //     if (array==null) {longitud=0;}
    //     else {longitud=array.length;}
    //     //Crea un array con +1 de tamaño
    //     int[] salida=new int[longitud+1];
    //     //copiar lo que has esñ ese momento 
    //     for (int i=0;i<longitud;i++){
    //         salida[i]=array[i];
    //     }
    //     salida[longitud]=valor;
    //     return salida;
    // }
    
    //Elección_PalabraRandom 
    public static String randomSeleccion(Random random, String[] palabras) {
        int indice = random.nextInt(palabras.length);
        return palabras[indice];
    }
    
    //Conversión
    public static void secretoCod(String palabras) {
    //Se va construyendo una cadena de asteriscos con la misma longitud que la palabra.
        StringBuilder simbolo = new StringBuilder(); /* Clase que permite crear y modificar cadenas de texto*/
        for (int i = 0; i < palabras.length(); i++) { 
            simbolo.append("*"); /* Metodo de la clase anterior, añade un valor a una secuencia */
        }
        System.out.println("Codificada: " + simbolo.toString());
    }
}

