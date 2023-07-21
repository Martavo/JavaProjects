package M7_3_Exercici7;
import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_Exercici7 {
	
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		ArrayList<String> tareas = new ArrayList<String>();
	int opcion = 0;	
		
	do{
		      mostrarMenu();
		      opcion = sc.nextInt();
		        	
		      switch(opcion){
		         case 1: 
		        	 verificarExperiencia(tareas);
		            break;
		         case 2: 
		        	 calcularOlas(tareas);
		            break;
		         case 3: 
		        	 costeReserva(tareas);
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
        System.out.println("1. Verificar experiencia y material de la tabla");
        System.out.println("2. Calcular altura olas");
        System.out.println("3. Coste de la reserva");
        System.out.println("4. Salir de la aplicación");
        System.out.println("Elige una opcion");
		
}
	public static void verificarExperiencia(ArrayList<String> tareas){
		boolean afirmacion = true;
        
        System.out.println("¿Tienes experiencia? Responde sí o no, por favor.");
        String respuesta = sc.nextLine();
        respuesta = respuesta.toLowerCase();
        sc.nextLine();
        
        if (respuesta.equalsIgnoreCase("s")) {
            afirmacion = true;
            System.out.println("Te corresponde una tabla de fibra.");
        } else {
            afirmacion = false;
            System.out.println("Te corresponde una tabla de espuma.");
        }
	}
	
	public static void calcularOlas(ArrayList<String> tareas){
		System.out.println("Cuanto miden las olas?");
		float medidaOlas = sc.nextInt();
		
		if (medidaOlas >= 2) {
			System.out.println("Las olas son grandes");
		}else if  (medidaOlas < 2 && medidaOlas > 0) {
			System.out.println("Las olas son pequeñas");
		}
    	
    }
	
	public static void costeReserva(ArrayList<String> tareas){
		System.out.println("Que tipo de tabla quieres reservar? Tenemos de fibra y de espuma");
		String materialTabla = sc.nextLine();
		sc.nextLine();
		
		
		System.out.println("Cuantos minutos quieres reservar?");
		float tiempoReserva = sc.nextInt();
		
		float precio = tiempoReserva/60;
		float tiempoPrecio = 20/60;
   
		if (materialTabla.toLowerCase().equalsIgnoreCase("fibra")) {
			System.out.println("El precio son " + (tiempoReserva/60)*20);
		}else {
			System.out.println("El precio son " + (tiempoReserva/60)*35);
		}
			
    }

}
