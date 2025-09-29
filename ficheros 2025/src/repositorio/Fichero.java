package repositorio;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fichero {

    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }


    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }

    public void addDato(String dato  ){
        //añadir linea al fichero


    }
    public String buscaraDato(String dato){
        //añadir linea al fichero

        return "";
    }
    public String buscaraDato(String dato, int columna  ){
        //añadir linea al fichero

    return "";
    }
    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal){
        //añadir linea al fichero




        return "";
    }

    public ArrayList<String> leerFichero( String leerFichero){
        //añadir linea al fichero




        return null;
    }




}
