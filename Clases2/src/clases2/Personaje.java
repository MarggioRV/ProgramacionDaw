package clases;

public class Personaje {
    String Tipo_Ataque;
    String nombre;
    int vida;
    Tipo tipo;
    int defensa;

    enum Tipo {Heroe, Mago, Orco}
    
    //Constructor
    public Personaje(String tipo_Ataque, String nombre, int vida, Tipo tipo, int defensa) {
        Tipo_Ataque = tipo_Ataque;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.defensa = defensa;
    }
    
    //Getters y Setters

    public String getTipo_Ataque() {
        return Tipo_Ataque;
    }

    public void setTipo_Ataque(String tipo_Ataque) {
        Tipo_Ataque = tipo_Ataque;
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
    Boolean estaVivo(int vida) {
        return this.vida > 0;
    }

    //Funcion CalcDaño
    public void CalcDaño(int daño){
        int dañoFinal = daño - this.defensa;
        if (dañoFinal > 0) {
            this.vida -= dañoFinal;
        }
    }

}
