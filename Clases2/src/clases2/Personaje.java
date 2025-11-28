package clases2;

public class Personaje {
    private int ataque; //Tipo_Ataque
    private String nombre;
    private int vida;
    private Tipo tipo;
    private int defensa;

    enum Tipo {Caballero, Mago, Orco}
    
    //Constructor
    public Personaje(int ataque, String nombre, int vida, Tipo tipo, int defensa) {
        this.ataque = ataque;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.defensa = defensa;
    }
    
    //Getters y Setters

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    //Metodos Propios

    //FuncionOkVida
    Boolean estaVivo() {
        return vida > 0;
    }

    //Funcion CalcDaño
    public void calcDaño(int daño){
        int dañoFinal = daño - this.defensa;
        if (dañoFinal > 0) {
            this.vida -= dañoFinal;
        }
    }

}
