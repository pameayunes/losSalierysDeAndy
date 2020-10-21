package edu.it.polimorfismo;

public class JugadorMaquina implements JugadorPPT {
    // Aca debemos poner seleccionCompu
    public int obtenenerJugada() {
        System.out.println("Jugada de un jugador maquina");
        int seleccionCompu = (int)(Math.random() * 3) + 1;
        return seleccionCompu;
    }
}
