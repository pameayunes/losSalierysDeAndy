package edu.educacionit;

/*
Una interface es un contrato entre el que va a utilizar un objeto
y el objeto en si.
Si voy a utilizar un objeto que implementa Menu, el tipo de dato
que voy a necesitar es Menu
*/

/*
Que permite ????? 

*/

interface Menu {
 void mostrarItems();
}

// No tiene control de errores
class MenuSimple implements Menu {
  public void mostrarItems() {
     System.out.println("MenuSimple");
     System.out.println("Aca, hay que mostrar los items del menu");
  }   
}

class MenuComplejo implements Menu {
  public void mostrarItems() {
    System.out.println("MenuComplejo"); 
    System.out.println("Aca, vamos a aceptar varios reintentos");
  }
}

public class Polimorfismo {
  public static void main(String ...params) throws Exception {
    Menu m = (Menu)Class.forName(params[0]).newInstance();
    m.mostrarItems();         
  }
}