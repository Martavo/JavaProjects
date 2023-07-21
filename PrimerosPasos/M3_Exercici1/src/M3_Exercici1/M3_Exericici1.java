package M3_Exercici1;

import java.util.Scanner;

public class M3_Exericici1 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner (System.in);
		
		final int MAYOR_EDAD = 18;
		
		System.out.println("Introdueix el teu nom, si us plau");
		
		String nom = datos.nextLine();
		
		System.out.println("Introdueix el teu cognom, si us plau");
		
		String cognom = datos.nextLine();
		
		System.out.println("Introdueix la teva edat, si us plau");
		
		Byte edat= datos.nextByte();
		
		if (edat >= MAYOR_EDAD) {
			System.out.println(nom + " " + cognom + ", ets major d'edat");
		} else {
			System.out.println(nom + " " + cognom + ", ets menor d'edat");
		}
		
		//System.out.println("El teu nom és " + nom + ", el teu cognom és " + cognom + " i tens " + edat + " anys.");
		
	}

}