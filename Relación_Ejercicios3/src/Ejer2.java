import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //inserta un valor
        vector=push(vector,3);
        vector=push(vector,5);

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce # ");
        vector=push(vector,teclado.nextInt());

        System.out.println("Vector sin ordenar: ");
            for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" "); // Automatiza la impresión
        }

        //Ordenamiento
        for(int i=0; i < vector.length-1; i++){
            for(int j=0; j < (vector.length-1-i); j++){  
                if(vector[j] > vector[j+1]){  
                    int aux=vector[j];                 
                    vector[j]=vector[j+1];           
                    vector[j+1]=aux;
                }    
            }
        }
        System.out.println("\nVector ordenado: ");
            
        for(int i=0;i<vector.length;i++){
        System.out.print(vector[i]+" ");
        }
    }

    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null) {longitud=0;}
        else {longitud=array.length;}
        //Crea un array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //copiar lo que haa ens ese momento 
        for (int i=0;i<longitud;i++){
            salida[i]=array[i];
        }
        salida[longitud]=valor;
        return salida;
    }
}

