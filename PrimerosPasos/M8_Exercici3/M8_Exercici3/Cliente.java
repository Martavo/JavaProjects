package M8_Exercici3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> listCuentas;
	
	

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.listCuentas = new ArrayList(); //se crea automaticamente un arraylist (Cuentas) asociado a cada cliente
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

	public ArrayList<Cuenta> getlistCuentas() {
		return listCuentas;
	}

	

	public ArrayList<Cuenta> getListCuentas() {
		return listCuentas;
	}



	public void setListCuentas(ArrayList<Cuenta> listCuentas) {
		this.listCuentas = listCuentas;
	}



	public void agregarCuenta(Cuenta cuenta) {
		listCuentas.add(cuenta);
	}

	public void mostrarCuentas() {
		for (Cuenta cuenta : listCuentas) {
			cuenta.toString();
		}
	}

	
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}


	
	
	
	
	
	
}
