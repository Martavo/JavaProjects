package M5_Exercici2;
import java.util.ArrayList;
import java.util.Scanner;
public class M5_Exercici2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma=0; //si no le damos valor a la variable suma no sabe sobre que sumar 
		int auxiliar;
		
		System.out.println("Introduce el primer número");
		int num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2=sc.nextInt();
		
		if (num1==num2) { //por si los numeros son iguales
			System.out.println("Los números no pueden ser iguales");
		}
		
		if (num1>num2) { //esto es por si el primer numero es mas grande que el segundo
			auxiliar = num1;
			num1=num2;
			num2=auxiliar;
		}
		
		for (int i = num1; i <= num2; i++) {
            suma=suma+i;

	}
		System.out.println("La suma del número "+num1+" y el número "+num2+" es: " + suma);
}
}