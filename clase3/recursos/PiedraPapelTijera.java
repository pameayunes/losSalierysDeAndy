package JavaPracticas;

import javax.swing.*;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador <=2) {
		
		String[] botones = { "Piedra", "Papel", "Tijeras" };
		int ventana = JOptionPane.showOptionDialog(null, "Elija una opcion:", null,
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]); 

			String maquina=" ";
			
			int aleatorio = (int)(Math.random()*100);
			
			if (aleatorio <=33) {
				
				maquina = "Piedra";
				
			}
			else if (aleatorio >= 34 && aleatorio <= 66) {
				
				maquina = " Papel";
			}
			
			else {
				
				maquina = "Tijeras";
			}
				
			
			System.out.println("Usted eligio " + botones[ventana] + ", la maquina eligio " + maquina);
		
			contador++;
		}
		
	}

}
