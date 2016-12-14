package net.ulatina.myapplication.Domain;

/**
 * Created by ranvli on 12/14/2016.
 */

public class Producto {

    private String nombre;
    private Tipo tipo;
    private Estado estado;


    public Producto() {

        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;

    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }
    public String getNombre() {
        return nombre;
    }
    public Tipo getTipo() {
        return tipo;
    }


}

