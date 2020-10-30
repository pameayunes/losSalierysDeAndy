package edu.it;

import java.util.Scanner;
public class Consola {

    private static Scanner scanner = new Scanner(System.in);

    public static double leerNumero(String prompt) {
        return scanner.nextDouble();
    }

    public static double leerNumero(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Ingrese un valor enre " + min + " y " + max);
        }
        return value;
    }
}
