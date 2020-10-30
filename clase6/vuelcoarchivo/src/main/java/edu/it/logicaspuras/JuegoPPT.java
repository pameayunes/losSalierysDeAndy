package edu.it.logicaspuras;

import static edu.it.logicaspuras.Constantes.*;

public class JuegoPPT {
    public static Integer jugar(Integer jugada1, Integer jugada2) {
        if (jugada1 == jugada2) {
            return Empate;
        }

        switch (jugada1) {
            case Piedra:
                if (jugada2 == Papel) {
                    return GanaJugador2;
                }
                if (jugada2 == Tijera) {
                    return GanaJugador1;
                }
                break;
            case Papel:
                if (jugada2 == Piedra) {
                    return GanaJugador1;
                }
                if (jugada2 == Tijera) {
                    return GanaJugador2;
                }
                break;
            case Tijera:
                if (jugada2 == Piedra) {
                    return GanaJugador2;
                }
                if (jugada2 == Papel) {
                    return GanaJugador1;
                }
                break;
        }
        throw new RuntimeException("ALGO ESTA MAL EN LA FUNCION");
    }
}
