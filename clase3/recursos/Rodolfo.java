/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.educacionit.ppt;
import java.util.Scanner;

public class App {
    public static String getGreeting() {
        return(
                "Bienvenidos al juego piedra, papel o tijera" +
                System.lineSeparator() + "Ingresa" +
                        System.lineSeparator() + "-------" +
                System.lineSeparator() + "1: Piedra" +
                System.lineSeparator() + "2: Papel"  +
                System.lineSeparator() + "3: Tijera" +
                        System.lineSeparator() + "-------"
        );
    }

    public static void printRtaUsuario(int respuesta){
        switch (respuesta){
            case 1:
                System.out.println("Tu elegiste piedra");
                break;
            case 2:
                System.out.println("Tu elegiste papel");
                break;
            case 3:
                System.out.println("Tu elegiste tijera");
                break;
        }
    }

    public static void printRtaMaquina(int respuesta){
        switch (respuesta){
            case 1:
                System.out.println("La maquina eligio piedra");
                break;
            case 2:
                System.out.println("La maquina eligio papel");
                break;
            case 3:
                System.out.println("La maquina eligio tijera");
                break;
        }
    }

    public static void printRta(int rtaUsuario, int rtaMaquina){
        switch (rtaUsuario){
            case 1:
                if(rtaMaquina == 1){
                    System.out.println("Empate: ambos eligieron piedra");
                } else if(rtaMaquina == 2){
                    System.out.println("Perdiste: papel le gana a piedra");
                } else if(rtaMaquina == 3) {
                    System.out.println("Ganaste: piedra le gana a tijera");
                }
                break;
            case 2:
                if(rtaMaquina == 1){
                    System.out.println("Ganaste: papel le gana a piedra");
                } else if(rtaMaquina == 2){
                    System.out.println("Empate: ambos eligieron papel");
                } else if(rtaMaquina == 3) {
                    System.out.println("Perdiste: tijera le gana a papel");
                }
                break;
            case 3:
                if(rtaMaquina == 1){
                    System.out.println("Perdiste: piedra le gana a tijera");
                } else if(rtaMaquina == 2){
                    System.out.println("Ganaste: tijera le gana a papel");
                } else if(rtaMaquina == 3){
                    System.out.println("Empate: ambos eligieron tijera");
                }
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rtaMaquina = (int)Math.floor((Math.random()*3)+1);
        System.out.println(new App().getGreeting());
        int rtaUsuario = scanner.nextInt();
        System.out.println("-------");
        printRtaUsuario(rtaUsuario);
        printRtaMaquina(rtaMaquina);
        printRta(rtaUsuario, rtaMaquina);
    }
}