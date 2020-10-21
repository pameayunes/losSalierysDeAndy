package edu.it.utiles;

import java.util.Scanner;

public class Utiles {
    public static boolean quiereSeguirJugando() {
        System.out.println(System.lineSeparator());
        System.out.println("Este juego ha conlcuido !!!!");
        System.out.println("Presione 1 si quiere continuar con otro juego !!!");
        System.out.println(System.lineSeparator());
        Scanner teclado = new Scanner(System.in);
        int seleccionUsuario = teclado.nextInt();
        System.out.println(System.lineSeparator());
        if (seleccionUsuario==1) {
            return true;
        }
        return false;
    }
}
