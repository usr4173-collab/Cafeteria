package net.salesianos.torneo;

import java.util.Objects;

public class Participante {
    
    private String idJugador;
    private String nombre;
    private String categoria;

     public Participante(String idJugador, String nombre, String categoria) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Participante: " +
                "idJugador: " + idJugador + '\n' +
                "Nombre: " + nombre + '\n' +
                "Categoria: " + categoria + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Participante that)) return false;
        return Objects.equals(idJugador, that.idJugador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJugador);
    }
}
