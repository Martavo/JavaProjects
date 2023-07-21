package M3_Exercici2;

import java.util.Scanner;

public class M3_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner operaciones=new Scanner (System.in);
		
		System.out.println("Introduce un numero, por favor");
		
		int valor1=operaciones.nextInt();
		
		System.out.println("Introduce otro numero, por favor");
		
		int valor2=operaciones.nextInt();
		
		System.out.println("El resultat de la suma és " + (valor1+valor1));
		
		System.out.println("El resultat de la resta és " + (valor1-valor2));
		
		System.out.println("El resultat de la multiplicació és " + (valor1*valor2));
		
		System.out.println("El resultat de la divisió és " + (float)valor1/valor2); //se castea para que pase del int al float para que añada los decimales
		
	
		
		/*int suma=valor1+valor2;
				
		int resta=valor1-valor2;
		
		int multiplicació=valor1*valor2;
		
		float divisio=(float)valor1/valor2;
		
	
		
		System.out.println("La resta és: " + resta);
		
		System.out.println("La multiplicació és: " + multiplicació);
		
		System.out.println("La divisió és: " + divisio);*/ //Es una manera en que se ocupa más espacio
				
	}

}