package M7_2_Exercici7;

import java.util.Scanner;

public class M7_2_Exercici7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año");
		int a =sc.nextInt();
		
		System.out.println(calcularBisiesto(a));
		
	}
		
		public static String calcularBisiesto(int a) {
		String mensaje;
			
		if (a % 400 == 0) {
			mensaje= "El año es bisiesto";
		}else if (a % 4 == 0 && a % 100 != 0) {
			mensaje="El año es bisiesto";
		}else {
			mensaje="El año no es bisiesto";
		}
		
		return mensaje;
		
	}
		

}
