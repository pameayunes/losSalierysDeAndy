package edu.it.polimorfismo;

import edu.it.logicaspuras.Constantes;

import java.util.Scanner;

public class JugadorPersona implements JugadorPPT {
    private int seleccionUsuario;
    private String nombre;

    public JugadorPersona(String nombre) {
        this.nombre = nombre;
    }

    public int obtenenerJugada() {
        System.out.println("Jugada de: ".concat(nombre));
        System.out.println("piedra, papel o tijera");
        Scanner teclado = new Scanner(System.in);

        seleccionUsuario = teclado.nextInt();

        return seleccionUsuario;
    }
    public void informarResultado() {
        String str = String.join(" ",
                "El jugador", nombre,
                "selecciono",
                Constantes.literalesPPT[seleccionUsuario-1]);

        System.out.println(str);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }


}
