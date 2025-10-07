public class Bucles {
    public static void main(String[] args) {
        // //Caso básico de bucle
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }
        // int j=0;
        // //Bucle infinito
        // while(j<5){
        //     System.out.println(j);
        //     j++;
        // }

        // //Bucle anidados
         for(int i=1;i<=4;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
        System.out.println(""); 
         }

        //Bucle anidados
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
        System.out.println(""); 
        }
    }
}

