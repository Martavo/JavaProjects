package M7_3_Exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_Exercici1 {

	private static Scanner sc = new Scanner (System.in);
		
	public static void main(String[] args) {
	ArrayList<String> tareas = new ArrayList<String>(); 
	int opcion = 0;
		
		   do{
		      mostrarMenu();
		      opcion = sc.nextInt();
		        	
		      switch(opcion){
		         case 1: 
		        	 calcularCuadrado(tareas);
		            break;
		         case 2: 
		        	 calcularTriangulo(tareas);
		            break;
		         case 3: 
		        	 calcularRectangulo(tareas);
		            break;
		         case 4: 
		        	 calcularCirculo(tareas);
			        break;
		         case 5: 
		            System.out.println("Gracias por usar la aplicación");
		            break;
		         default:
		            System.out.println("Opción invalida, por favor elige una opción correcta");
		            }
		            
		            System.out.println(); //Linea en blanco para separa las iteraciones del bucle
		        }while(opcion !=5);   
		    }
		   
			public static void mostrarMenu(){

		            System.out.println("Lista de tareas");
		            System.out.println("1. Área del cuadrado");
		            System.out.println("2. Área del triángulo");
		            System.out.println("3. Área del restangulo");
		            System.out.println("4. Área del circulo");
		            System.out.println("5. Sair de la aplicación");
		            System.out.println("Elige una opcion");
					
		    }
		   
		    public static void calcularCuadrado(ArrayList<String> tareas){
		    	System.out.println("Indica la medida de un lado del cuadrado");
		    	int lado = sc.nextInt();
		    	
		    	int areaCuadrado=lado*lado;
		    	
		    	System.out.println("El área del cuadro es: " + areaCuadrado+ " cm");
		    }
		   
		    public static void calcularTriangulo(ArrayList<String> tareas){
		    	System.out.println("Indica la medida de la base del triangulo");
		    	float base = sc.nextInt();
		    	
		    	System.out.println("Indica la medida de la altura del triangulo");
		    	float altura = sc.nextInt();
		    	
		    	float areaTriangulo=(base*altura)/2;
		    	
		    	System.out.println("El área del triangulo es: " + areaTriangulo+ " cm");
		    }
		   
		    public static void calcularRectangulo(ArrayList<String> tareas){
		    	System.out.println("Indica la medida de la base del rectángulo");
		    	int base = sc.nextInt();
		    	
		    	System.out.println("Indica la medida de la altura del rectángulo");
		    	int altura = sc.nextInt();
		    	
		    	int areaRectangulo=base*altura;
		    	
		    	System.out.println("El área del rectángulo es: " + areaRectangulo+ " cm");
		    }
		    
		    public static void calcularCirculo(ArrayList<String> tareas){
		    	System.out.println("Indica la medida del radio del circulo");
		    	float radio = sc.nextInt();
		    	
		    	float areaCirculo=(float) ((Math.PI)*(Math.pow(radio, 2)));
		    	
		    	System.out.println("El área del circulo es: " + areaCirculo+ " cm cuadrados");
		    }
		    	//usar String.format para cortar decimales
		    
		}
