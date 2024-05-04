package com.supermercado.hiperdino.ejecutable;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.supermercado.hiperdino.principal.Cajero;
import com.supermercado.hiperdino.principal.Cliente;

public class Main {
    private static Cajero cajero;
    private static boolean cajaAbierta = false;

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
         cajero = new Cajero(1); // Creamos un cajero con número 1
        Queue<Cliente> clientesPendientes = new LinkedList<>();
    }
}
