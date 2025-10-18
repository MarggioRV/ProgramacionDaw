package lb;

import javax.sound.midi.SysexMessage;

public class arrays {
public static void main(String[] args) {
    

    //Borra 1 elemento+
    int[] vectorPrueba={1,2,3};
    int[] vectorFinal;
    System.out.println(vectorPrueba.length);

    //1ro: Reserva memoria para el elemento+
    vectorFinal=new int[vectorPrueba.length+1];
    for(int i=0; i<vectorPrueba.length;i++){
        System.out.print(vectorFinal[i]+"");
    }
    System.out.println();
}

// public static int() {
    
// }
}
