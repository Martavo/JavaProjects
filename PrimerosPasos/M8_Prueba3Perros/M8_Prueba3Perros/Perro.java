package M8_Prueba3Perros;

public class Perro {
	private String raza;
	private String nombre;
	private int edad;
	private String color_pelo;
	private String sexo;
	

	
	public Perro() {
		
	}

	public Perro(String raza, String nombre, int edad, String color_pelo, String sexo) {
		
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.color_pelo = color_pelo;
		this.sexo = sexo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor_pelo() {
		return color_pelo;
	}

	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
	
	
	public void ladrar() { //esto son metodos
		
	}
	
	public void comer() { //esto son metodos
		
	}

	public void correr() { //esto son metodos
	
	}

	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", color_pelo=" + color_pelo
				+ ", sexo=" + sexo + "]";
	}
	
	
	
	
}
