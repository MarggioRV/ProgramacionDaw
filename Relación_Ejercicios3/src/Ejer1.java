public class Ejer1 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //inserta un valor
        vector=push(vector,3);
        vector=push(vector,5);
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
    

    public static void pop(){ 

    }

}


