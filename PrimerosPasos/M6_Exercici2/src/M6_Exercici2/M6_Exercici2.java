package M6_Exercici2;
import java.util.ArrayList;
import java.util.Scanner;

public class M6_Exercici2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> edades = new ArrayList<Integer>();
		int numPersonas, totalEdades;
		float mediaEdades, media;
		
		System.out.println("Introdueix el nombre de persones amb les que calculem la mitjana");
		numPersonas= sc.nextInt();
		
		//1. Con un solo metodo//
		mediaEdades=obtenerEdadesYCalcularMedia(numPersonas);
		System.out.println("La media de las edades es " + mediaEdades);
		
		/*2. Con metodos separado(es la mas efectiva)*/
		totalEdades=ObtenerEdades(numPersonas);
		 System.out.println(calcularMedia(totalEdades,numPersonas));
		 
		
		/*3. Con arraylist*/
		edades=obtenerEdades2(numPersonas);
		media= obtenerMedia(edades);
		System.out.println(media);
		
		/*4. Con el mismo ArrayList del main()*/
		obtenerEdades3(numPersonas, edades);
		media = obtenerMedia(edades);
		System.out.println(media);
		
	}

	//Forma 1 de hacerlo// 
	public static int obtenerEdadesYCalcularMedia(int numPersonas) { 
		 Scanner sc = new Scanner(System.in);
	       float mediaEdades;
	       int totalEdades=0, edad, i=0;

	       while (i<numPersonas) {
	    	   System.out.println("Dime la edad de la persona" + (i+1)+ ":");
	    	   edad = sc.nextInt();
	    	   
	            if (edad >= 0 && edad <= 120) { // aqui vamos sumando la edad introducida encima de la edad anterior para ir haciendo el computo
	                totalEdades = totalEdades+edad;
	            } else {
	                System.out.println("La edad introducida no és correcta, debe de ser entre 0 y 120 años.");
	             
	            }
	        }
        	if (numPersonas != 0 ) {
        		mediaEdades=(float) totalEdades / numPersonas;
        	}else {
        		mediaEdades = 0;
        	}
        	return (int) mediaEdades;    
        }
	
	//Forma 2 de hacerlo//
	public static int ObtenerEdades(int numPersonas) {
		Scanner sc=new Scanner(System.in);
		 int totalEdades=0, edad, i=0;
		 while (i<numPersonas) {
	    	   System.out.println("Dime la edad de la persona" + (i+1)+ ":");
	    	   edad = sc.nextInt();
	    	   
	            if (edad >= 0 && edad <= 120) { // aqui vamos sumando la edad introducida encima de la edad anterior para ir haciendo el computo
	                totalEdades = totalEdades+edad;
	            } else {
	                System.out.println("La edad introducida no és correcta, debe de ser entre 0 y 120 años.");
	             
	            }
	        }
		 return totalEdades;
	}
	
	public static float calcularMedia (int totalEdades, int numPersonas) {
		float mediaEdades = (float) totalEdades / numPersonas;
		return mediaEdades;
	}
	
	
	//Forma 3 de hacerlo//
	public static ArrayList obtenerEdades2(int numPersonas) {
		Scanner sc = new Scanner(System.in);
		int mitja;
		ArrayList<Integer> edats = new ArrayList<Integer>();
		int i=0;
		int edad;
		
		while (i < numPersonas) {
			System.out.println("Dime la edad de la persona" + (i +1) + ":");
			edad = sc.nextInt();
			
			// las edades tienen que estar comprendidas entre 0 y 120
			
			if (edad >= 0 && edad <= 120) {
				edats.add(edad);
				i++;
			}else {
				System.out.println("La edad introducida no es correcta");
				
			}
		}
		return edats;
	}
	
	public static float obtenerMedia(ArrayList<Integer> edades) {
		float mitja = 0;
		int totalEdades = 0;
		for (int i=0; i < edades.size(); i++) {
			totalEdades = totalEdades + edades.get(i);
		}
		
		if (edades.size() > 0) {
			mitja = (float) totalEdades/ edades.size();
		}else {
			mitja = 0;
		}
		return mitja;
	}
	
	//Forma 4 de hacerlo//
	public static void obtenerEdades3(int numeroPersonas, ArrayList<Integer> edats) {
		Scanner sc = new Scanner(System.in);
		int mitja;
		
		int i = 0;
		int edad;
		while (i < numeroPersonas) {
			System.out.println("Dime la edad de la persona " + (i+1) + ":");
			edad = sc.nextInt();
			
			//las edades tienen que ser entre 0 y 120
			if (edad >= 0 && edad <=120) {
				edats.add(edad);
				i++;
			}else {
				System.out.println("La edad introducida no es correcta");
			}
		}
	}
}
