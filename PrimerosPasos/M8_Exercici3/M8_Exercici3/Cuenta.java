package M8_Exercici3;

public class Cuenta {
	private int numCuenta;
	private int saldo;
	
	
	
	public Cuenta(int numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	
	
	
	
	public int getNumCuenta() {
		return numCuenta;
	}


	public int getSaldo() {
		return saldo;
	}




	public int ingresar(int cantidad) { //esto son metodos
		
		saldo = saldo + cantidad;
		
		return saldo;
	}
	
	public int retirar(int cantidad) { //esto son metodos
		if (saldo >= cantidad)
			saldo = saldo - cantidad;
		else
			System.out.println("No tienes suficiente saldo");
		
		return saldo;
	}
	
	



	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}

	

	

	
	
	
	
}
