package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Incidencia {
    private LocalDate fecha;
    private String usuario;
    private LocalTime hora;


    public Incidencia(LocalDate fecha, LocalTime hora, String usuario) {
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "fecha=" + fecha +
                ", usuario='" + usuario + '\'' +
                ", hora=" + hora +
                '}';
    }
}
