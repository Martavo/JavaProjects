package PruebaFinalEx4;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFinalEx4 {
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		ArrayList<Restaurante> restaurantes = new ArrayList<>();
		
		int opcion = 0;
		Restaurante Tagliatella = new Restaurante ("Tagliatella", "41°23'25.6N", "2°08'37.9E", "Italiana", 3);
		Restaurante Chun = new Restaurante ("Chun", "41°23'28.0N", "2°08'42.8E", "Japonesa", 4);
		Restaurante Yashima = new Restaurante ("Yashima", "43°48'28.0N", "2°04'42.3E", "Japonesa", 4);
		Restaurante Roca = new Restaurante ("Roca", "41°23'30.6N", "2°08'37.9E", "Catalana", 5);
		Restaurante Vinitus = new Restaurante ("Vinitus", "41°56'25.6N", "2°03'37.9E", "Catalana", 4);
		
		restaurantes.add(Tagliatella);
		restaurantes.add(Chun);
		restaurantes.add(Yashima);
		restaurantes.add(Roca);
		restaurantes.add(Vinitus);

			
			
			
		do{
		      mostrarMenu();
		      opcion = sc.nextInt();
		      sc.nextLine();
		        	
		      switch(opcion){
		         case 0:
		        	 System.out.println("Gracias por usar la aplicación");
			         break;
		         case 1:
		        	 buscarTipoCocina(restaurantes);
		            break;
		         case 2: ;
		         	buscarPorPuntuacion(restaurantes);
		            break;
		         case 3:
		        	buscarMejorPuntuacion(restaurantes);
			        break;   
		         default:
		            System.out.println("Opción invalida, por favor elige una opción correcta");
		            }
		            
		            System.out.println(); 
		        }while(opcion !=3);   
		
		
		    }
			//Metodo del menú
			public static void mostrarMenu(){

		            System.out.println("Lista de tareas");
		            System.out.println("1. Buscar restaurante por tipo de cocina");
		            System.out.println("2. Buscar restaurante por puntuación");
		            System.out.println("3. Buscar restaurante con mejor puntuación");
		            System.out.println("0. Salir de la aplicación");
		            System.out.println("Elige una opcion");
					
		    }
			
			public static void buscarTipoCocina(ArrayList<Restaurante> restaurantes) {
				boolean encontrado = false;
				System.out.println("Indique que tipo de comida desea buscar");
				String tipoCocina = sc.nextLine();
				
				for (Restaurante restaurante : restaurantes) {
				       if (restaurante.getTipoCocina().equalsIgnoreCase(tipoCocina)) {
				    	   System.out.println(restaurante);
				    	   encontrado = true;
				       }      
				}
				
				
				if (encontrado == false) {
					System.out.println("El tipo de cocina que busca no está en nuestro sistema");
				}
			}
			
			public static void buscarPorPuntuacion(ArrayList<Restaurante> restaurantes) {
				int mejorPuntuacion = 0 ;
				Restaurante mejorRestaurante = null;
				
				System.out.println("Indique que tipo de comida desea buscar");
				String tipoCocina = sc.nextLine();
				
				for (Restaurante restaurante : restaurantes) {
					if (restaurante.getTipoCocina().equalsIgnoreCase(tipoCocina) && restaurante.getPuntuacion() >= mejorPuntuacion) {
						mejorRestaurante = restaurante;
						mejorPuntuacion = restaurante.getPuntuacion();
				    	   
				       }
					}
				
				if (mejorRestaurante == null) {
					System.out.println("El tipo de cocina que busca no está en nuestro sistema");
				}else {
					System.out.println("El restaurante de cocina " + tipoCocina + " con mejor puntuación es: " + mejorRestaurante);
				}
				
			}
			
			public static void buscarMejorPuntuacion(ArrayList<Restaurante> restaurantes) {
				boolean encontrado = false;
				System.out.println("Indique que puntuación mínima quiere buscar");
				int puntuacionMinima = sc.nextInt();
				
				for (Restaurante restaurante : restaurantes) {
					if (puntuacionMinima < restaurante.getPuntuacion()) {
						System.out.println(restaurante.toString());
						encontrado = true;
					}
				}
				
				if (encontrado == false) {
					System.out.println("La puntuación mínima que busca no está disponible en nuestra lista de restaurantes");
				}
				
			}
	
}

