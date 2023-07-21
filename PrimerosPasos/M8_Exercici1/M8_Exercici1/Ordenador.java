package M8_Exercici1;

public class Ordenador {
	private String marca;
	private String modelo;
	private String procesador;
	private int memoriaRam;
	private int discoDuro;
	
	
	
	public Ordenador(String marca, String modelo, String procesador, int memoriaRam, int discoDuro) {

		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoriaRam = memoriaRam;
		this.discoDuro = discoDuro;
	}


	public Ordenador(String marca, String modelo) {
	
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	
	public static String ejecucionPrograma(String programa) {
		
	       
		return "En estos momentos se esta ejecutando: '" + programa;
		
	}
	
	
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	public int getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	

	@Override //se usa de forma interna
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordenador other = (Ordenador) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", memoriaRam="
				+ memoriaRam + ", discoDuro=" + discoDuro + "]";
	}
	
	
	
	
	
}
