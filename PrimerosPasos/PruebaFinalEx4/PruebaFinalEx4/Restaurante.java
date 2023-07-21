package PruebaFinalEx4;

public class Restaurante {
	
	private String nombre;
	private String latitud; 
	private String longitud; 
	private String tipoCocina; 
	private int puntuacion;
	
	
	public Restaurante(String nombre, String latitud, String longitud, String tipoCocina, int puntuacion) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipoCocina = tipoCocina;
		this.puntuacion = puntuacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLatitud() {
		return latitud;
	}


	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}


	public String getLongitud() {
		return longitud;
	}


	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}


	public String getTipoCocina() {
		return tipoCocina;
	}


	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", tipoCocina="
				+ tipoCocina + ", puntuacion=" + puntuacion + "]";
	} 
	
	
	

	
	
}
