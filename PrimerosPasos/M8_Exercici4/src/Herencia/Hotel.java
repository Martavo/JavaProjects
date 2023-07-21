package Herencia;

public class Hotel extends Edificio{

	private int habitaciones;
	public static final int PLUSPELIGRO = 500;
	
	public Hotel(String nombre, int plantas, int superficie, int habitaciones) {
		super(nombre, plantas, superficie);
		this.habitaciones=habitaciones;
	}
	
	
	public int getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}


	public  String Vigilancia() {
		
		String text;
		
		double vigilancia = Math.ceil((double)this.getSuperficie()/1000);
		
		double costeVigilancia = vigilancia*(1500+Hotel.PLUSPELIGRO);
		
		text = ("Se necesitan " + vigilancia + " personas para la vigilancia. Tiene un coste mensual de: " + costeVigilancia);
		
		return text;
		
	}

	
	public String servicioHabitaciones() {
		String text = null;
		
		int personasLimpieza = habitaciones/20;
		
		int costeLimpieza = personasLimpieza*1000;
		
		text = ("Se necesitan "+personasLimpieza+ " personas para limpiar el hotel. Tiene un coste mensual de "+ costeLimpieza+" euros.");
		
		return text;
	}


	@Override
	public String toString() {
		return "Hotel [habitaciones=" + habitaciones + ", nombre=" + nombre + ", plantas=" + plantas + ", superficie="
				+ superficie + "]";
	}
	
	
	
}
