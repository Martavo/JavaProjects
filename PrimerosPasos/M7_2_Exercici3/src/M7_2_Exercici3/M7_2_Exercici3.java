package M7_2_Exercici3;

import java.util.Scanner;

public class M7_2_Exercici3 {

	public static void main(String[] args) {
		int numero = pedirNumero();
		char simbolo = '*';
		//String text;
		
		for (int i = 0; i < numero; i++) { //filas
			 for (int j = 0; j<=i; j++) { //columnas
	        	System.out.print(simbolo + " ");
	        }System.out.println();
		}
		for (int i = numero-1; i>=0; i--) { //filas
			 for (int j = 1; j<=i; j++) { //columnas
	        	System.out.print(simbolo + " ");
	        }System.out.println();
		}
	}
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		return numero;
	}
	

}
