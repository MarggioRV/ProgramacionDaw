package Actividades3.src;


public class Pagg15 {
    public static void main(String[] args) {
    }
    
    public static String[] modulos = { "Programación", "Entornos", "Bases Datos", "Sistemas" };
    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };    
    public static double[][] notas = new double[5][4];
        
        for int i = 0; i < 6; i++) {
        for (int i = 0; i < 1; i++) {
             notas = push(notas);
        }
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
}
