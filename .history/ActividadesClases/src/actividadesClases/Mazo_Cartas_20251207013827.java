package actividadesClases;
import java.util.Collections;
import java.util.ArrayList;

public class Mazo_Cartas {
    private ArrayList<Cartas> mazo;

    //Constructor
    public Mazo_Cartas(){
        this.mazo = new ArrayList<Cartas>();
    }

    //Funcion para llenar mazo con cartas españolas
    public void llenarMazo() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        for (String palo : palos) {
            for (int valor = 1; valor <= 12; valor++) {
                if (valor != 8 && valor != 9) { //Por la baraja Española
                    Cartas carta = new Cartas();
                    carta.setPalo(palo);
                    carta.setValor(valor);
                    mazo.add(carta);
                }
            }
        }
    }

    //Getters y Setters
    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    //Metodos Propios
    
    @Override
    public String toString() {
        return "Mazo_Cartas [mazo=" + mazo + "]";
    }
    
    //Metodo para barajar las cartas del mazo
    // public void barajar() {
    //     ArrayList<Cartas> mazoBarajado = new ArrayList<Cartas>();
    //     while (mazo.size() > 0) {
    //         int indiceAleatorio = (int) (Math.random() * mazo.size());
    //         mazoBarajado.add(mazo.remove(indiceAleatorio));
    //     }
    //     this.mazo = mazoBarajado;
    // }

    //Fucion barajar cartas del mazo usando Collections.shuffle
    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    //Funcion para mostrar carta, y luego eliminarla del mazo
    public Cartas sacarCarta() {
        if (estaVacio()) {
            System.out.println("El mazo está vacío. Game Over");
            return null;
        }
        return mazo.remove(0); 
    }

    //Funcion Bolean, verifica si mazo = vacio
    public boolean estaVacio() {
        return mazo.isEmpty(); // Metodo que dv =True, si esta vacio
    }
}
