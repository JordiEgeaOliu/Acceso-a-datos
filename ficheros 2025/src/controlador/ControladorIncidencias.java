package controlador;

import modelo.Pokemon;
import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;

public class ControladorIncidencias {


  public static void iniciar(){

      String tipo = Escaner.pedirTexto("tipo pokemon");
      String nombre = Escaner.pedirTexto("nombre del pojemon");
      String grcias = Escaner.pedirGracias("gracias");
        //aqui me kede
        ServicioFichero.guardar(tipo, nombre);
        ServicioFichero.guardar(new Pokemon(nombre,tipo));



    }






}
