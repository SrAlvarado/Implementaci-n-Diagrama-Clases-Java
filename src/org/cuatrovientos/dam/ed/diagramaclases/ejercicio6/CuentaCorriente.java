package org.cuatrovientos.dam.ed.diagramaclases.ejercicio6;

class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    public CuentaCorriente(String numero, String titular, double saldo, double limiteDescubierto) {
        super(numero, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto >= -limiteDescubierto) {
            saldo -= monto;
        } else {
            System.out.println("Límite de descubierto excedido.");
        }
    }
}