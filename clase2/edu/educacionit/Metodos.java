package edu.educacionit;

class Punto {
  public int x;
  public int y;
}

public class Metodos {
  private static int p1 = 1000;
  private static int suma(int x, int y) {
    return x+y;
  }
  public static int suma(int ...enteros) {
    int acumulador = 0;
    for (int x : enteros) {
      acumulador += x;
    }
    return acumulador;
  }
  public static void main(String[] args) {
    for (String s : args) {
      System.out.println(s);
    }
    System.out.println(suma(3,5));
    System.out.println(suma(suma(3,5), 8));

    System.out.println(suma(2,3,2,1,2,3,4,5,6,7,8,9,8,76,5,4,5,3,4,3,2,3,4));

    {
    int x;
    x = 2;
    Punto p;
    p = new Punto();
    p.x = 4;
    p.y = 10;
    Punto p1 = p;
    System.out.println(p1);
    }
  }
}