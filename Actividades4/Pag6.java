package Actividades4;
import java.time.*;

public class Pag6 {
    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        //Indicar Atributos
        p1.setNombre("Peppa");
        p1.setEdad((byte)18);
        p1.setEstatura((double)1.8);

        p1.setNombre("Paco");
        p1.setEdad((byte)58);
        p1.setEstatura((double)1.5);

        p1.setNombre("Miguel");
        p1.setEdad((byte)20);
        p1.setEstatura((double)1.7);
    }
}
    class Persona {
        String nombre; //Atributos por defecto public
        byte edad;
        LocalDate fechaNacimiento;
        double estatura;
        
        public Persona(){ //Constructor por Defecto
        }

/*         public Persona(Persona p){ 
            this.nombre=
        } */

        public void setNombre(String Nombre){ //Método
        this.nombre=nombre;
        }

        public void setEdad(byte anyos){ //Método
        this.edad=anyos;
        }

        public void setEstatura(double metros){ //Método
        this.estatura=metros;
        }

        public void setNac(int anyos){ //Método
        this.fechaNacimiento=LocalDate.parse(fecha,fmt);;
        }

        public String getNombre(){ //Método
        return this.nombre;
        }

        public void saludar(){ //Método
        System.out.println("Hola a todos, soy " + nombre);
        } 

        public Persona2(String DNI,String fecha, double estatura){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt);
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
        }
        
        public void obtenerEdad(){
        Period periodo=Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes "+periodo.getYears()+" años");
        }
    }