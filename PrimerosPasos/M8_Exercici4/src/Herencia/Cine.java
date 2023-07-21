package Herencia;

public class Cine extends Edificio{

	private int AforoMaximo;
	
	public Cine(String nombre, int plantas, int superficie, int AforoMaximo) {
		super(nombre, plantas, superficie);
		this.AforoMaximo=AforoMaximo;
	}

	public int getAforoMaximo() {
		return AforoMaximo;
	}

	public void setAforoMaximo(int AforoMaximo) {
		this.AforoMaximo = AforoMaximo;
	}

	public String Vigilancia() {// el "título" es la interfaz
		
		String text;
		
		double vigilancia = Math.ceil((double)this.getSuperficie()/3000);
		
		double costeVigilancia = vigilancia*1500;
		
		text = ("Se necesitan " + vigilancia + " personas para la vigilancia. Tiene un coste mensual de: " + costeVigilancia);
		
		return text;
		
	
	}
	
	public String proyectarSesion() {
		String text = null;
		int ganancias;
		
		int precioEntrada = 6;
		int numAsistentes = 120;
		
		
		if (numAsistentes <= getAforoMaximo()) {
			ganancias = precioEntrada*numAsistentes;
			text = ("Se han recogido "+ ganancias+ " euros.");
		}else {
			text = ("Se ha superado el aforo maximo de personas");
		}
		
		
		return text;
	}

	@Override
	public String toString() {
		return "Cine [AforoMaximo=" + AforoMaximo + ", nombre=" + nombre + ", plantas=" + plantas + ", superficie="
				+ superficie + "]";
	}

	
	public Cine clone() { //clona el objeto con los mismos valores en sus atributos
		return new Cine(this.nombre, this.plantas, this.superficie, this.AforoMaximo);
		
	}
	
}
