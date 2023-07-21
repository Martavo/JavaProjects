package Herencia;

import java.util.ArrayList;


public class Escuderia {
	
    private String nombre;
    private double presupuesto;
    private String paisOrigen;
    private ArrayList<Trabajadores> listTrabajadores;
    private ArrayList<Coche> listCoches;

    public Escuderia(String nombre, double presupuesto, String paisOrigen) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.paisOrigen = paisOrigen;
        listTrabajadores = new ArrayList<>();
        listCoches = new ArrayList<>();
    }
	


	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}
	

	public ArrayList<Trabajadores> getListTrabajadores() {
		return listTrabajadores;
	}


	public void setListTrabajadores(ArrayList<Trabajadores> listTrabajadores) {
		this.listTrabajadores = listTrabajadores;
	}


	public ArrayList<Coche> getListCoches() {
		return listCoches;
	}


	public void setListCoches(ArrayList<Coche> listCoches) {
		this.listCoches = listCoches;
	}


	public void agregarTrabajador(Trabajadores trabajador) {
		listTrabajadores.add(trabajador);
	}
	
	public void agregarCoche(Coche coche) {
		listCoches.add(coche);
	}

	@Override
	public String toString() {
		return "Escuderia [nombre=" + nombre + ", presupuesto=" + presupuesto + ", paisOrigen=" + paisOrigen + "]";
	}

    
    
}
