package programacionfuncional;

import com.bolivarsoft.interfaces.ItemMenu;

import static edu.it.utiles.FuncionesGenericas.ver;

public class Ejemplos implements ItemMenu {
    private void realizarOperacion(int uno, int dos, OperadorEnteros op) {
        int rsp = op.operar(uno, dos);
        ver(rsp);
    }
    public void ejecutar() {
        OperadorEnteros opSuma = (x,y)->x+y;
        OperadorEnteros opMult = (x,y)->x*y;

        realizarOperacion(11,5, (x,y)->x-y);
        realizarOperacion(11,5, (x,y)->x+y);
        realizarOperacion(11,5, opMult);
    }
}
