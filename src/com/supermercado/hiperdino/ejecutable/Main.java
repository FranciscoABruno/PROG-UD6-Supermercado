package com.supermercado.hiperdino.ejecutable;

import com.supermercado.hiperdino.principal.Cajero;
import com.supermercado.hiperdino.principal.Cliente;
import com.supermercado.hiperdino.utilidades.Aleatorio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Cajero cajero;
    private static boolean cajaAbierta = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cajero = new Cajero(1);
        Queue<Cliente> clientesPendientes = new LinkedList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    if (cajaAbierta) {
                        System.out.println("La caja está abierta");
                    } else {
                        cajaAbierta = true;
                        System.out.println("Caja abierta correctamente");
                    }
                    break;
                case 2:
                    if (!cajaAbierta) {
                        System.out.println("La caja está cerrada. No se pueden añadir clientes.");
                        break;
                    }
                    Cliente nuevoCliente = new Cliente(Aleatorio.generarNombreAleatorio());
                    int numProductos = (int) (Math.random() * 10) + 1; // Entre 1 y 10 productos aleatorios
                    for (int i = 0; i < numProductos; i++) {
                        nuevoCliente.agregarProducto(Aleatorio.generarProductoAleatorio());
                    }
                    cajero.agregarCliente(nuevoCliente);
                    clientesPendientes.add(nuevoCliente);
                    System.out.println("Cliente añadido a la cola: " + nuevoCliente.getNombre());
                    break;
                case 3:
                    if (cajero.getTotalClientes() == 0) {
                        System.out.println("No hay clientes para atender.");
                    } else {
                        Cliente clienteAtendido = cajero.atenderCliente();
                        System.out.println("Cliente atendido: " + clienteAtendido.getNombre());
                    }
                    break;
                case 4:
                    System.out.println(cajero);
                    break;
                case 5:
                    if (cajaAbierta && cajero.getTotalClientes() == 0) {
                        cajaAbierta = false;
                        System.out.println("cerrado correctamente.");
                    } else if (!cajaAbierta) {
                        System.out.println("la caja está cerrada.");
                    } else {
                        System.out.println("no se puede cerrar la caja mientras haya clientes esperando.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== Supermercado Hiperdino =====");
        System.out.println("1. Abrir caja:");
        System.out.println("2. Añadir un nuevo cliente a la cola:");
        System.out.println("3. Atender un cliente:");
        System.out.println("4. Ver clientes pendientes:");
        System.out.println("5. Cerrar supermercado:");
        System.out.println("6. Salir del programa:");
        System.out.print("Selecciona una opción: ");
        System.out.print("\n===================================");
    }
}
