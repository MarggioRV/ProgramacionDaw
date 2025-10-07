import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter

/* 1. Escribe un programa que imprima buenos días, buenas tardes y buenas noches 
según la hora actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. 
(usa LocalDateTime) */

public class Ejer1 {
    public static void main(String[] args){

    LocalDateTime hora = LocalDateTime.now();
    System.out.println("El tiempo es: " + hora);

    // Extraer solo la hora 
    LocalTime Solohora = hora.toLocalTime();
    System.out.println("La hora es: " + Solohora);

    // Objetos tiempo, de LocalTime
    LocalTime MñInicio = LocalTime.of(6, 0);
    LocalTime MñFin = LocalTime.of(12, 0);
    LocalTime TdInicio = LocalTime.of(13, 0);
    LocalTime TdFin = LocalTime.of(20, 0);
    LocalTime NhInicio = LocalTime.of(21, 0);
    LocalTime NhFin = LocalTime.of(5, 59);


   // consicionales if entre horas
   // Logica: 
   // x.isBefore(y) = y es antes de x
   // x.isAfter(y) = y es despues de x

    if (!Solohora.isBefore(MñInicio) && !Solohora.isAfter(MñFin)) 
    {System.out.println("¡Buenos días!");}

    if (!Solohora.isBefore(TdInicio) && !Solohora.isAfter(TdFin)) 
    {System.out.println("¡Buenos Tardes!");}
    
    else if (!Solohora.isBefore(NhInicio) && !Solohora.isAfter(NhFin)) 
    {System.out.println("¡Buenas noches!");}

    else {
        System.out.println("¡Buenas Nada! Toca esperar....");
    }
  }
}



