package Herencia;

public class Pilotos extends Trabajadores {
	private double peso;
    private double altura;
    public static final double PELIGROSIDAD = 50000;

    public Pilotos(String nombre, String apellido, int edad, double tiempoTrabajado, double altura, double peso) {
        super(nombre, apellido, edad, tiempoTrabajado);
        this.peso = peso;
        this.altura = altura;
    }

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public  String Sueldo() {
		String texto = null;
		
		super.setSueldo(super.getSueldoBase() + PELIGROSIDAD + super.getPlusAntiguedad() * super.getTiempoTrabajado());
		texto="El sueldo del piloto es: " + super.getSueldo();
		
		return texto;
		
	}


	@Override
    public String toString() {
        return "Piloto [peso=" + peso + ", altura=" + altura + ", nombre=" + getNombre() + ", apellido=" + getApellido()
                + ", edad=" + getEdad() + ", tiempoTrabajado=" + getTiempoTrabajado() + ", sueldoBase=" + getSueldoBase() + "]";
    }
	
	
	
	
}
