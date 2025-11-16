package Actividades3.src;

import java.util.ArrayList;
import java.util.Scanner;

public class ActivX {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner teclado=new Scanner(System.in);
        String palabra;
        boolean salida=false;
        do {
            System.out.println("Introduce una palabra o fin para terminar: ");
            palabra=teclado.nextLine();
            lista.add(palabra);
            if (palabra.equalsIgnoreCase("fin")) {
                salida=true;}
        } while (!salida);
    }

}