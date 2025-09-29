package vista;

import java.util.Scanner;

public class Escaner {



         private static Scanner sc = new Scanner(System.in);
        // aki me kede
        public static String pedirTexto(String mensaje) {
            System.out.print(mensaje);
            return sc.nextLine();

        }
        public static String pedirGracias(String pedirGracias){
            System.out.println("gracias");
            return pedirGracias;
        }
    }


