
import clases2.*;

public class ActividadClases {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad(150, "Medellín", 4);
        Fecha fecha1 = new Fecha(1,1,2001);
        
        //Crear persona
        Persona p1 = new Persona("Carlos", "12345678A", "Gómez", 'M');
        p1.setFecha(fecha1);
        p1.CiudadNacimiento(ciudad1);

        //Usar Metdos e Imprimir
        p1.saludar();
        System.out.println("-----------------------------");
        p1.imprimeDatos();
        System.out.println("-----------------------------");
    }
}   

