import java.util.Scanner;

public class Actividad8 {

/*
*Pseudocódigo
*inicio_programa
*Generar numero1 aleatorio
*Generar numero2 aleatorio
*Hacer cuentas (cociente, media, potencia, raiz cuadrada)
* Imprimir cociente, media, potencia y raiz de cada número
*fin_programa
*/
 
final static double PI=3.14159;
public static void main(String[] args) {

    //Leer de teclado la altura y el radio
    Scanner teclado=new Scanner(System.in);
    double altura;
    double radio;

    //Leer Parámetros
    System.out.println("Esc la h ");
    altura= teclado.nextDouble(); teclado.nextLine(); //Por si no lee el N*
    System.out.println("Esc el r ");
    radio=Double.parseDouble(teclado.nextLine());
    System.out.println("El área del cilindro es: " + imprimeCilindro(altura, radio));
}

public static double imprimeCilindro(double altura, double radio) { /* Si le quitas el static, falla */
    // Área total = 2 * PI * radio * (altura + radio)
    return 2 * PI * radio * (altura + radio);
}

}