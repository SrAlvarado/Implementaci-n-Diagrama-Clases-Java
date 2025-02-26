package org.cuatrovientos.dam.ed.diagramaclases.ejercicio6;

class CuentaAhorro extends CuentaBancaria {
    private double interes;

    public CuentaAhorro(String numero, String titular, double saldo, double interes) {
        super(numero, titular, saldo);
        this.interes = interes;
    }

    public void aplicarInteres() {
        saldo += saldo * interes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Interés: " + interes);
    }
}