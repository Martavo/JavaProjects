package M3_EjemplosClase;

import java.util.Scanner;

public class M3_Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saludo;
		
		byte hora = 20;
		
		if (hora <= 12) {
			saludo = "Buenos días";
		} else if (hora < 20) {
			saludo = "Buenas tardes";
		}else if (hora <=22) {
			saludo = "Buenas noches";
		}else {
			saludo = "Deberías estar durmiendo";
		}
		
		System.out.println(saludo);
	}

}
