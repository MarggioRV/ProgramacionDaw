package clases2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import clases2.Personaje.Tipo;

public class Batalla {
    //Atributos
    private ArrayList<Personaje> heroes;
    private ArrayList<Personaje> orcos;
    
    //Constructor_Defecto
    public Batalla() {
        //Grupos
        heroes = new ArrayList<>();
        orcos = new ArrayList<>();
    }
    
    //Funcion Mostrar Menu
    public void MostraMenu (ArrayList<Personaje> caballero, ArrayList<Personaje> mago, ArrayList<Personaje> orco){
        Scanner teclado = new Scanner(System.in);
        
            
        int opcion = 0;
        do {
        System.out.println("==============================");
        System.out.println("Elige tu personaje");
        System.out.println();
        System.out.println("1. Caballero");
        System.out.println("2. Mago");
        System.out.println("3. Orco");
        System.out.println("==============================");
        System.out.print("Agrega personajes con los indices, o -1 para iniciar: ");
        //Entrasa-Datos
        opcion=teclado.nextInt();
        teclado.nextLine();
        //Variable Opcion y sub-Llamadas (Aplicando Lambda)
        switch (opcion) {
            case -1 -> iniciarBatalla(); 
            case 1 -> {
                crearPersonaje(Tipo.Caballero);  
                mostrarListas();
            }
            case 2 -> {
                crearPersonaje(Tipo.Mago);
                mostrarListas();
            }
            case 3 -> {
                crearPersonaje(Tipo.Orco); 
                mostrarListas();
            }
            default -> System.out.println("Opción no válida.");
        }
        } while (opcion != 0); 
    }

    //Funcion mostrar Resultado usando stream (Entuba elementos)
    public void mostrarResultado(ArrayList<Personaje> heroe, ArrayList<Personaje> mago, ArrayList<Personaje> orco){
        
        //SMS: Muertos
        heroe.forEach(System.out::println);
        mago.forEach(System.out::println);
        orco.forEach(System.out::println);
    }

    //Crear Personaje
    private void crearPersonaje(Tipo tipo) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce nombre del " + tipo + ": ");
         String nombre = teclado.nextLine();

         System.out.print("Vida: ");
        int vida = teclado.nextInt();

        System.out.print("Defensa: ");
        int defensa = teclado.nextInt();

        System.out.print("Ataque: ");
        int ataque = teclado.nextInt();
        teclado.nextLine();

        //Crear objeto personaje con todos los atributos
        Personaje p = new Personaje(ataque,nombre,vida,tipo,defensa);
                           
        //Para los orcos, sin suptipos, se agrega directamente
        if (tipo == Tipo.Orco) {
            orcos.add(p);
        } else { 
            heroes.add(p); 
        }
        //Confirmacion por impresion
        System.out.println(tipo + " creado y agregado: " + p);
    }


    //EstructuraLista
    private void comoVerLista(String titulo, ArrayList<Personaje> personajes) {
        System.out.println("--- " + titulo + " ---");
        if (personajes.isEmpty()) {
            System.out.println("No hay " + titulo.toLowerCase() + ".");
        } else {
            //lista.forEach(System.out::println); 
            for (Personaje p  : personajes) {
                System.out.println(p);
            }
        }
    }

    //MostrarLista
    private void mostrarListas() {
        comoVerLista("Héroes/Magos", heroes);
        comoVerLista("Orcos", orcos);
    }

    //IniciarBatalla
    public void iniciarBatalla() {
        do {
            //#Ramdon por clase directa
            Random rand = new Random();
            
            //Seleccion de heroes
            Personaje heroeElegido = heroes.get(rand.nextInt(heroes.size()));
            Personaje orcoElegido = orcos.get(rand.nextInt(orcos.size()));
            
            //Confirmacion X Impresion
            System.out.println(heroeElegido + " vs " + orcoElegido);

            //Daño
            //Ambos atacan a la vez usando calcDaño
            orcoElegido.calcDaño(heroeElegido.getAtaque());
            heroeElegido.calcDaño(orcoElegido.getAtaque());

            //AtackSilmutaneo
            
            //Heores
            if (!heroeElegido.estaVivo()){
                System.out.println(heroeElegido.getNombre());
            }
            System.out.println(heroeElegido);
            heroes.remove(heroeElegido);
            
            //Orcos
            if (!orcoElegido.estaVivo()){
                System.out.println(orcoElegido.getNombre());
            }
            System.out.println(orcoElegido);
            orcos.remove(orcoElegido);
        
        } while (!heroes.isEmpty() && !orcos.isEmpty());
        System.out.println("La batalla ha terminado");
    }
}
 