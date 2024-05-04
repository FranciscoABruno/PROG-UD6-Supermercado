package com.supermercado.hiperdino.principal;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int numero;
    private Queue<Cliente> colaClientes;

    public Cajero(int numero) {
        this.numero = numero;
        this.colaClientes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        colaDeClientes.add(cliente);
    }

}
