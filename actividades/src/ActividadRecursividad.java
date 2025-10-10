public class ActividadRecursividad {
    public static int numeroDigitos(int n){
        int contador=0;
        while(n>0){
            n=n/10;
            contador++;
        }
        return contador;
    }

    public static int numeroDigitosRecursivo(int n){
        if(n>=0 && n<10){ //Caso base
            return 1;
        }
        else{
            return 1+numeroDigitosRecursivo(n/10);
        }
    }
    public static int sumaNumeros(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=i;
        }
        return suma;
    }
    public static int sumaNumerosRecursivo(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumaNumerosRecursivo(n-1);
        }

    }


    //Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
        }else{
	     //Se llevan los n-1 de origen al auxiliar
           Hanoi(n-1, origen, destino, auxiliar);
	     //Se llevan el que queda a destino
           System.out.println("mover disco de "+ origen + " a " + destino);
	     //Se llevan los n-1 de auxiliar a destino
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }
    public static double potencia(int base, int exponente){
        //Caso base
        if(exponente==0) return 1;
        else return base*potencia(base,exponente-1);
    }
    public static String pasarBinario(int num) {
    if (num == 0) {
        return "";
    } else {
        return pasarBinario(num / 2) + (num % 2);
    }
}
    public static void main(String[] args) {
        int numero=234;
        // System.out.println(numeroDigitos(numero));
        // System.out.println(numeroDigitosRecursivo(numero));
        // System.out.println(sumaNumeros(4));
        // System.out.println(sumaNumerosRecursivo(4));
        // Hanoi(6,1,2,3);
        System.out.println(potencia(2,10));
        System.out.println(pasarBinario(200));
    }
}
