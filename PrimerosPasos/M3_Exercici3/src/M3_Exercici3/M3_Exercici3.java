package M3_Exercici3;

import java.util.Scanner;

public class M3_Exercici3 {

public static void main(String[] args) {
		
		Scanner notas=new Scanner (System.in);
		
		// int nota1, nota2, nota3 se definen arriba por si hay muchas, es buena pracis
		
		final int NOTAS =3;
		
		System.out.println("Introdueix la nota de matemàtiques, si us plau");
		
		int nota1=notas.nextInt();
		
		
		System.out.println("Introdueix la nota de d'anglès, si us plau");
		
		int nota2=notas.nextInt();
		
		
		System.out.println("Introdueix la nota d'història, si us plau");
		
		int nota3=notas.nextInt();
		
		System.out.println("La mitjana de les " + NOTAS + " notes és: " + (float)nota1+nota2+nota3/NOTAS);
	}

}