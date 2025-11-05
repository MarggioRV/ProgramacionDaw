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

        //Area_Impresion1
        System.out.println("Tus palabras de la suerte son: " + Arrays.toString(palabras));
        System.out.println();

        String secreta = (randomSeleccion(random, palabras)); 
        System.out.println("Tu palabra de la suerte es: " + secreta);
        System.out.println();

        //Estado inicial (Palabra Secreta)
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

            //Se recorre la palabra secreta, al mismo tiempo, se va actulizando
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

            //Progreso
            System.out.println("Progreso: " + String.valueOf(estado));
            System.out.println("Pruebas: " + pruebas + " | Aciertos: " + aciertos + " | Fallos: " + fallos);
            Correspondencia(fallos);

            //Condición_victoria
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

    //Elección_PalabraRandom 
    public static String randomSeleccion(Random random, String[] palabras) {
        int indice = random.nextInt(palabras.length);
        return palabras[indice];
    }

    //Dibujo del ahorcado según fallos
    public static void Correspondencia(int fallos) {
        if (fallos == 7) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        } else if (fallos == 6) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        } else if (fallos == 5) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |           |");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        } else if (fallos == 4) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        } else if (fallos == 3) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        } else if (fallos == 2) {
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        } else if (fallos == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("_____________________");
        }
    }
}
