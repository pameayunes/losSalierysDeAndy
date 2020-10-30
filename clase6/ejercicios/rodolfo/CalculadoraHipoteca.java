package edu.it;


public class CalculadoraHipoteca {
    private final static byte NUM_DE_MESES = 12;
    private final static byte PORCENTAJE = 100;

    private int principal;
    private float interesAnual;
    private byte anios;

    public CalculadoraHipoteca(int principal, float interesAnual, byte anios) {
        this.principal = principal;
        this.interesAnual = interesAnual;
        this.anios = anios;
    }

    public double calcularBalance(short numberOfPaymentsMade) {
        float interesMensual = getInteresMensual();
        float numeroDePagos = getNumeroDePagos();

        double balance = principal
                * (Math.pow(1 + interesMensual, numeroDePagos) - Math.pow(1 + interesMensual, numberOfPaymentsMade))
                / (Math.pow(1 + interesMensual, numeroDePagos) - 1);

        return balance;
    }

    public double calcularHipoteca() {
        float interesMensual = getInteresMensual();
        float numeroDePagos = getNumeroDePagos();

        double hipoteca = principal
                * (interesMensual * Math.pow(1 + interesMensual, numeroDePagos))
                / (Math.pow(1 + interesMensual, numeroDePagos) - 1);

        return hipoteca;
    }

    public double[] obtenerBalance() {
        double[] balances = new double[getNumeroDePagos()];
        for (short mes = 1; mes <= balances.length; mes++)
            balances[mes - 1] = calcularBalance(mes);

        return balances;
    }

    private float getInteresMensual() {
        return interesAnual / PORCENTAJE / NUM_DE_MESES;
    }

    private int getNumeroDePagos() {
        return anios * NUM_DE_MESES;
    }
}
