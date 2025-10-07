
import java.util.Scanner;
public class Actividad5 {
//Pag 16, Actvs 1 y 3
    public static void main(String[] args) {

        // //Repetir de 50 a 200
        // //  Si numero%2=0 Y numero%3=0 entonces
        // //      Imprimir numero
        // //fin_repetir
        // //Entre 50 y 200 los múltiplos de 2 y 3
        // for(int numero=50;numero<=200;numero++){
        //     if(numero%2==0 && numero%3==0){
        //         System.out.println(numero);
        //     }
        // }

//==================================================================//

        // Factorizar el número
        // int producto=1,numero=5;
        // for(int i=1;i<=numero;i++){
        //     producto=producto*i;
        // }
        // System.out.println(producto);
        
//==================================================================//

        //Leer edades, hasta que se escriba -1
        // y entonces sacar el valor máximo y mínimo
        int maximo=-1;
        int minimo=1000000;
        int contadorPersona=0;
        int suma=0;
        int mayor18=0;
        Scanner teclado = new Scanner(System.in);
        int edad;
        do { 
            System.out.print("Introduce una edad o -1 para salir: ");
            edad=teclado.nextInt();
            if(edad!=-1) contadorPersona++;//Nueva persona
            //Establezco la lógica para máximo y mínimo
            if(edad>maximo){ 
                maximo=edad;
            }
            if(edad<minimo && edad!=-1){
                minimo=edad;
            }
            if(edad>=18){
                mayor18++;
            }
            if(edad!=-1){
                suma+=edad; //suma=suma+edad;
            }
        } while (edad!=-1);
        System.out.println("El número de personas: "+contadorPersona);
        System.out.println("El máximo es: "+maximo);
        System.out.println("El mínimo es: "+minimo);
        System.out.println("El número de mayores de 18: "+mayor18);
        System.out.println("Suma de edades: "+suma);
        System.out.println("Media de edades: "+(suma/contadorPersona));
    }
}
