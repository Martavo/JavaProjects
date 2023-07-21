package Herencia;

public class Mecanicos extends Trabajadores {
	
	private boolean estudiosMecanica;

    public Mecanicos(String nombre, String apellido, int edad, double tiempoTrabajado, boolean estudiosMecanica) {
        super(nombre, apellido, edad, tiempoTrabajado);
        this.estudiosMecanica = estudiosMecanica;
    }

    
	public boolean isEstudiosMecanica() {
		return estudiosMecanica;
	}


	public void setEstudiosMecanica(boolean estudiosMecanica) {
		this.estudiosMecanica = estudiosMecanica;
	}


	@Override
    public String toString() {
        return "Mecanico [estudiosMecanica=" + estudiosMecanica + ", nombre=" + getNombre() + ", apellido=" + getApellido()
                + ", edad=" + getEdad() + ", tiempoTrabajado=" + getTiempoTrabajado() + ", sueldoBase=" + getSueldoBase() + "]";
    }







	@Override
	public String Sueldo() {
		String texto = null;

		texto="El sueldo del piloto es: " + super.getSueldoBase();
		
		return texto;
	}



}
