package org.cuatrovientos.dam.ed.diagramaclases.ejercicio4;

import java.util.ArrayList;
import java.util.List;

class ListaCompra {
    private List<Producto> productos;

    public ListaCompra() {
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            productos.remove(index);
        }
    }

    public void marcarComprado(int index) {
        if (index >= 0 && index < productos.size()) {
            productos.get(index).marcarComprado();
        }
    }

    public void mostrarLista() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
