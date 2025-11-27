import clases.Juego;
import clases.Jugador;


public class ActividadJuego {
    //Incializacion de todo el codigo del juego
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Laura");
        Juego juego = new Juego(jugador);
        juego.setJugador(jugador);
        juego.iniciarJuego();
    }

}

