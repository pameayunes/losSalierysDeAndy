package edu.it;


public class Main {

    public static void main(String[] args) {
        int principal = (int) Consola.leerNumero(
                "Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Consola.leerNumero(
                "Tasa de interes anual: ", 1, 30);
        byte years = (byte) Consola.leerNumero(
                "Periodo (Anios): ", 1, 30);

        CalculadoraHipoteca calculator = new CalculadoraHipoteca(
                principal, annualInterest, years);

        ReporteHipoteca report = new ReporteHipoteca(calculator);
        report.imprimirHipoteca();
        report.imprimirCalendarioPagos();
    }
}
