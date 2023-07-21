package M8_Exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici1 {

	public static void main(String[] args) {
		
		String programa = "eclipse";
		
		ArrayList<Ordenador> ordenadores = new ArrayList<>(); 
		
		for (int i = 0; i < 3; i++) {
			crearPC(ordenadores);
		
		}
		
		buscarPc(ordenadores);
		
		
		//Extra del ejercicio
		//Metodo3
		Ordenador ordenador = buscarPc3(ordenadores); 
		
		if (ordenador != null ) {
			System.out.println("El ordenador está en stock");
			System.out.println(ordenador.toString());
			comprarOrdenador(ordenadores, ordenador);
		}else {
			System.out.println("El ordenador no está en stock");
		}
		
		//Metodo 2
		int posicion = buscarPc2(ordenadores);
		
		if (posicion != -1) {
			System.out.println("El ordenador está en stock");
			System.out.println(ordenadores.get(posicion).toString());// tanto si escribimos el metodo toString escrito o no, va a llamar al objeto igual
		}else {
			System.out.println("El ordenador no está en stock");
		}
		//Metodo 4
		boolean encontrado = buscarPc4(ordenadores);
		
		if (encontrado) {
			System.out.println("El ordenador está en stock");
		}else {
			System.out.println("El ordenador no está en stock");
		}

		
	}

	public static void crearPC (ArrayList<Ordenador>ordenadores) {
		
		Scanner sc = new Scanner(System.in);	
	
            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Procesador: ");
            String procesador = sc.nextLine();
            
            System.out.print("Memoria RAM: ");
            int memoriaRam = sc.nextInt();
            
            System.out.print("Capacidad del disco duro: ");
            int discoDuro = sc.nextInt();
            sc.nextLine();
            

            Ordenador ordenador = new Ordenador (marca, modelo, procesador, memoriaRam, discoDuro);
            ordenadores.add(ordenador);
           // ordenadores.add(new Ordenador((marca, modelo, procesador, memoriaRam, discoDuro));
            
           
		    }
	
	public static void buscarPc (ArrayList<Ordenador>ordenadores) { //se imprime mensaje directamente sobre si esta en la lista
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la marca de PC que quieres buscar");
		String buscarMarca = sc.nextLine();
		
		System.out.println("Introduce el modelo de PC que quieres buscar");
		String buscarModelo = sc.nextLine();
		
		int i=0;
		boolean encontrado = false;
		
		while (i < ordenadores.size() && !encontrado) {
			if (ordenadores.get(i).getMarca().equals(buscarMarca) && ordenadores.get(i).getModelo().equals(buscarModelo )) {	
					encontrado = true;
			}
			i++;
		}
		
		if (encontrado) {
			System.out.println("El PC de la marca " + buscarMarca + " y el modelo " + buscarModelo+ " está en la lista.");
		}else {
			System.out.println("El PC de la marca " + buscarMarca + " y el modelo " + buscarModelo+ " no está en la lista.");
		}
	}
	
	//Estra del ejercicio
	
	public static int buscarPc2 (ArrayList<Ordenador>ordenadores) { //este metodo devuelve la posicion
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		boolean encontrado = false;
		int posicion = -1;
		
		System.out.println("Introduce la marca de PC que quieres buscar");
		String marca = sc.nextLine();
		
		System.out.println("Introduce el modelo de PC que quieres buscar");
		String modelo = sc.nextLine();
		
		Ordenador ordenador1 = new Ordenador(marca, modelo);
		
		while (i < ordenadores.size() && !encontrado) {
			if (ordenadores.get(i).getMarca().equals(ordenador1)) {//para comparar con el metodo que tenemos en la clase Ordenador
					encontrado = true;
					posicion = i;
			}
			i++;
		}
		return posicion;
		
	}
	
	public static Ordenador buscarPc3 (ArrayList<Ordenador>ordenadores) { //este metodo devuelve el objeto
		Scanner sc = new Scanner(System.in);
		
		int i= 0;
		Ordenador ordenador = null;
		
		System.out.println("Introduce la marca de PC que quieres buscar");
		String marca = sc.nextLine();
		
		System.out.println("Introduce el modelo de PC que quieres buscar");
		String modelo = sc.nextLine();
		
		
		while (i < ordenadores.size() && ordenador == null) {
			if (ordenadores.get(i).getMarca().equals(marca) && ordenadores.get(i).getModelo().equals(modelo)) {
					
			}
			i++;
		}
		
		return ordenador;
		
	}
	
	public static boolean buscarPc4 (ArrayList<Ordenador>ordenadores) { //se imprime mensaje directamente sobre si esta en la lista
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la marca de PC que quieres buscar");
		String buscarMarca = sc.nextLine();
		
		System.out.println("Introduce el modelo de PC que quieres buscar");
		String buscarModelo = sc.nextLine();
		
		int i=0;
		boolean encontrado = false;
		
		while (i < ordenadores.size() && !encontrado) {
			if (ordenadores.get(i).getMarca().equals(buscarMarca) && ordenadores.get(i).getModelo().equals(buscarModelo )) {	
					encontrado = true;
			}
			i++;
		}
		
		return encontrado;
	}
	
	
	public static void comprarOrdenador (ArrayList<Ordenador>ordenadores, Ordenador ordenador) { //eliminar objeto encontrado de la lista
		
		if (ordenador != null) {
			ordenadores.remove(ordenador);
			System.out.println("El ordenador ha sido comprado");
		}else {
			System.out.println("El ordenador no está en nuestro stock");
		}
		
	}
	
	
	
	}


