package Tema5.src;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        try {
            File fichero = new  File("./Temaa5/heores.json");
            System.out.println(fichero.exists());
            System.out.println("Nombre " + fichero.getName());
            System.out.println("Permiso_Lectura " + fichero.canRead());
            System.out.println("Permiso_Escritura " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

