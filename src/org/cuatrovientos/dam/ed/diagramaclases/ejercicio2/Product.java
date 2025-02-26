package org.cuatrovientos.dam.ed.diagramaclases.ejercicio2;

class Product {
    private String name;
    private int qty;
    private float price;

    // Constructor vacío
    public Product() {}

    // Constructor con todos los atributos
    public Product(String name, int qty, float price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Método toString
    @Override
    public String toString() {
        return "Product{name='" + name + "', qty=" + qty + ", price=" + price + "}";
    }

    // Método total
    public float total() {
        return qty * price;
    }
}
