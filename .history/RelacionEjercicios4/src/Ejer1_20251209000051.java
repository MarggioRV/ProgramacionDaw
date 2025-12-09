package RelacionEjercicios4.src;
import RelacionEjercicios4.src.relacionEjercicio4.Pais;

public class Ejer1 {
    public static void main(String[] args) {
         //Objeto
        Pais Perú = new Pais("Perú", 33000000, 223700000000L);
        Pais España = new Pais("España", 47000000, 4900000); 

        //LLamada
        System.out.println(Perú);
        España.calcPPC();
    }
}
