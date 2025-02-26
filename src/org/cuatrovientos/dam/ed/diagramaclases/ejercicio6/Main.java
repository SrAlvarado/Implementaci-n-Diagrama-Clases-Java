package org.cuatrovientos.dam.ed.diagramaclases.ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CuentaBancaria cuenta1 = new CuentaBancaria("12345", "Juan Pérez", 1000);
	        CuentaAhorro cuenta2 = new CuentaAhorro("67890", "Ana Gómez", 2000, 0.05);
	        CuentaCorriente cuenta3 = new CuentaCorriente("54321", "Carlos López", 500, 1000);

	        cuenta1.mostrarInformacion();
	        cuenta2.mostrarInformacion();
	        cuenta3.mostrarInformacion();

	        cuenta2.aplicarInteres();
	        cuenta2.mostrarInformacion();

	        cuenta3.retirar(1500);
	        cuenta3.mostrarInformacion();
	}

}
