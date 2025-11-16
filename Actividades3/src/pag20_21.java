package Actividades3.src;

import java.util.Scanner;

public class pag20_21 {
// ALGORITMO OchoReinas
//  CREAR tablero[8][8] con ceros
//  LEER primeraColumna
//  tablero[0][primeraColumna] 1 ←
//  SI resolver(tablero, 1) = VERDADERO ENTONCES
//  imprimirTablero(tablero)
//  SINO
//  ESCRIBIR "No hay solución con la reina en esa columna"
//  FIN_SI
// FIN_ALGORITMO
    
    static final char CAMINO = '0';
    static final char PIEZA='#';
    public static void main(String[] args) {

        //Tablero
        char[][] tablero = {
            {'0', '#', '#', '0', '#'},
            {'#', '0', '#', '#', '0'},
            {'0', '#', '0', '#', '0'},
            {'#', '0', '#', '0', '#'},
            {'0', '#', '0', '#', '0'},
            {'#', '0', '#', '0', '#'},
            {'0', '#', '0', '#', '0'},
            {'#', '0', '0', '#', '0'},
        };

        //Matriz solución
         int[][] solucion = new int[tablero.length][tablero[0].length];

         for (int i = 0; i < tablero.length; i++) {
            char primeraColumna = tablero[i][0]; 
            System.out.println(primeraColumna);
        }

        Scanner teclado = new Scanner(System.in);
        
        //Viendo coordenadas
        System.out.println("Elige: ");
        int opcion1 = teclado.nextInt();
        System.out.println("Elige: ");
        int opcion2 = teclado.nextInt();
        System.out.println("Elegiste : " + (tablero[opcion1-1][opcion2-1]));
        System.out.println();
        
        //Leer 1era columna
        System.out.println("Introduce calor de x: ");
        System.out.println();
        int primeraColumna = teclado.nextInt();
    }


    //1era, detecta la meta
    public static boolean noMeta(int x, int y, char[][] tablero, int[][] solucion){
        if(x == tablero.length - 1 && y == tablero[0].length - 1){
            solucion[x][y]=1;
            return true;
        }
        return false;
    }

    //Ver si es cruzable
    public static boolean esSeguro(int x, int y, char[][] tablero){
        return x >= 0 && x < tablero.length &&
               y >= 0 && y < tablero[0].length &&
               tablero[x][y] == CAMINO;
    }

    public static boolean puedeSaltar(int x, int y, int cambioX, int cambioY, char[][] tablero){
    //Lógica: inicio (x,y), medio (pieza a saltar), final
        int saltoIntermedioX = x + cambioX;      
        int saltoIntermedioY = y + cambioY;
        int saltoDestinoX = x + 2 * cambioX;   
        int saltoDestinoY = y + 2 * cambioY;

        //Comprobando limites
        if(saltoDestinoX < 0 || saltoDestinoX >= tablero.length || saltoDestinoY < 0 || saltoDestinoY >= tablero[0].length){
        return false;
        }

        /* Hay salto, solo si el del medio es una pieza */
        return tablero[saltoIntermedioX][saltoIntermedioY] == PIEZA && tablero[saltoDestinoX][saltoDestinoY] == '0';
    }

     
    //ResolverDesde...
    public static boolean resolverDesde(int x, int y, char[][] tablero, int[][] solucion){
    
    if(noMeta(x, y, tablero, solucion)) {
        return true;
    }

    if(esSeguro(x, y, tablero)) {
        solucion[x][y] = 1;

        if(resolverDesde(x+1, y, tablero, solucion)) return true;
        if(resolverDesde(x, y+1, tablero, solucion)) return true;
        if(resolverDesde(x-1, y, tablero, solucion)) return true;
        if(resolverDesde(x, y-1, tablero, solucion)) return true;
           
        //Backtracking***
        solucion[x][y] = 0; 
    }
    return false;
}
}
