/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Lenovo
 */


import java.util.Scanner;
public class aplicacion {
    static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        int res = 1, jugadaU;
        String jugada, jugadaM;
        String[] jugadas = {"Piedra", "Papel", "Tijeras"};
        
        while (res == 1){
            
            System.out.print( "Jugador. Favor ingresar la jugada: [1:Piedra; 2:Papel; 3:Tijera]: ");
            jugadaU = entrada.nextInt();
            jugada = jugadas[jugadaU - 1];
            jugadaM = jugadas[ 1 + (int)(Math.random() * 1) ];
            
            if (("Piedra".equals(jugada)) && ("Tijeras".equals(jugadaM)))
                System.out.println ("Gano el jugador. La maquina jugo " + jugadaM);
                else if (("Papel".equals(jugada)) && ("Piedra".equals(jugadaM)))
                    System.out.println ( "Gana jugador. Maquina jugo " + jugadaM);
                else if (("Tijeras".equals(jugada)) && ("Papel".equals(jugadaM)))
                    System.out.print ("Gano jugador. La maquina jugo " + jugadaM);
            
            if (("Piedra".equals(jugadaM)) && ("Tijeras".equals(jugada)))
                System.out.println ("Gano la maquina. El jugador jugo " + jugada);
            else if (("Papel".equals(jugadaM)) && ("Tijeras".equals (jugada)))
                System.out.println ("Gano la maquina. El jugador jugo " + jugada);
            else if (("Tijeras".equals(jugadaM)) && ("Papel".equals(jugada)))
                System.out.println ("Gano la maquina. El jugador jugo " + jugada);
            
            if ((("Piedra".equals(jugadaM)) && ("Piedra".equals(jugada)) || (("Papel".equals(jugadaM)) && ("Papel".equals(jugada)))
            || (("Tijeras".equals (jugadaM)) && ("Tijeras".equals(jugada)))))
                    System.out.println ("Empate");
            
            System.out.print ("Desea continuar? 1:si 0: no ");
            res = entrada.nextInt();
                
        }
    }
}
