
public class FuncionesJava {

    public static int suma(int numero1, int numero2) { /* Si le quitas el static, falla */
        return numero1+numero2;
    }

    public static double suma(double numero1, double numero2) { /* Con diferencias suficientes, no quejas */
    return numero1+numero2;
    }
    
    // Función que devuelve el max de 2 numeros
    public static int maximo(int numero1, int numero2) {
        if(numero1>=numero2) return numero1;
        return numero2;
    }


    public static void escribir3Saludos() {
        System.out.println("Hola Domingo");
        System.out.println("Hola2");
        System.out.println("Hola3");
    }


    public static void main(String[] args) {
            /*     
            * 
            */
            escribir3Saludos();
            /* 
            *    
            * 
            */
            escribir3Saludos();
            /*     
            * 
            *
            */
            escribir3Saludos();

            //Operación    /* No puedes exigir más un void con println */
            System.out.println(suma(3,5)); //Suma con parametros enteros
            System.out.println(suma(1.5,3.7)); //Suma con parametros reales
            
            //Maximo de 5 números (11,33,22,7,3)
            System.out.println(maximo(maximo(5,7),7));    
    }
}

//Probar pag 24