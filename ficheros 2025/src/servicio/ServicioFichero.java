package servicio;

import modelo.Pokemon;
import repositorio.Fichero;

public class ServicioFichero {

    public static void guardar(String tipo, String nombre){


        Pokemon pikachu = new Pokemon(tipo, nombre);
        Fichero pokedesc= new Fichero("datos/pokemon.txt");
        pokedesc.addDato(pikachu.toString());

    }
    public static void guardar(Pokemon mipoke){

        Fichero pokedesc= new Fichero("datos/pokemon.txt");
      //  pokedesc.addDato(pikachu.to);



    }




    }
