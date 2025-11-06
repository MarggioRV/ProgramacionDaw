package Actividades3.src;

import java.util.Scanner;

public class Pag15 {

    public static String[] modulos = { "Programación", "Entornos", "B.Datos", "Sistemas" };
    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };    
    public static double[][] notas = new double[5][4]; /* matriz bidimencional */

    public static void main(String[] args) {
        
        int contadorNota=0;
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

        //Limpiador_buffer
        teclado.nextLine();
        
        //Lista de AlumnosDina
        System.out.println("Selecciona un alumno por índice:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i+1) + ". " + alumnos[i]);
        }
        System.out.println("Enter, para continuar");

        //Lista de AlumnosDina
        int fulano = teclado.nextInt();
        System.out.println("Has elegido: " + alumnos[fulano-1]);
        System.out.println();

        // double media = sumaNota / contadorNota;
        // double maxNota =;
        // double minNota =;

        // System.out.println("Sus resultados son: " + media + maxNota +  minNota);
    }
}
