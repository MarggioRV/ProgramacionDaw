package Actividades3.src;

import java.util.Scanner;

public class Pag15 {

    public static String[] modulos = { "Programación", "Entornos", "B.Datos", "Sistemas" };
    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };    
    public static double[][] notas = new double[5][4]; /* matriz bidimencional */

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        //De tener tamaños fijos, no es necesario una función push
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < modulos.length; j++) {
                notas[i][j] = Math.random() * 10; // nota aleatoria entre 0 y 10
            }
        }

        //Imprimir Formato tabla1
        System.out.printf("%-10s", "Alumno");
        for (String modulo : modulos) {
            System.out.printf("%-15s", modulo);
        }
        System.out.println();
        //Imprimir Formato tabla2
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("%-10s", alumnos[i]);
            for (int j = 0; j < modulos.length; j++) {
                System.out.printf("%-15.2f", notas[i][j]);
            }
            System.out.println();
        } 
        System.out.println();
        System.out.println("Enter, para continuar");
        System.out.println("-----------------------");

        //Limpiador_buffer
        teclado.nextLine();
        
        //Lista de AlumnosDina
        System.out.println("Selecciona un alumno por índice:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i+1) + ". " + alumnos[i]);
        }
        System.out.println();

        //Lista de AlumnosDina
        int fulano = teclado.nextInt();
        System.out.println("Has elegido: " + alumnos[fulano-1]);
        System.out.println();
        
        CalcularMedia(fulano);
    }
    
    //Dado que maxNota y minNota son eso mismo, han de reutlizarse como inicializadores
    public static void CalcularMedia(int fulano) {

        //Variables a tratar
        double contadorSumaNota=0;
        /* Estas sirven de arranque */
        double maxNota = notas[fulano][0];
        double minNota = notas[fulano][0];
        
        //Este for ecorre todas las asignaturas, del Alumno, y extrae las notas 
        for (int j = 0; j < modulos.length; j++) {
            double nota = notas[fulano][j];
            contadorSumaNota += nota; /* acumula la nota */
            /* Con esto, se determina cual es cual en cada caso */
            if (nota > maxNota) {
                maxNota = nota;
            } else if (nota < minNota) { 
                minNota = nota;
            }
        }
        
        //Calculo de la media, modulos.length hace de #modulos
        double media = contadorSumaNota / modulos.length;

        //Impresiones
        System.out.println("\nResultados de " + alumnos[fulano] + ":");
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Máxima: %.2f\n", maxNota);
        System.out.printf("Mínima: %.2f\n", minNota);
    }
}
