package M5_ExerciciExtra2;
import java.util.Scanner;
import java.util.ArrayList;
public class M5_ExerciciExtra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<String> personas = new ArrayList<String>();
		
		personas.add("Marta");
		personas.add("Miguel");
		personas.add("Pepe");
		personas.add("María");
		personas.add("Sandra");
		
		System.out.println("Que personas quieren buscar en la lista?");
		String nombre= sc.nextLine();
		
		int i = 0;
		boolean encontrado = false;
		while (i<personas.size() && !encontrado) {
			if(personas.get(i).equals(nombre)) {
				encontrado=true;
			} else {
			i++;
			}	
	
		}
		
		if (encontrado) {
			System.out.println(nombre +" está en nuestra base de datos y tiene la posición "+i);
		} else {
			System.out.println(nombre +" no está en nuestra base de datos");
		}
		/*este es el mas eficiente. While porque no sabemos si lo vamos 
		 a encontrar y con el boolean es la manera de salir del bucle de manera
		 correcta. Ponemos el else con el i++ para que no pase a la siguiente posición
		 y la guarde para saberla.*/
		
		
		
		
		
		/*boolean encontrado = false;
		for (int i=0; i < personas.size(); i++) {
			if (personas.get(i).equals(nombre)) {
				encontrado=true;
			}
			
		if (encontrado) {
			System.out.println(nombre+" está en nuestra base de datos");
		} else {
			System.out.println(nombre+" no está en nuestra base de datos");
		} no sirve porque tambien tiene que pasar por todos los nombres*/
		
		
	
		
		/*String persona;
		
		for (int i = 0; i<personas.size(); i++) {
			persona = personas.get(i);
			if (persona.equals(nombre)) {
				System.out.println(nombre+" está en nuestra base de datos");
			}else {
				System.out.println(nombre+" no está en nuestra base de datos");
			} con este metodo es poco práctico porque tiene que 
			pasar por todos y no es sencillo de ver*/
		}
		
		
		
		/*if (personas.contains(nombre)) {
            System.out.println("El nombre está dado de alta en el programa.");
        } else {
            System.out.println("El nombre no está dado de alta en el programa.");
        } El problema de este es que es metodo y aun no toca trabajarlo*/
		
	

}
