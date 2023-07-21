package Herencia;

public class Coche {
   
	private static int idContador = 1;
	private final int id;
	private int potencia;
    private int velocidadMaxima;
    private String color;
    private double precioMercado;
	
    
  
	public Coche(int potencia, int velocidadMaxima, String color, double precioMercado) {
	
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;
		this.precioMercado = precioMercado;
		this.id = idContador++; //cada vez que creo uno se suma uno y el num de referencia se ira incrementando
	}
	
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioMercado() {
		return precioMercado;
	}

	public void setPrecioMercado(double precioMercado) {
		this.precioMercado = precioMercado;
	}


	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", velocidadMaxima=" + velocidadMaxima + ", color=" + color
				+ ", precioMercado=" + precioMercado + "]";
	}


	

	
	
	
}
