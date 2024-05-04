package com.supermercado.hiperdino.utilidades;

import java.util.Random;

import com.supermercado.hiperdino.principal.Producto;

public class Aleatorio {
    private static final String[] nombresProductos = { "Pan", "Leche", "Huevos", "Arroz", "Fideos", "Aceite", "Azúcar",
            "Sal", "Café", "Manzanas", "Plátanos", "Naranjas" };
    private static final Random random = new Random();

    public static Producto generarProductoAleatorio() {
        String nombre = nombresProductos[random.nextInt(nombresProductos.length)];
        double precio = Math.round(random.nextDouble() * 100 * 100.0) / 100.0; // Precio entre 0 y 100 con dos decimales
        return new Producto(nombre, precio);
    }

    public static String generarNombreAleatorio() {
        return "Cliente" + (random.nextInt(1000) + 1);
    }
}
