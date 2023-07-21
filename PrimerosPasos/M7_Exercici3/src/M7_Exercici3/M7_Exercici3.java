package M7_Exercici3;
import java.util.Scanner;
public class M7_Exercici3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		String resultat;
		
		System.out.println("Introdueix el número 1");
		num1=sc.nextInt();
		
		System.out.println("Introdueix el número 2");
		num2=sc.nextInt();
		
		if (esMultiplo(num1, num2)) {
			System.out.println(num1 + " es multiplo de " + num2);
		}else {
			System.out.println(num1 + " no es multiplo de " + num2);
		}

	}
	
	public static boolean esMultiplo (int num1, int num2) {
		
		return num1 % num2 ==0;
		
	}
}
