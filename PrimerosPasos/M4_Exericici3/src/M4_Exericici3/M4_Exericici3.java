package M4_Exericici3;

import java.util.ArrayList;
import java.util.Scanner;

public class M4_Exericici3 {

	public static void main(String[] args) {
		
		Scanner academia =new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		String lectura;
		byte edad;
		char titulo, paro;
		final char AFIRMACION = 's'; //declarar una constante de tipo char
		final byte MAYOREDAD = 18;
		final int BECAS=5;
		
		do {
			System.out.println("Digues el teu nom");
			String nom = academia.next();
            
            System.out.println("Introduce tu edad");
    		edad= academia.nextByte();
    		academia.nextLine(); //Limpiar becael búffer de teclado
    		
    		System.out.println("¿Tienes título universitario?");
    		lectura = academia.nextLine();
    		lectura = lectura.toLowerCase(); //pasarlo a minisculas en la clase Scanner
    		titulo = lectura.charAt(0); //recoger posición 0 para saber si es n o s, de si o no
    		
    		System.out.println("¿Estás en el paro?");
    		lectura = academia.nextLine();
    		lectura = lectura.toLowerCase();
    		paro = lectura.charAt(0);
    		
    		if ((edad >= MAYOREDAD && titulo == AFIRMACION) || paro == AFIRMACION) {
    			lista.add(nom); //para meter en la lista solo a los que tienen beca
    			System.out.println("Tienes beca");
    		} else {
    			System.out.println("No tienes beca");
    		}
		
		}while(lista.size() < BECAS); //comprara el numero de personas con beca en la lista con el max de becas que queremos dar
			
		for (int i=0; i < lista.size(); i++) { //para imprimir la lista con un for y de forma vertical
			System.out.println("·" + lista.get(i));
		}
		
		
	
		
		
		
		
		/* if (edad >= 18 && titulo == 's'){
			System.out.println("Tienes beca");
		} else if (paro == 's'){
			System.out.println("Tienes beca);
		} else {
			System.out.println("No tienes paro");
		}*/
}
}

	



		

	

