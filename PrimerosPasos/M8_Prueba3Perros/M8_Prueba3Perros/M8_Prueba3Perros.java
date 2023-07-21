package M8_Prueba3Perros;
import java.util.Scanner;

import java.util.ArrayList;

public class M8_Prueba3Perros {

	public static void main(String[] args) {
		ArrayList<Perro> perros = new ArrayList<>(); 
		
		anotarPerros(perros);
        buscarPerros(perros);

	}
	
	public static void anotarPerros (ArrayList<Perro>perros) {	
		
		Scanner sc = new Scanner(System.in);	
		
		for (int i =0; i < 2; i++) {
			System.out.println("Introduce los datos del perro "+(i+1)+".");
			
			System.out.println("Raza: ");
			String raza = sc.nextLine();
			
			System.out.println("Nombre: ");
			String nombre = sc.nextLine();
			
			System.out.println("Edad: ");
			int edad = sc.nextInt();
			
			System.out.println("Color del pelo: ");
			String color_pelo = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Sexo:  ");
			String sexo = sc.nextLine();
			
			Perro perro = new Perro (raza, nombre, edad, color_pelo, sexo);
			perros.add(perro);
		}
	}
	
	
	public static void buscarPerros (ArrayList<Perro>perros) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del perro que quieres buscar en la lista");
		String nombre = sc.nextLine();
		
		int i =0;
		boolean encontrado = false;
		
		while (i < perros.size() && !encontrado) {
			if (perros.get(i).getNombre().equals(nombre)) {	
				encontrado = true;
			}
			i++;
		}
		
		if (encontrado) {
			System.out.println("El perro llamado " + nombre + " está en la lista.");
		}else {
			System.out.println("El perro llamado " + nombre + " no está en la lista.");
		}
		
		
	}
	

}
