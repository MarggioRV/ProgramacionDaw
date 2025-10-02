import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        // //Instrucciones de salida por pantalla
        // int valor=7;
        // System.out.println(valor);

        // //Usar printf
        // double precio=130.354;
        // System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d","Tablet",precio,valor);
        // //Incluir un icono
        // System.out.println("Qué ganas tengo de unas vacaciones \u26F1");

        // //Formato reciente de System
        // System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+" y se han comprado "+valor);
        // //Formato salida texto
        // System.out.printf("%15s, %-15s","Domingo","Informático");
        // System.out.println();
        // //Formato tabla
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s|%-10s|%-10s|\n","Producto","Cantidad","Valor");
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s|%d    |%f   |\n","Producto",valor,precio);
        // System.out.println("|----------|----------|----------|");


        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto"+"  |"+"Cantidad"+"  |"+"Precio"+"    |");
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Tablet"+"    |     "+valor+"    |"+precio+"   |");
        // System.out.println("|----------|----------|----------|");


        //Operaciones de entrada por teclado
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Nombre");
        //Lee Nombre
        String nombre=teclado.nextLine();
        System.out.println("Introduce Apellido");
        //Leer Apelido
        String apellido=teclado.nextLine();
        //Leer Edad
        System.out.println("Introduce Edad");
        // //Opción 1 de limpiar buffer
        // int edad=teclado.nextInt();
        // teclado.nextLine(); //Limpiar el buffer para el salto de línea
        //Opción 2 de limpiar buffer
        int edad=Integer.parseInt(teclado.nextLine());
        //Leer Profesión
        System.out.println("Introduce Profesión");
        String profesion=teclado.nextLine();
        
        System.out.println("El usuario se llama "+nombre+" "+apellido+". Tiene "+edad+" años y trabaja de "+profesion);




        teclado.close();
    }
}
