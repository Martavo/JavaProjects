package Herencia;

public abstract class Trabajadores {
	 private String nombre;
	    private String apellido;
	    private int edad;
	    private double tiempoTrabajado;
	    private static double sueldoBase = 50000;
	    private static double plusAntiguedad = 10000;
	    private double sueldo;

   public Trabajadores(String nombre, String apellido, int edad, double tiempoTrabajado) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	        this.tiempoTrabajado = tiempoTrabajado;

	    }

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getTiempoTrabajado() {
		return tiempoTrabajado;
	}
	public void setTiempoTrabajado(double tiempoTrabajado) {
		this.tiempoTrabajado = tiempoTrabajado;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static double getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public abstract String Sueldo();

	@Override
    public String toString() {
        return "Trabajadores [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tiempoTrabajado="
                + tiempoTrabajado + ", sueldoBase=" + sueldoBase + "]";
    }
	
}

