package M7_3_Exercici4;

import java.util.Scanner;

public class M7_3_Exercici4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		 
		int numero =0;
		System.out.println("Introduce el DNI");
		String DNI=sc.nextLine();
		
		if ((DNI.length() != 9) || (Character.isLetter(DNI.charAt(8)) == false)){ //limitar por si se introduce con errores
			System.out.println("El DNI proporcionado no es válido");
		}else {
			numero = Integer.parseInt(DNI.substring(0,8)); //pasar el numero a un int
		}
		
		String letraString = DNI.substring(8); //recoger la letra (posicion 8 porque se empieza por 0)
		letraString = letraString.toUpperCase(); //pasar a mayúsculas
		char letraChar = letraString.charAt(0); //guardarla en un char
		
	
		char letraOk = letras[numero % 23]; //sacar la letra correcta

      
        if (letraOk != letraChar) {
        	System.out.println("La letra no es correcta.");
            System.out.println("La letra correcta es: " + letraOk);
        } else {
        	System.out.println("La letra es correcta.");
        }
    }
}