package PruebaFinalEx3;

import java.util.ArrayList;

public class PruebaFinalEx3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(3);
		numeros.add(12);
		numeros.add(2);
		numeros.add(4);
		numeros.add(18);  
		numeros.add(2);

		System.out.println("La suma más grande de dos números correlativos son: " + suma(numeros));
	}
		
	public static int suma(ArrayList<Integer> numeros) {
		int suma = 0;
		int sumaCorrelativa = 0;
		
		for (int i = 1; i < numeros.size(); i++) {
			sumaCorrelativa = numeros.get(i) + numeros.get(i + 1);
       	 if (sumaCorrelativa > suma) {
       		suma = sumaCorrelativa; 	
       	 }
       	 i++;
       	 
         }
		
		return suma;
}
}
