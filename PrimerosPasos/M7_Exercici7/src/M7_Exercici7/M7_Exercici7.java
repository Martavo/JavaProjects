package M7_Exercici7;
import java.util.Scanner;
public class M7_Exercici7 {
	public static void main(String[] args) {
		
		int numero = pedirNumero();
		char simbolo = pedirSimbolo();
		
		for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
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
	
	public static char pedirSimbolo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un caracter");
		char simbolo = sc.nextLine().charAt(0);
	
		return simbolo;
	}
	
	
}