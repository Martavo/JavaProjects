package Herencia;


public abstract class Edificio {
	
	protected String nombre; //no hace falta poner get cuando llamemos a esos atributos
	protected int plantas;
	protected int superficie;
	
	
	public Edificio(String nombre, int plantas, int superficie) {
		super();
		this.nombre = nombre;
		this.plantas = plantas;
		this.superficie = superficie;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getPlantas() {
		return plantas;
	}
	public int getSuperficie() {
		return superficie;
	}
	
	
	public String limpiar() {
		
		float tiempoPlanta = (float) (plantas*0.5);
		float tiempoLimpiar = (superficie/5)+tiempoPlanta;
		
		float costeMensual = tiempoLimpiar*30;
		
		String texto = ("Se necesitan "+ tiempoLimpiar+ " minutos para limpiar cada día, Tiene un coste mensual de: " + costeMensual);
		
		return texto;
	}
	
	
	public abstract String Vigilancia(); //es abstracto
	
	
	@Override
	public String toString() {
		return "Edificio [nombre=" + nombre + ", plantas=" + plantas + ", superficie=" + superficie + "]";
	}
	
	
	
}
