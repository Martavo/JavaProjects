package M8_Prueba2Coches;
import java.util.ArrayList;
import java.util.Scanner;

public class M8_Prueba2Coches {

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        crearCoches(coches);
        buscarCoches(coches);
    }
		public static void crearCoches (ArrayList<Coche>coches) {
			
			Scanner sc = new Scanner(System.in);	
			for (int i = 0; i < 2; i++) {
				System.out.println("Introduce las características del coche " + (i + 1) + ":");

	            System.out.print("Marca: ");
	            String marca = sc.nextLine();

	            System.out.print("Modelo: ");
	            String modelo = sc.nextLine();

	            System.out.print("Matrícula: ");
	            String matricula = sc.nextLine();
	            
	            System.out.print("Potencia: ");
	            int potencia = sc.nextInt();
	            
	            System.out.print("Cilindrada: ");
	            int cilindrada = sc.nextInt();
	            sc.nextLine();
	            
	            System.out.print("Color: ");
	            String color = sc.nextLine();

	            Coche coche = new Coche(marca, modelo, matricula, potencia, cilindrada, color);
	            coches.add(coche);
	           
			    }
		}
		
		public static void buscarCoches (ArrayList<Coche>coches) {	
			
			Scanner sc = new Scanner(System.in);
			//Coche coche;
			boolean encontrado = false;
			
			System.out.println("Indica la matricula que quieres localizar");
			String matricula = sc.nextLine();
			
			    
			int i =0;
			
			while (i < coches.size() && !encontrado) {
				//coche = coches.get(i);
			    if (coches.get(i).getMatricula().equals(matricula)) {
			        encontrado = true;
				}
			    i++;
			}
			    
			 if (encontrado) {
				 System.out.println("La matricula sí está en nuestar aplicación");
			 }else {
				 System.out.println("La matricula no está en nuestar aplicación");
			 }
			
		}
}
				
			

		//(String marca, String modelo, String matricula, int potencia, int cilindrada, String color)
		
		/*Coche coche1 = new Coche();
		
		Coche coche2 = new Coche("Opel", "Corsa", "2388HLC", "100", "1400", "blanco");
		
		Coche coche3 = new Coche("BMW", "X5", "4578KML", "300", "1400", "rojo");
		
		Coche coche4 = new Coche("AUDI", "A5", "3789JLV", "150", "1400", "negro");
		
		Coche coche5 = new Coche();
		
		
		System.out.println("Coche 1: " + coche1);
		
		coche1.setMarca("Seat");
		coche1.setModelo("Ibiza");
		coche1.setMatricula("2345HTL");
		coche1.setPotencia(70);
		coche1.setCilindrada(1200);
		coche1.setColor("rojo");
				
		coche2.setPotencia(320); //cambiar 
		
		System.out.println("Coche 1: " + coche1);
		System.out.println("Coche 2: " + coche1);*/
		
		
		//sin el array los objetos tienen diferentes identidades, en el array puedes acceder a cualquiera con el
		// Coche coche1 = coches.get(0); y ya te guarda el coche 1 desde el array y modificar cosas
		// coches.get(0).setColor("lila"); o coche1.setColor("lila);
		
	
			
	
		

