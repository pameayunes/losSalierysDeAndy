package edu.it.vuelcoarchivo;

public class VuelcoarchivoHTML implements Vuelcoarchivo {
    public void volcar() {
        int z1 = 1;
        System.out.println("<H1>SALIDA EN HTML</H1>");
        System.out.println("<table>");
        for (int x : new int[100]) {
            System.out.println("<tr>");
            System.out.println("<td>");
            System.out.println(z1++);
            System.out.println("<td>");
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
