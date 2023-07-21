package M4_Exericici2;

import java.util.Scanner;

public class M4_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escuela =new Scanner (System.in);
		
		System.out.println("Introduce la edad del usuario, por favor");
		
		byte edad = escuela.nextByte();
		
		
	if (edad <= 5) {
		System.out.println("Preescolar");
		
	} else if (edad >5) {
		System.out.println("Primaria");
		
	} else if (edad >= 12) {
		System.out.println("ESO");
		
	} else if (edad >= 16) {
		System.out.println("Bachillerato");
		
	} else if (edad >= 18) {
		
		System.out.println("PF o Universidad");
	}
	}

}
