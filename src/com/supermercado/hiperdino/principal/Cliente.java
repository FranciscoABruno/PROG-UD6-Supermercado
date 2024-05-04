package com.supermercado.hiperdino.principal;

import java.util.Stack;

public class Cliente {
    private String nombre;
    private Stack<Producto> cestaDeCompra;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cestaDeCompra = new Stack<>();
    }

}
