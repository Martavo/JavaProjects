package M8_Prueba1;

public class M8_Prueba1 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		//(String nombre, String apellido1, String apellido2, int edad)
		Persona persona2 = new Persona("Marta", "Villalba", "Orta", 25);
		Persona persona3 = new Persona("Juan Carlos", "Leon", "Arcenegui", 26);
		
		persona1.setNombre("Nuria");
		String nombre = persona1.getNombre();
		
		persona1.setApellido1("López");
		String apellido1 = persona1.getApellido1();
		
		persona1.setApellido2("Pérez");
		String apellido2 = persona1.getApellido2();
		
		persona1.setEdad(34);
		int edad = persona1.getEdad();
		
		persona2.birthday(); //le sumo un año  a la persona2 con el metodo de cumpleaños
		
		
		System.out.println(persona1);
		persona1.comer();
		persona1.trabajar();
		persona1.dormir();
		persona1.jugar();
		
		System.out.println(persona2);
		persona2.comer();
		persona2.trabajar();
		persona2.dormir();
		persona2.jugar();
		
		System.out.println(persona3);
		persona3.comer();
		persona3.trabajar();
		persona3.dormir();
		persona3.jugar();

	}

}
