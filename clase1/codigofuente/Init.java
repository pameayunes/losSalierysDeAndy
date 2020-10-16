package clase1.codigofuente;

public class Init {
    public static void main (String [ ] args) {
        for (int x = 0; x < 10; x++) {
            System.out.print("Bienvenidos al curso de java ");
            for (int i = 0; i < x; i++) {
                System.out.print("!");
                System.out.print("<hr />");
            }
            System.out.println();
        }
    }
} 