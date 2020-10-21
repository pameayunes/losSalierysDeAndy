package edu.it.polimorfismo;

import java.util.Scanner;

public class JugadorPersona implements JugadorPPT {
    // Aca demo
    public int obtenenerJugada() {
        System.out.println("Jugada de un jugador Persona");
        System.out.println("piedra, papel o tijera");
        Scanner teclado = new Scanner(System.in);

        int seleccionUsuario = teclado.nextInt();

        return seleccionUsuario;
    }
}
