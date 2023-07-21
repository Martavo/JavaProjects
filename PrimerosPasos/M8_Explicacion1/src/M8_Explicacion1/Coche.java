package M8_Explicacion1;

public class Coche {
	private String marca; //esto son atributos
	private String modelo;
	private int potencia;
	private int cilindrada;
	private String color;
	
	public Coche() { //es el constructor del coche 1
		
	}
	
	public Coche(String marca, String modelo, int potencia, int cilindrada, String color) {
		
		this.marca = marca; //el this es para llamar a los atributos y diferenciar del parametro
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.color = color;
	}
	
	public Coche(String marca, String modelo, int potencia, int cilindrada) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) { //se hace el metodo para darle permiso a en el main darle un valor
		this.color = color;
	}

	public String getMarca() { //no hacemos el set porque es un atributo que no se puede cambiar en un coche, entonces no le damos el acceso a añadir otro valor
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}
	
	

	public void arrancar() { //esto son metodos
		System.out.println("Estoy arrancando");
	}
	
	public void acelerar() {
		System.out.println("Estoy acelerando");
	}
	
	public void frenar() {
		System.out.println("Estoy frenando");
	}
	
	public void girar() {
		System.out.println("Estoy girando");
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ ", color=" + color + "]"; //para imprimir el string con cada valor de los atributos
	}
	
	
	
}
