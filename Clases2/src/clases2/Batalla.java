package clases2;

import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {
    //Atributos
    ArrayList<Personaje>Heroe;
    ArrayList<Personaje>Mago;
    ArrayList<Personaje>Orco;
    
    //Constructor
    private Batalla(ArrayList<Personaje> heroe, ArrayList<Personaje> mago, ArrayList<Personaje> orco) {
        this.Heroe = heroe;
        this.Mago = mago;
        this.Orco = orco;
    }
    
    //Funcion Mostrar Menu
    public void MostraMenu (ArrayList<Personaje> heroe, ArrayList<Personaje> mago, ArrayList<Personaje> orco){
        Scanner teclado = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Elige tu personaje");
        System.out.println();
        System.out.println("1. Heore");
        System.out.println("2. Heore");
        System.out.println("2. Heore");
        System.out.println("==============================");
    }

    //Funcion mostrar Resultado usando stream (Entuba elementos)
    public void MostrarResultado(ArrayList<Personaje> heroe, ArrayList<Personaje> mago, ArrayList<Personaje> orco){
        heroe.forEach(System.out::println);
        mago.forEach(System.out::println);
        orco.forEach(System.out::println);
    }

    //Crear Personaje

    //IniciarBatalla
    
    
}
