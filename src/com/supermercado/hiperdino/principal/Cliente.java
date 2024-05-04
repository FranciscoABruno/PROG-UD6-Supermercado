package com.supermercado.hiperdino.principal;

import java.util.Stack;

public class Cliente {
    private String nombre;
    private Stack<Producto> cestaDeCompra;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cestaDeCompra = new Stack<>();
    }

    public void agregarProducto(Producto producto) {
        cestaDeCompra.push(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stack<Producto> getCestaDeCompra() {
        return cestaDeCompra;
    }

    public void setCestaDeCompra(Stack<Producto> cestaDeCompra) {
        this.cestaDeCompra = cestaDeCompra;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================\n");
        sb.append("* Nombre: ").append(nombre).append("\n");
        sb.append("* Total de productos: ").append(cestaDeCompra.size()).append("\n");
        sb.append("* Lista de artículos en la cesta:\n");
        for (Producto producto : cestaDeCompra) {
            sb.append(producto.getNombre()).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }

}
