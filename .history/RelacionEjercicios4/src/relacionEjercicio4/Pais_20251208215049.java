package RelacionEjercicios4.src.relacionEjercicio4;

public class Pais { 
    private String nombre;
    private String PBI;
    private double poblacion;

    public Pais(String nombre, String capital, double poblacion) {
        this.nombre = nombre;
        this.PBI= PBI;
        this.poblacion = poblacion;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPBI() {
        return PBI;
    }

    public void setPBI(String pBI) {
        PBI = pBI;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + PBI + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

}
