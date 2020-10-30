package edu.it;

import java.text.NumberFormat;

public class ReporteHipoteca {
    private final NumberFormat moneda;
    private CalculadoraHipoteca calculadora;

    public ReporteHipoteca(CalculadoraHipoteca calculadora) {
        this.calculadora = calculadora;
        moneda = NumberFormat.getCurrencyInstance();
    }

    public void imprimirCalendarioPagos() {
        System.out.println();
        System.out.println("Programa de pagos");
        System.out.println("----------------");
        for (double balance : calculadora.obtenerBalance())
            System.out.println(moneda.format(balance));
    }

    public void imprimirHipoteca() {
        double hipoteca = calculadora.calcularHipoteca();
        String hipotecaFormateada = moneda.format(hipoteca);
        System.out.println();
        System.out.println("Hipoteca");
        System.out.println("--------");
        System.out.println("Pagos mensuales: " + hipotecaFormateada);
    }
}
