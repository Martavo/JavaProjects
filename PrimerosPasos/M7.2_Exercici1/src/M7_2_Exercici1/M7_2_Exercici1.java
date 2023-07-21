package M7_2_Exercici1;

import java.util.Scanner;

public class M7_2_Exercici1 {

	public static void main(String[] args) {
		
		int numero = pedirNumero();
		char simbolo = '*';
		//String text;
		
		for (int i = 0; i < numero; i++) { //filas
			 for (int j = 0; j<=i; j++) { //columnas
	        	System.out.print(simbolo + " ");
	        }System.out.println();
		}
		
		/*versión2*/
		/*for (int i=1; i<numero, i++){
		 	text += simbolo;
		 	System.out.println(text);
		 */
	}
	
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		return numero;
	}

}
