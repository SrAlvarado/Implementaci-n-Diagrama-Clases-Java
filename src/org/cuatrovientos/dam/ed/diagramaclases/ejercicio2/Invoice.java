package org.cuatrovientos.dam.ed.diagramaclases.ejercicio2;

import java.util.ArrayList;
import java.util.List;

//Clase Invoice
class Invoice {
 private String customer;
 private List<Product> products;

 // Constructor con un parámetro
 public Invoice(String customer) {
     this.customer = customer;
     this.products = new ArrayList<>();
 }

 // Método para añadir un producto
 public void add(Product product) {
     products.add(product);
 }

 // Método para eliminar un producto por índice
 public void remove(int index) {
     if (index >= 0 && index < products.size()) {
         products.remove(index);
     }
 }

 // Método para calcular el total de la factura
 public float total() {
     float sum = 0;
     for (Product product : products) {
         sum += product.total();
     }
     return sum;
 }

 // Método para mostrar la información de la factura
 @Override
 public String toString() {
     return "Invoice{customer='" + customer + "', products=" + products + "}";
 }
}
