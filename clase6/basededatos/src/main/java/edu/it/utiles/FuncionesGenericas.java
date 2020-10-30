package edu.it.utiles;

public class FuncionesGenericas {
    public static void ver(Object ...listaObjetos) {
        for (Object x : listaObjetos) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}
