package Actividades3.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ActivY {
    public static void main(String[] args) {

        //Crear el vector dinamico
        String[] vector = new String[0];
        //Palabras a la suerte
        String[] palabras = {"Ana"};
        //Número Ramdon, objeto
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
        
        //Area_Impresion
        System.out.println("Tus palabras de la suerte son: " + Arrays.toString(palabras));
        System.out.println();
        
        String secreta = (randomSeleccion(random, palabras)); /* Al declararla como variable es + facil de testear */
        System.out.println("Tu palabra de la suerte es: " + secreta);
        System.out.println();
        
        //Llamada_Cod
        secretoCod(secreta);
        System.out.println();

        //Logitud_PalabraSecreta
        //int logitud = secreta.length();

        //Llamada_PrubDiv
        dividirPalab1(secreta);
        System.out.println();
        dividirPalab2(secreta);

        //Contadores
        final int PRUEBASMAX=7;
        int pruebas=0;
        int aciertos=0;
        int fallos=0;

        //Juego
        System.out.println("\nEscb una de las posibles letras de la palabra secreta");
        
        do {
        String prub = teclado.nextLine();
        pruebas++;

        String[] letras = secreta.split("(?<=.)"); 
            boolean rpta=false;

            for (String letra : letras) {
                if (letra.equalsIgnoreCase(prub)) {
                    System.out.println("Bien");
                    rpta = true;
                } 
            } 
            
            //El conteo debe darse por separado, sino se hace todo de una.
            if (rpta == true) { /* Es lo mismo que escb rpta a secas */
                aciertos++;
            } else {
                System.out.println("Mal");
                fallos++;
            }
            System.out.println();
            System.out.println("Pruebas: " + pruebas + " | Aciertos: " + aciertos + " | Fallos: " + fallos); 
            System.out.println("Bien");
            Correspondencia(fallos);
        } while (aciertos + fallos < PRUEBASMAX && PRUEBASMAX > pruebas);
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
    
    //Conversión a *
    public static void secretoCod(String palabras) {
    //Se va construyendo una cadena de asteriscos con la misma longitud que la palabra.
        StringBuilder simbolo = new StringBuilder(); /* Clase que permite crear y modificar cadenas de texto*/
        for (int i = 0; i < palabras.length(); i++) { 
            simbolo.append("*"); /* Metodo de la clase anterior, añade un valor a una secuencia */
        }
        System.out.println("Codificada: " + simbolo.toString());
    }

    //Frag usando metodo String
    public static void dividirPalab1(String palabras) {
        String[] letras = palabras.split("(?<=.)"); /* Regex: Indica dónde dividir una cadena */
        System.out.println(Arrays.toString(letras));
    }

    //Frag usando metodo String y, For each, en este caso en orden porque es Split()
    //Este sí sirve para ralizar una comparación
    public static void dividirPalab2(String palabras) {
        String[] letras = palabras.split("(?<=.)"); 
        /* Por cada vuelta, se toma 1E, y se guarda en la Vb */
        for (String letra : letras) {
            System.out.println(letra);
        }
    }
    
    public static void Correspondencia(int fallos) {

        if (fallos == 7) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 6) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }

        else if (fallos == 5) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |           |");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 4) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 3) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }        

        else if (fallos == 2) {
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }
        
        else if (fallos == 1) {
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



