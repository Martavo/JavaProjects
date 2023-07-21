package M4_Exercici5;
import java.util.Scanner;
public class M4_Exercici5 {

	public static void main(String[] args) {
		double resultado;
		
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		double numero1= calculadora.nextDouble();

		System.out.println("Ingrese el segundo numero");
		double numero2 = calculadora.nextDouble();
		
		System.out.println("Ingrese el operador (+, -, *, /)");
		char operador = calculadora.next().charAt(0); // manera de seleccionar el primer caracter de aquello que el usuario escribe por consola

		
		switch(operador) {
		case '+':
			resultado=numero1+numero2;
			break;
		case '-':
			resultado=numero1-numero2;
			break;
		case '*':
			resultado=numero1*numero2;
			break;
		case '/':
			resultado=numero1/numero2;
			break;
		default:
			System.out.println("Operador no válido");
			return;
			
		}
		
		System.out.println("El resultado es: " + resultado);
		
		
		
		
	}

}
