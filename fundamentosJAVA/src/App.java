
public class App {
    //Definición de variables y constante globales
    public static boolean logico=true;
    final static double PI=3.141592;
    public static void main(String[] args) throws Exception {//En esta función se ejecuta lo que lleve dentro
    //Definición de variables
      //  (TIPO) IDENTFICADOR = VALOR;
      String cadena="me llamo Domingo";
      int edad=40;
      double salario=14.56785459875;
      int x=5;      int y=7;      int z=10;
      int xx=5,yy=7,zz=10;
    //Defino una variable y la inicializo y la imprimo
      int variable=0;
      System.out.println(variable); //Si no se inicializa dará error
      variable=33;
      System.out.println(variable);
    
    //Hay que guardar los datos en variables correctamente...
      int resultado=1/3;
      double resultado2=1/3.0;
      System.out.println(resultado);
      System.out.println(resultado2);
    //Es posible guardar variables de un tipo en otro compatible usando cast
      int a=(int)2.6;
      System.out.println(a);

    //Fíjate como se accede a la variable y constante global por el ámbito
      System.out.println(logico);
      logico=false;
      System.out.println(PI);
    
    //Tratamiento de carácter y entero (Código ASCII)
      int b='b';
      char c=98;
      System.out.println(b+" "+c);

      System.out.print("hola");
      System.out.println("hola");
    
    }
    // Documentación línea a línea de la función funcion
    // No va a sacar ningún resultado
    // No tiene parámetros
    /*
     * Definición de la función en varias líneas
     * asdfasdfasdfasf
     * asdfasdfadsf
     */
    /**
     * Programa para imprimir texto
     * @author Domingo López Oller
     * @param texto a imprimir
     * @version 1.0
     */
    public static void imprimirTexto(String texto){
        boolean logico=false;//Variable local
    }
}

