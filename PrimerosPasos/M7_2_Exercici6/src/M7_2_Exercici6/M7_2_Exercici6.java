package M7_2_Exercici6;
import java.util.Scanner;
public class M7_2_Exercici6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean primo = false; //para que si es 1 te diga que no puede ser 
		do {
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			if (numero>1) {
				primo = esPrimo(numero);
			}else {
				System.out.println("EL numero debe de ser mayor que 1");
			}
			
		}while(!primo);
		
		System.out.println("Exacto! El numero "+numero+" es primo!");
	
	}
	//metodo usado en el ejercicio anterior
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i= 2;
		
		while (primo && i<numero) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}

}
