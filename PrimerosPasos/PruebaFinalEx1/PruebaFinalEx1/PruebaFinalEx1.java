package PruebaFinalEx1;

import java.util.ArrayList;

public class PruebaFinalEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(15);
		numeros.add(16);
		numeros.add(8);
		numeros.add(2);
		numeros.add(4);
		numeros.add(6);  
		numeros.add(2);
		
		
		int divisor = 3;
	        
		 System.out.print("Múltiples de 3: ");
	        for (int num : numeros) {
	            if (num % 3 == 0) {
	                System.out.print(num + " ");
	            }
	            	   
	       }
  
	       //Trobar el nombre més gran i el més petit
	        
	        int max = numeros.get(0);
	        int min = numeros.get(0);
	        
	        for (int i = 1; i < numeros.size(); i++) {
	        	 if (numeros.get(i) > max) {
	                 max = numeros.get(i);
	             }
	             if (numeros.get(i) < min) {
	                 min = numeros.get(i);
	             }
	         }
	        System.out.println(); //para que haga un salto de línea
	        System.out.println("Nombre més gran: " + max);
	        System.out.println("Nombre més petit: " + min);
	}

}
