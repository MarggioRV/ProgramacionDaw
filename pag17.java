

// public class pag17 {

// ALGORITMO ResolverLaberinto
//  DADO un laberinto representado por una matriz:
//  0 = camino libre
//  # = pared
//  INICIO = (0,0)
//  FIN = (N-1, N-1)
//  CREAR solucion[N][N] con ceros
//  SI resolverDesde(0,0,laberinto,solucion) = VERDADERO ENTONCES
//  imprimir(solucion)
//  SINO
//  ESCRIBIR "No existe camino"
// FIN ALGORITMO    

//     public static void main(String[] args) {
//         //Laberinto
//         char[][] laberinto = {
//             {'0', '#', '0', '0', '0'},
//             {'0', '#', '0', '#', '0'},
//             {'0', '0', '0', '#', '0'},
//             {'#', '#', '0', '0', '0'},
//             {'0', '0', '#', '#', '0'}
//         };
//     };

//     for(int i=0;i<laberinto.length;i++){
//         for(int i=0;i<laberinto[1].length;i++){
//             System.out.print(laberinto[i][j]+" ");
//         }
//     }
//     final char camino='0';
//     final char pared='#'; 
    
//     //Punto de Inicio y fin del laberinto
//     final int INICIO=0;
//     final int limiteX=laberinto.length;
//     final int limiteY=laberinto[0].length;

//     Scanner teclado = new Scanner(System.in);
//     System.out.println("¿Para donde quieres ir?");
//     System.out.println("Arriba/Abajo/Derecha/Izquierda");

//     //Crear matriz rpta
//     int[][] solucion=new int fila;
// }

//     //Funcion Public Static
//     public static boolean resolverDesde(int x, int y, char[][] laberinto, int [][] solucion){
//     solucion[x][y]=1;
//     //Analizo el resto de camninos posibles
//     if (resolverDesde(x+1, y, laberinto, solucion)= true) {}
//     if (resolverDesde(x, y, laberinto, solucion)= true) {}
//     if (resolverDesde(x, y, laberinto, solucion)= true) {}
//     if (resolverDesde(x, y, laberinto, solucion)= true) {}
//     if (resolverDesde(x, y, laberinto, solucion)= true) {}
//     //Black
//     solucion[x][y]
//     };



//     public static{:}
// }