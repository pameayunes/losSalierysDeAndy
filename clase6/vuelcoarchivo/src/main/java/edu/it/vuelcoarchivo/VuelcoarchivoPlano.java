package edu.it.vuelcoarchivo;

public class VuelcoarchivoPlano implements Vuelcoarchivo {
    @Override
    public void volcar() {
        int z1 = 1;
        for (int x : new int[100]) {
            System.out.println(z1++);
        }
    }
}
