package M7_Exercici5;
import java.util.ArrayList;
import java.util.Scanner;

public class M7_Exercici5 {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		ArrayList<String> tareas = new ArrayList<String>(); 
		int opcion = 0;
	
	        do{
	        	mostrarMenu();
	        	opcion = sc.nextInt();
	        	
	            switch(opcion){
	                case 1: 
	                	agregarTarea(tareas);
	                	break;
	                case 2: 
	                	mostrarTarea(tareas);
	                	break;
	                case 3: 
	                	eliminarTarea(tareas);
	                	break;
	                case 4: 
	                	System.out.println("Gracias por usar la aplicación");
	                	break;
	                default:
	                	System.out.println("Opción invalida, por favor elige una opción correcta");
	            }
	            
	            System.out.println(); //Linea en blanco para separa las iteraciones del bucle
	        }while(opcion !=4);   
	    }
	   
		public static void mostrarMenu(){

	            System.out.println("Lista de tareas");
	            System.out.println("1. Añadir tarea");
	            System.out.println("2. Mostrar tareas");
	            System.out.println("3. Eliminar tarea");
	            System.out.println("4. Sair de la aplicación");
	            System.out.println("Elige una opcion");
				
	    }
	   
	    public static void agregarTarea(ArrayList<String> tareas){
	   
	    	System.out.println("Que tarea quieres añadir?");
	        String nuevaTarea = sc.nextLine();
	        tareas.add(nuevaTarea);
	        System.out.println("Tarea añadida correctamente");
	    }
	   
	    public static void mostrarTarea(ArrayList<String> tareas){
	    	System.out.println("*****Tareas*****");
	    	if (tareas.isEmpty()) {
	    		System.out.println("No hay tareas en la lista");
	    	}else {
	    		for (int i =0; i < tareas.size(); i++) {
	    			System.out.println((i+1) + ". " + tareas.get(i));
	    		}
	    	}
	    }
	   
	    public static void eliminarTarea(ArrayList<String> tareas){
	    	System.out.println("Ingrese la tarea que quiere eliminar");
	    	int indice = sc.nextInt();
	    	sc.nextLine(); //consumir el salto de linea
	    	
	    	if (indice >= 1 && indice <= tareas.size()) {
	    		tareas.remove(indice-1);
	    		System.out.println("Tarea eliminada correctamente");
	    	}else {
	    		System.out.println("Índice incorrecto. No se eliminó ninguna tarea");
	    	}
	    }

	    
	}
