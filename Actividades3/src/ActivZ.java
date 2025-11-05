package Actividades3.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActivZ {
    public static void main(String[] args) {

        //Crear el vector dinamico
        String[] vector = new String[0];
        //Palabras a la suerte
        String[] palabras = {"Ana"};
        //Número Random, objeto
        Random random = new Random();

        Scanner teclado = new Scanner(System.in);

        //Insertar Valores
        String entrada; 
        System.out.println("Esc palabras para agregar o -1 para comenzar: ");
        do {
            entrada = teclado.nextLine();
            if (!entrada.equals("-1")) { 
                palabras = push(palabras, entrada); 
            }
        } while (!entrada.equals("-1"));

        //Area_Impresion
        System.out.println("Tus palabras de la suerte son: " + Arrays.toString(palabras));
        System.out.println();

        String secreta = (randomSeleccion(random, palabras)); 
        System.out.println("Tu palabra de la suerte es: " + secreta);
        System.out.println();

        //Estado inicial de la palabra secreta (oculta con '*')
        char[] estado = new char[secreta.length()];
        Arrays.fill(estado, '*');
        System.out.println("Progreso inicial: " + String.valueOf(estado));

        //Contadores
        final int PRUEBASMAX = 7;
        int pruebas = 0;
        int aciertos = 0;
        int fallos = 0;

        //Juego
        System.out.println("\nEscribe una de las posibles letras de la palabra secreta");

        do {
            String prub = teclado.nextLine();
            pruebas++;

            boolean rpta = false;

            // Recorremos la palabra secreta y actualizamos el estado
            for (int i = 0; i < secreta.length(); i++) {
                if (String.valueOf(secreta.charAt(i)).equalsIgnoreCase(prub)) {
                    estado[i] = secreta.charAt(i); // Revela la letra
                    rpta = true;
                }
            }

            if (rpta) {
                System.out.println("Bien");
                aciertos++;
            } else {
                System.out.println("Mal");
                fallos++;
            }

            // Mostrar progreso actual
            System.out.println("Progreso: " + String.valueOf(estado));
            System.out.println("Pruebas: " + pruebas + " | Aciertos: " + aciertos + " | Fallos: " + fallos);
            Correspondencia(fallos);

            // Condición de victoria: ya no quedan '*'
            if (!String.valueOf(estado).contains("*")) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + secreta);
                break;
            }

        } while (fallos < PRUEBASMAX);

        if (fallos == PRUEBASMAX) {
            System.out.println("Has perdido. La palabra era: " + secreta);
        }

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


}
