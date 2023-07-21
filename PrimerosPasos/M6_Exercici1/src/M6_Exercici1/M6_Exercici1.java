package M6_Exercici1;

import java.util.Scanner;

public class M6_Exercici1 {

	public static void main(String[] args) {
double resultado;
		
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		double numero1= calculadora.nextDouble();

		System.out.println("Ingrese el segundo numero");
		double numero2 = calculadora.nextDouble();
		
		System.out.println("Ingrese el operador (+, -, *, /,%)");
		char operador = calculadora.next().charAt(0); // manera de seleccionar el primer caracter de aquello que el usuario escribe por consola

		
		switch(operador) {
		case '+':
			suma(numero1, numero2);
			break;
		case '-':
			resta(numero1, numero2);
			break;
		case '*':
			multiplicacion(numero1, numero2);
			break;
		case '/':
			if (numero2 != 0) {
				division(numero1, numero2);
			}else {
				System.out.println("El divisor de la división no puede ser 0");
			}
			break;
		case '%':
			modulo(numero1, numero2);
			break;
		default:
			System.out.println("Operador no válido");
			return;
			
		}
		
	}
	
	 public static void suma(double numero1, double numero2) { // se pone void cuando no devuelve nada
	        Scanner sc = new Scanner(System.in);
	        int resultado;
	        resultado = (int) (numero1 + numero2);
	        System.out.println("El resultado es " + resultado);
	    }
	 
	 public static void resta(double numero1, double numero2) { 
	        Scanner sc = new Scanner(System.in);
	        int resultado;
	        
	        resultado = (int) (numero1 - numero2);
	        System.out.println("El resultado es " + resultado);
	    }
	 public static void multiplicacion(double numero1, double numero2) { 
	        Scanner sc = new Scanner(System.in);
	        int resultado;
	        
	        resultado = (int) (numero1 * numero2);
	        System.out.println("El resultado es " + resultado);
	    }
	 
	 public static void division(double numero1, double numero2) { 
	        Scanner sc = new Scanner(System.in);
	        int resultado;
	        
	        resultado = (int) (numero1 / numero2);
	        System.out.println("El resultado es " + resultado);
	    }
	 public static void modulo(double numero1, double numero2) { 
	        Scanner sc = new Scanner(System.in);
	        int resultado;
	        
	        resultado = (int) (numero1 % numero2);
	        System.out.println("El resultado es " + resultado);
	    }
	 
}