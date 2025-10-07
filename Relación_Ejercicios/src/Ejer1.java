import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter

/* 1. Escribe un programa que imprima buenos días, buenas tardes y buenas noches 
según la hora actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. 
(usa LocalDateTime) */

public class Ejer1 {
    public static void main(String[] args){

    LocalDateTime ahora = LocalDateTime.now();
    System.out.println("El tiempo es: " + ahora);

    // Objetos tiempo, de LocalTime
    LocalDateTime MñInicio = LocalDateTime.of(2025, 10, 7, 6, 0, 0);
    LocalDateTime MñFin = LocalDateTime.of(2025, 10, 7,12, 0);
    LocalDateTime TdInicio = LocalDateTime.of(2025, 10, 7,13, 0);
    LocalDateTime TdFin = LocalDateTime.of(2025, 10, 7,20, 0);
    LocalDateTime NhInicio = LocalDateTime.of(2025, 10, 7,21, 0);
    LocalDateTime NhFin = LocalDateTime.of(2025, 10, 7,5, 59);

   // consicionales if entre horas
   // Logica: 
   // x.isBefore(y) = y es antes de x
   // x.isAfter(y) = y es despues de x

    if (!ahora.isBefore(MñInicio) && !ahora.isAfter(MñFin)) 
    {System.out.println("¡Buenos días!");}

    if (!ahora.isBefore(TdInicio) && !ahora.isAfter(TdFin)) 
    {System.out.println("¡Buenas tardes!");}
    
    else if (!ahora.isBefore(NhInicio) && !ahora.isAfter(NhFin)) 
    {System.out.println("¡Buenas noches!");}

    else {
        System.out.println("¡Buenas nada! Toca esperar....");
    }
  }
}



