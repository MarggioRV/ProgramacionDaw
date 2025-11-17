public class Persona {
    String nombre; //Atributos por defecto public
    byte edad;
    double estatura;
	
    public Persona(){ //Constructor

    }
    public Persona(String nombre,byte edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Persona(Persona4 p){
        this.nombre=p.getNombre();
        this.edad=p.getEdad();
        this.estatura=p.getEstatura();
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(byte anyos){
        this.edad=anyos;
    }
    public byte getEdad(){
        return this.edad;
    }
    public void setEstatura(double altura){
        this.estatura=altura;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public void saludar(){ //Método
        System.out.println("Hola a todos, soy "+nombre);
    }
    public void imprimeDatos(){
        System.out.println("Te llamas "+nombre+", tienes "+edad+" años y mides "+estatura);
    }
    public static void main(String[] args) {
        Persona4 p1=new Persona4();
        Persona4 p2=new Persona4();
        Persona4 p3=new Persona4();
        Persona4 p4=new Persona4("Domingo",(byte)40);
        Persona4 p5=new Persona4(p4);
        Persona4 p6; p6=p5;
        p4.setNombre("ÁLVARO");
        //Indicar los atributos con sus funciones
        p1.setNombre("Pepa");
        p1.setEdad((byte)18);
        p1.setEstatura(1.87);
        p2.setNombre("Paco");
        p2.setEdad((byte)51);
        p2.setEstatura(1.68);
        p3.setNombre("Miguel");
        p3.setEdad((byte)27);
        p3.setEstatura(1.79);
        p4.setEstatura(1.70);

        //Imprimir los datos de cada objeto
        p1.imprimeDatos();
        p2.imprimeDatos();
        p3.imprimeDatos();
        p4.imprimeDatos();
        p5.imprimeDatos();




    }
}