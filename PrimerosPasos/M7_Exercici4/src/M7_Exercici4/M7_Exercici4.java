package M7_Exercici4;
import java.util.Scanner;
public class M7_Exercici4 {

	static Scanner sc = new Scanner(System.in); // no usar muy recurrente y solo en casos concretos
	public static void main(String[] args) {
		
			
			System.out.println("Introduce un número");
			int numero1 = sc.nextByte();
			System.out.println("Introduce otro número");
			int numero2 = sc.nextByte();
			
			String mensaje = "";
			
			//Método1
			
			if ((numero1 < 0 && numero2 >= 0) || (numero1 >= 0 && numero2 < 0)) {
				System.out.println("Hi ha un negatiu");
			}
					
			//Método2
			if ((numero1 < 0 || numero2 < 0 ) && (numero1 >= 0 || numero2 >= 0)){
				System.out.println("Hi ha un negatiu");
			}
			
			//Método3
			if ((numero1 * numero2 < 0)) {System.out.println("Hi ha un negatiu"); }
			
			//Método4
			if (numero1 < 0 ^ numero2 <0 ) {System.out.println("Hi ha un negatiu"); }
			
			//Método5
			if ((numero1 / numero2 < 0 )) {System.out.println("Hi ha un negatiu"); }
			
			
		}

	}


