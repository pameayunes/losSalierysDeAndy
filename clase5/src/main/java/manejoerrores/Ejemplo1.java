package manejoerrores;

import com.bolivarsoft.interfaces.ItemMenu;
import edu.it.errores.XNoPuedeValer1005Exception;
import edu.it.errores.XNoPuedeValer1010Exception;

import static edu.it.utiles.FuncionesGenericas.ver;

public class Ejemplo1 implements ItemMenu {

    private void m6(int x) {
        ver("Llegue finalmente a:", "m6");
        ver("Valor de x:", x);

        /*
        for (;;) // 3 veces o reintentos
        try {
        }
        catch (Exception ex) {
            throw new RuntimeException("El servicio del hotel ");
        }
        */

        if (x == 1005) {
            throw new XNoPuedeValer1005Exception();
        }
        if (x == 1010) {
            throw new XNoPuedeValer1010Exception();
        }
    }
    private void m5(int x)  {
        ver("Antes de invocar a ", "m6");
        ver("Valor de x: ", x);
        m6(x+1);
        ver("Despues de invocar a:", "m6");
    }
    private void m4(int x)  {
        ver("Antes de invocar a ", "m5");
        ver("Valor de x: ", x);
        m5(x+1);
        ver("Despues de invocar a:", "m5");
    }
    private void m3(int x) {
        ver("Antes de invocar a ", "m4");
        ver("Valor de x: ", x);
        m4(x+1);
        ver("Despues de invocar a:", "m4");
    }
    private void m2(int x) {
        ver("Antes de invocar a ", "m3");
        ver("Valor de x: ", x);
        m3(x+1);
        ver("Despues de invocar a:", "m3");
    }
    private void m1(int x) {
        ver("Antes de invocar a ", "m2");
        ver("Valor de x: ", x);
        m2(x+1);
        ver("Despues de invocar a:", "m2");
    }
    public void ejecutar() {
        try {
            m1(1000);
            ver("Se ejecuto normalmente");
        }
        catch (XNoPuedeValer1005Exception ex) {
            ver("Atencion que x no puede valer 1005");
        }
        catch (XNoPuedeValer1010Exception ex) {
            ver("Atencion que x no puede valer 1010");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
