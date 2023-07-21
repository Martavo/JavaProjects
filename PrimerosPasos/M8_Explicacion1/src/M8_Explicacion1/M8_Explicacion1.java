package M8_Explicacion1;

public class M8_Explicacion1 {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		//(String marca, String modelo, int potencia, int cilindrada, String color)
		Coche coche2 = new Coche("Aston Martin", "2DB9", 300, 2800, "plata"); //se llama al constructor y se añaden directamente los parametros
		Coche coche3 = new Coche ("Ford", "Fiesta", 70, 1200);
		
		System.out.println(coche2);
		
		coche1.arrancar(); //se puede llamar porque es un metodo y siempre es public
		coche1.acelerar();
		coche1.frenar();
		coche1.girar();
		
		coche1.setColor("blanco"); //para acceder a los atributos, set para dar valor
		String color = coche1.getColor(); //devuelve un valor
		
		System.out.println(color);
		

	}

}
