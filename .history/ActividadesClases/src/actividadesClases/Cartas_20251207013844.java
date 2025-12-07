package actividadesClases;

public class Cartas {
    int valor;
    String palo;

    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }


    @Override
    public String toString() {
        return "Cartas [valor=" + valor + ", palo=" + palo + "]";
    }
}
