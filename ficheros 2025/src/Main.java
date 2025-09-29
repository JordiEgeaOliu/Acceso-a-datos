import controlador.ControladorIncidencias;

import java.io.BufferedReader;
import java.io.FileReader;
//import controlador.ControladorIncidencias;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         ControladorIncidencias.iniciar();
        //leerfichero();
    /*}

    private static void leerfichero() {
        String cadena;

        try{ FileReader fichero = new FileReader("C:\\Users\\joege\\Downloads\\java\\ficheros 2025\\datos\\incidencias.txt");
                BufferedReader leer = new BufferedReader(fichero);


            while ((cadena = leer.readLine()) != null) {
                System.out.println(cadena);
            }
2025-07-16;12:10:00;excepción test 3;usuario1
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }

        String cadena = "2025-07-16;12:10:00;excepción test 3;usuario1";

        String [] datos = null;
        datos = new String[4];

        datos = cadena.split(";");

        System.out.println(Arrays.toString(datos));*/


    }
}
