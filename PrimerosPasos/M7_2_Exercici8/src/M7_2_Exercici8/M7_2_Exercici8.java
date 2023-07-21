package M7_2_Exercici8;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_2_Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> calcularSucesion = new ArrayList<>();
		
		System.out.println("Introduce un numero");
		int numero =sc.nextInt();
		
		System.out.println(calcularSucesion(numero));
		
	}
	
	 public static ArrayList<Integer> calcularSucesion(int numero) {
		 ArrayList<Integer> lista = new ArrayList<>();
		 int result =0;
		 for(int i = 0; i<numero; i++) {

			if (i>1) {
				lista.add(lista.get(i-1) + lista.get(i-2));
			}else if (i == 0 || i==1){ //para añadir las dos primeras posiciones de 0 y 1
				lista.add(i);
			}
		 }
		 
	return lista;	 
		
	}
	 
	/* public static ArrayList<Integer> calcularSucesion2(int numero){
	 * ArrayList<Integer> lista = new ArrayList<>();
	 * 
	 * lista.add(0);
	 * lista.add(1);
	 * 
	 * numero = numero - 2; //ya tenemos dos numeros, asi seran los que nosotros queremos
	 * 
	 * for (int = 0; i < numero; i++){
	 * lista.add(lista.get(i) + lista.get(i+1));
	 * }
	 * 
	 * return lista;
	 */
	 
	 
	 /*int numero;
	  * int num1 = 0;
	  * int num2 = 1;
	  * int resultado;
	  * 
	  * System.out.println("Introduce un numero");
		int numero =sc.nextInt();
		
		System.out.println("Los primeros " + numero + " numeros de la serie de Fibonacci son:");
		
		for (int 1=0; i< numeros; i++{
			System.out.prinln(num1 + ",");
			resultado = num1+num2;
			num1=num2;
			num2=resultado;
		}
	  */

}
