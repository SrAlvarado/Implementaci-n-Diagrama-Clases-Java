package org.cuatrovientos.dam.ed.diagramaclases.ejercicio4;

class Usuario {
    private String nombre;
    private ListaCompra listaCompra;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.listaCompra = new ListaCompra();
    }

    public void crearLista() {
        this.listaCompra = new ListaCompra();
    }

    public void añadirProducto(Producto producto) {
        listaCompra.añadirProducto(producto);
    }

    public void tacharProducto(int index) {
        listaCompra.marcarComprado(index);
    }

    public void verLista() {
        listaCompra.mostrarLista();
    }
}

