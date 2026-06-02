package net.salesianos.cafeteria;

import java.util.Objects;

public class Pedido {
    private String codigo;
    private String cliente;
    private String producto;
    private boolean paraLlevar;

    public Pedido(String codigo, String cliente, String producto, boolean paraLlevar) {
        
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.paraLlevar = paraLlevar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente() {
        
    }
}
