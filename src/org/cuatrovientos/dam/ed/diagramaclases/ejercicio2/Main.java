package org.cuatrovientos.dam.ed.diagramaclases.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Laptop", 1, 1200.0f);
        Product p2 = new Product("Mouse", 2, 25.0f);

        Invoice invoice = new Invoice("Juan Pérez");
        invoice.add(p1);
        invoice.add(p2);

        System.out.println(invoice);
        System.out.println("Total de la factura: " + invoice.total());

        invoice.remove(0); // Elimina el primer producto
        System.out.println("Después de eliminar un producto: " + invoice);
	}

}
