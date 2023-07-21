package M3_EjemplosClase;

import java.util.Scanner;

public class IfSimple {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número");
		byte numero = teclado.nextByte();
		
		if (numero > 5) {
			System.out.println("El número es mayor que 5");
			
		}else if (numero <= 5){
			System.out.println("El número es igual o menor que 5");
		}

	}

}
