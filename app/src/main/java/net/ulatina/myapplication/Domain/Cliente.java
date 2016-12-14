package net.ulatina.myapplication.Domain;

import java.util.List;

/**
 * Created by ranvli on 12/14/2016.
 */
public class Cliente {

    private String nombre;
    private int edad;
    private TipoCliente tipoCliente;
    private List<Producto> productos;

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
