package Herencia;

public class Hospital extends Edificio{

	private int pacientes;
	public static final int RACIONCOMIDAS = 3;
	
	
	public Hospital(String nombre, int plantas, int superficie, int pacientes) {
		super(nombre, plantas, superficie);
		this.pacientes=pacientes;
	}

	
	public int getPacientes() {
		return pacientes;
	}


	public void setPacientes(int pacientes) {
		this.pacientes = pacientes;
	}


	public  String Vigilancia() {
		
		String text;
		
		double vigilancia = Math.ceil((double)this.getSuperficie()/1000);
		
		double costeVigilancia = vigilancia*1500;
		
		text = ("Se necesitan " + vigilancia + " personas para la vigilancia. Tiene un coste mensual de: " + costeVigilancia);
		
		return text;
		
	}
	
	
	public String repartirComida(){
		
		int num_comidas = getPacientes()*RACIONCOMIDAS;
		
		String text = ("Se estan repartiendo "+ num_comidas+ " comidas.");
		
		return text;
		
	}


	@Override
	public String toString() {
		return "Hospital [pacientes=" + pacientes + ", nombre=" + nombre + ", plantas=" + plantas + ", superficie="
				+ superficie + "]";
	}

	
	
	
}
