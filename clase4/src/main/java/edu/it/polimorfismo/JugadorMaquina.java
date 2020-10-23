package edu.it.polimorfismo;

import edu.it.logicaspuras.Constantes;

public class JugadorMaquina implements JugadorPPT {
    private int seleccionCompu;
    private String nombre;

    public JugadorMaquina(String nombreParam) {
        nombre = nombreParam;
    }
    public int obtenenerJugada() {
        System.out.println("Jugada de: ".concat(nombre));
        seleccionCompu = (int)(Math.random() * 3) + 1;
        return seleccionCompu;
    }

    @Override
    public void informarResultado() {
        String str = String.join(" ",
                "El jugador", nombre,
                "selecciono",
                Constantes.literalesPPT[seleccionCompu-1]);

        System.out.println(str);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}
