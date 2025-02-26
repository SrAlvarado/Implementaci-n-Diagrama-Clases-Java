package org.cuatrovientos.dam.ed.diagramaclases.ejercicio4;

class Producto {
    private String nombre;
    private int cantidad;
    private boolean comprado;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.comprado = false;
    }

    public void marcarComprado() {
        this.comprado = true;
    }

    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', cantidad=" + cantidad + ", comprado=" + comprado + "}";
    }
}
