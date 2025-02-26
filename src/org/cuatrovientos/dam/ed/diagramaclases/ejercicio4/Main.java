package org.cuatrovientos.dam.ed.diagramaclases.ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("Ana Gómez");
        usuario.crearLista();

        Producto p1 = new Producto("Manzanas", 5);
        Producto p2 = new Producto("Leche", 2);

        usuario.añadirProducto(p1);
        usuario.añadirProducto(p2);

        System.out.println("Lista de la compra:");
        usuario.verLista();

        usuario.tacharProducto(0); // Tacha el primer producto
        System.out.println("Después de tachar un producto:");
        usuario.verLista();
	}

}
