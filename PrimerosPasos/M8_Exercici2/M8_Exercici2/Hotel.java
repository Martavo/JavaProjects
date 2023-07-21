package M8_Exercici2;

public class Hotel {

	private String nombre;
	private int habitaciones;
	private int plantas;
	private double superficie;
	
	
	

	public Hotel(String nombre, int habitaciones, int plantas, double superficie) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.plantas = plantas;
		this.superficie = superficie;
	}

	public String calcularManteniment() {
		
		int habitacionesPorPersona = 20;
	    int personasNecesarias = habitaciones / habitacionesPorPersona;
	    if (habitaciones % habitacionesPorPersona != 0) {
	        personasNecesarias++;
	    }
	  
	    
	    double costoTotal = personasNecesarias * 1500;

	    String mensaje = "Las personas necesarias para atender el servicio de habitaciones es: " + personasNecesarias+ 
	    		". El coste total destinado al servicio es de: " + costoTotal + " € al mes.";
	    
	    return mensaje;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getPlantas() {
		return plantas;
	}
	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", habitaciones=" + habitaciones + ", plantas=" + plantas + ", superficie="
				+ superficie + "]";
	}

	
	

	
	
}
