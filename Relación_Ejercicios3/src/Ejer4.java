/* 4. Escribir un programa que valide el décimo de la bonoloto. Tendrás un array con los valores 
correctos y otro el que introduzca el usuario. El programa verificará cuántos aciertos ha tenido. */

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //Loteria
        int[] LOTERIA={10,20,30,40,50,60,70};
        
        //Insertar un Valores
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce #s o esc 0 para concluir ");

        for (int i = 0; i < 7; i++) {
        vector = push(vector, teclado.nextInt());
        }
        
        //Sin Ordenar
        System.out.println("Tus números son: ");
            for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" "); //Automatiza la impresión
            
        }
        
        if(Arrays.equals(LOTERIA, vector)){ 
            System.out.println();
            System.out.println("\n¡Gamaste!");
        }else{
            System.out.println("\nAcertaste: " + ContarNRepetidos(vector, LOTERIA) + " número(s)");
        } 
        teclado.close();
    }
     
    //Función push
    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null) {longitud=0;}
        else {longitud=array.length;}
        //Crea un array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //copiar lo que has esñ ese momento 
        for (int i=0;i<longitud;i++){
            salida[i]=array[i];
        }
        salida[longitud]=valor;
        return salida;
    }
    
    //Contador_NRepetidos
    public static int ContarNRepetidos(int[] vector, int[] LOTERIA) {
        int contador = 0;
        
        /* 2 recorridos paralelos */
        for (int i=0; i<vector.length; i++) { 
            for (int j=0; j<LOTERIA.length; j++) {
                /* Comparamos de 1 en 1 */
                if (vector[i] == LOTERIA[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

}


