package RelacionEjercicios4.src.relacionEjercicio4;

import java.util.Scanner;

public class Pais { 
    private String nombre;
    private double PBI;
    private long poblacion; //tp dato + apropiado

    public Pais(String nombre, double PBI, long poblacion) {
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

    public double getPBI() {
        return PBI;
    }

    public void setPBI(double PBI) {
        PBI = PBI;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
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

    //Metodos

    //Operacion
    public void calcPPC(String nombrePais) {
        if (getNombre().equalsIgnoreCase(nombrePais)) {
            double resultado = (getPBI() * 100000) / getPoblacion();
            System.out.println("PIB per cápita: " + resultado);
        } else {
            System.out.println("El país no coincide con este objeto.");
        }
    }


}
