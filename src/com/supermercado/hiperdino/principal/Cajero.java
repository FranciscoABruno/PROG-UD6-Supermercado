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
        colaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return colaClientes.poll();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Queue<Cliente> getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(Queue<Cliente> colaClientes) {
        this.colaClientes = colaClientes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cajero\n");
        sb.append("===================================\n");
        sb.append("* Número de caja: ").append(numero).append("\n");
        sb.append("* Total de clientes: ").append(colaClientes.size()).append("\n");
        sb.append("* Clientes en la fila:\n");
        for (Cliente cliente : colaClientes) {
            sb.append(cliente.getNombre()).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }
}
