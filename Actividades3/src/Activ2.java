package Actividades3.src;

import java.util.Arrays;

public class Activ2 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][2]; //Al ser cuadrilateral, no hay problema

        //Insertar valores (Por decena)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i) + (j * 10);
            }
        }

        //Imprimir Matriz
        
        /* Por for */
        System.out.println("La Matriz contiene: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        }

        /* Similar a toString, pero recorre todos los niveles, por eso puede imprimir Arrays_Arrays */
        System.out.println(Arrays.deepToString(matriz));

         /* Llamadas */
        sumaFilas(matriz);
        suma_CadaFila(matriz);
        sumaColumnas(matriz);
        suma_CadaColumna(matriz);
    }

    //Suma_Filas
    public static void sumaFilas(int[][] matriz) {
        int filasTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                filasTotal += matriz[i][j];
            }
        }
        System.out.println("\nTotal_filas: " + filasTotal);
    }
    
    //Suma_x_Fila
    public static void suma_CadaFila(int[][] matriz) {
        int fila = matriz[0].length; 
        for (int j = 0; j < fila; j++) {
            int sumaFila = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma x filas " + j + ": " + sumaFila);
        }
    }

    //Suma_Columnas
    public static void sumaColumnas(int[][] matriz) {
        int ColumnaTotal = 0;
        for (int i = 0; i < matriz[0].length; i++) { /* Si bien [0].length = columna, falla si las filas no l=. */
            for (int j = 0; j < matriz[i].length; j++) {
                ColumnaTotal += matriz[i][j];
            }
        }
        System.out.println("\nTotal_Columnas: " + ColumnaTotal);
    }
    
    //Suma_x_Columna
    public static void suma_CadaColumna(int[][] matriz) {
        int columnas = matriz[0].length; 
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma x columna " + j + ": " + sumaColumna);
        }
    }
}
