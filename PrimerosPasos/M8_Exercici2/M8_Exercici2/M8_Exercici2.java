package M8_Exercici2;
import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici2 {
	private static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		ArrayList<Hotel> hoteles = new ArrayList<>(); 	
		Hotel Melia = new Hotel ("Melia", 270, 9, 5000);
		hoteles.add(Melia);
		Hotel Iberostar = new Hotel ("Iberostar", 120, 6, 1000);
		hoteles.add(Iberostar);
		
		int opcion = 0;	
		int posicion;
		
		do{
		      mostrarMenu();
		      opcion = sc.nextInt();
		      sc.nextLine();
		        	
		      switch(opcion){
		         case 1: posicion = buscarHotel(hoteles);
		        	 crearHotel(hoteles, posicion);
		        	 verHoteles(hoteles);
		            break;
		         case 2:posicion = buscarHotel(hoteles);
		        	modificarHotel(hoteles, posicion);
		        	//verHoteles(hoteles);
		            break;
		         case 3: posicion = buscarHotel(hoteles);
		        	 verHotel(hoteles, posicion);
		            break;
		         case 4: posicion = buscarHotel(hoteles);
		         	darDeBajaHotel(hoteles, posicion);
		         	verHoteles(hoteles);
			        break;
		         case 5: 
		        	 verHoteles(hoteles);
			        break;
		         case 6: 
			            System.out.println("Gracias por usar la aplicación");
			            break;
		         default:
		            System.out.println("Opción invalida, por favor elige una opción correcta");
		            }
		            
		            System.out.println(); //Linea en blanco para separa las iteraciones del bucle
		        }while(opcion !=6);   
		
		
		    }
			//Metodo del menú
			public static void mostrarMenu(){

		            System.out.println("Lista de tareas");
		            System.out.println("1. Crer hotel");
		            System.out.println("2. Modificar hotel");
		            System.out.println("3. Buscar hotel");
		            System.out.println("4. Eliminar hotel");
		            System.out.println("5. Ver todos los hoteles");
		            System.out.println("6. Salir de la aplicación");
		            System.out.println("Elige una opcion");
					
		    }
			
			//Metodo para crear  hotel pero repetidos en el ArrayList
			/*public static void crearHotel() {
				ArrayList<Hotel> hoteles = new ArrayList<>();
				
				System.out.println("Nombre del hotel");
		    	String nombre = sc.nextLine();
		    	sc.nextLine();
		    	
		    	System.out.println("Numero de habitaciones");
		    	int habitaciones = sc.nextInt();
		    	
		    	System.out.println("Plantas de habitaciones");
		    	int plantas = sc.nextInt();
		    	
		    	System.out.println("Superficie del habitaciones");
		    	double superficie = sc.nextDouble();
		    	
		    	Hotel hotel = new Hotel (nombre, habitaciones, plantas, superficie);
	            hoteles.add(hotel);
	            
	            System.out.println(hotel.calcularManteniment());
			}*/
			
			//Metodo buscar hotel
			
			public static int buscarHotel(ArrayList<Hotel>hoteles) {
				int posicion = -1, i =0; //porque del 0 a otro numero positivo será una posicion del array, porque nunca sera -1 la posicion
				
				System.out.println("Introduza el nombre del Hotel: ");
				String nombre = sc.nextLine();
				
				
				while (posicion == -1 && i<hoteles.size()) {
					if (hoteles.get(i).getNombre().equalsIgnoreCase(nombre)) {
						posicion = i ;
					}
					i++;
				}
				
				return posicion;
			}
			
			
			
			//Metodo para crear hoteles sin repetir nombres en el array
			public static void crearHotel(ArrayList<Hotel>hoteles, int posicion) {
				
				if (posicion == -1) {
					
					System.out.println("Nombre del hotel");
			    	String nombre = sc.nextLine();
			    	
			    	System.out.println("Numero de habitaciones");
			    	int habitaciones = sc.nextInt();
			    	
			    	System.out.println("Plantas de habitaciones");
			    	int plantas = sc.nextInt();
			    	
			    	System.out.println("Superficie del habitaciones");
			    	double superficie = sc.nextDouble();
			    	
			    	Hotel hotel = new Hotel (nombre, habitaciones, plantas, superficie);
		            hoteles.add(hotel);
		            System.out.println(hotel.calcularManteniment());
				} else {
					System.out.println("El hotel ya está dado de alta en el sistema");
				}
			}
			
				
			//Metodo para modificar menú
			public static void modificarHotel(ArrayList<Hotel>hoteles, int posicion) {
				int opcion = 0;
				
				if (posicion != -1) {
					do {
						opcion = menuModificar();
						modificar(opcion, hoteles, posicion);
					}while(opcion !=0);
				}else {
					System.out.println("El hotel no está en el sistema");
				}
				
			}
				
			public static int menuModificar() {
				int opcion = 0;

				do {
					System.out.println("Elige la opción que quieras modificar");
					System.out.println("1. Numero de habitaciones");
					System.out.println("2. Numero de plantas");
					System.out.println("3. Superfície del hotel");
					System.out.println("0. Volver al menú principal");
					opcion = sc.nextInt();
					
				}while (opcion < 0 ||  opcion > 3);
				
				return opcion;
			}
				
				
			public static void modificar(int opcion, ArrayList<Hotel>hoteles, int posicion ) {
				Hotel hotel;
				
				switch(opcion){
				case 0:
					System.out.println("Salida de la opción de modificar hotel");
					break;
				case 1: System.out.println("Introduce el nuevo número de habitaciones:");
                	int nuevoNumHabitaciones = sc.nextInt();
                	hoteles.get(posicion).setHabitaciones(nuevoNumHabitaciones);
                	System.out.println("El numero de habitaciones ha sido modificado");
                	System.out.println(hoteles.get(posicion));
		            break;
		         case 2:System.out.println("Introduce el nuevo número de plantas:");
		         	int nuevoNumPlantes = sc.nextInt();
		         	hoteles.get(posicion).setPlantas(nuevoNumPlantes);
		         	System.out.println("El numero de plantas ha sido modificado");
		         	System.out.println(hoteles.get(posicion));
		            break;
		         case 3: System.out.println("Introduce la nueva superficie total:");
                	double nuevaSuperficieTotal = sc.nextDouble();
                	hoteles.get(posicion).setSuperficie(nuevaSuperficieTotal);
                	System.out.println("La superficie ha sido modificada");
                	System.out.println(hoteles.get(posicion));
		            break;
				}
		        
		    
			}
			
			//Metodo para ver un hotel en la lista

			public static void verHotel(ArrayList<Hotel>hoteles, int posicion) {
				int i =0;
				
				if (posicion != -1) {
					System.out.println(hoteles.get(posicion));
					System.out.println(hoteles.get(posicion).calcularManteniment());
				}else {
					System.out.println("El hotel no está en el sistema");
				}
			}
			
			
			//Metodo para dar de baja  hotel
			public static void darDeBajaHotel(ArrayList<Hotel>hoteles, int posicion) {
		
				if (posicion != -1) {
					hoteles.remove(posicion);
					System.out.println("El hotel ha sido eliminado");
				}else {
					System.out.println("El hotel no está en el sistema");
				}
			}
				
			
		
		//Metodo para ver todos los hoteles
			public static void verHoteles(ArrayList<Hotel>hoteles) {
				for (Hotel hotel : hoteles){
					System.out.println(hotel);
					System.out.println(hotel.calcularManteniment());
					}
			}

}

