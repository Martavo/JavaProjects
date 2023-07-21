 package M8_Exercici3;
import java.util.ArrayList;
import java.util.Scanner;


public class M8_Exercici3 {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		ArrayList<Cliente> listClientes = new ArrayList<>();
		
		Cliente cliente1 = new Cliente ("Marta", "Villalba");
		Cliente cliente2 = new Cliente ("Pedro", "Lopez");
		Cliente cliente3 = new Cliente ("Anna", "Gomez");
		listClientes.add(cliente1);
		listClientes.add(cliente2);
		listClientes.add(cliente3);
		
		
		
		Cuenta cuenta1 = new Cuenta(1,0);
		listClientes.get(0).agregarCuenta(cuenta1);
		
		
		int opcion = 0;	
		int posicion; 
		int posicionCuenta;
		int num_cuenta = 0;
		boolean encontrado;
		
		do{
		      mostrarMenu();
		      opcion = sc.nextInt();
		      sc.nextLine();
		        	
		      switch(opcion){
		         case 0:
		        	 System.out.println("Gracias por usar la aplicación");
		            break;
		         case 1:
		        	 posicion = buscarCliente(listClientes);
		        	 crearCliente(listClientes, posicion);
		        	 verClientes(listClientes);
		            break;
		         case 2: 
		        	 posicion = buscarCliente(listClientes);
		        	 eliminarCliente(listClientes, posicion);
		        	 verClientes(listClientes);
		            break;
		         case 3:
		        	 posicion = buscarCliente(listClientes);
		        	 encontrado = buscarCuenta(listClientes, posicion);
		        	 crearCuenta(listClientes, posicion, encontrado);
			        break;
		         case 4:
		        	 posicion = buscarCliente(listClientes);
		        	 posicionCuenta = buscarPosicionCuenta(listClientes, posicion);
		        	 ingresarDinero(listClientes, posicion, posicionCuenta, num_cuenta);
			        break;
		         case 5: 
		        	 posicion = buscarCliente(listClientes);
		        	 posicionCuenta = buscarPosicionCuenta(listClientes, posicion);
		        	 sacarDinero(listClientes, posicion, posicionCuenta, num_cuenta);
		        	 break;
		         case 6: 
		        	 verClientes(listClientes);
		        	 break;	 
		 		default:
	            System.out.println("Opción invalida, por favor elige una opción correcta");
	            }
	            System.out.println(); //Linea en blanco para separa las iteraciones del bucle
		        }while(opcion !=6);   
		
		
}
	
	public static void mostrarMenu() {
		
			System.out.println("Elige la opción que quieras realizar");
			System.out.println("0. Salir de la aplicación");
			System.out.println("1. Crear cliente/a");
			System.out.println("2. Eliminar cliente/a");
			System.out.println("3. Crear cuenta de un cliente/a");
			System.out.println("4. Ingresar euros en una cuenta de un cliente/a");
			System.out.println("5. Retirar euros en una cuenta de un cliente/a");
			System.out.println("6. Ver clientes dados de alta");
	}
	
	//Metodo buscar cliente
	
	public static int buscarCliente(ArrayList<Cliente>listClientes) {
		int posicion = -1, i =0; 
		
		
		System.out.println("Introduza el nombre del cliente: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduza el apellido del cliente: ");
		String apellido = sc.nextLine();
		
		
		while (posicion == -1 && i<listClientes.size()) {
			if (listClientes.get(i).getNombre().equalsIgnoreCase(nombre) &&  
					listClientes.get(i).getApellido().equalsIgnoreCase(apellido)){
				posicion = i ;
			}
			
			i++;
		}
		
		return posicion;
	}
	//Metodo crear cliente
	public static void crearCliente(ArrayList<Cliente>listClientes, int posicion) {
		
		if (posicion == -1) {
			System.out.println("Nombre del cliente");
	    	String nombre = sc.nextLine();
	    	
	    	System.out.println("Apellido del cliente");
	    	String apellido = sc.nextLine();
	    	
	    	Cliente cliente = new Cliente (nombre.toUpperCase(), apellido.toUpperCase());
	    	listClientes.add(cliente);
		}else {
			System.out.println("El cliente ya está dado de alta en el sistema");
		}
		
	}
	
	//Metodo para eliminar a un cliente
	public static void eliminarCliente(ArrayList<Cliente>listClientes, int posicion) {

		if (posicion != -1) {
			listClientes.remove(posicion);
			System.out.println("El cliente ha sido eliminado");
		}else {
			System.out.println("El cliente no está en el sistema");
		}
	}
	
	//Metodo para buscar si existe la cuenta
	public static boolean buscarCuenta(ArrayList<Cliente>listClientes, int posicion) {
		int i =0; 
		boolean encontrado = false;

		if (posicion == -1 ) {
			System.out.println("El cliente no está creado en el sistema");
		}else {
			System.out.println("Introduza el numero de cuenta: ");
			int num_cuenta = sc.nextInt();
			
			ArrayList<Cuenta> cuentas = listClientes.get(posicion).getlistCuentas();
			
			for (Cuenta cuenta : cuentas) {
		        if (cuenta.getNumCuenta() == num_cuenta) {
		            encontrado = true;
		        }
				i++;
				
			}
		}
		
		
		return encontrado;
	
		
	}	

	
	//Metodo para crear cuenta
	public static void crearCuenta(ArrayList<Cliente>listClientes, int posicion, boolean encontrado) {
		
		
		if (posicion != -1 && encontrado == false) {
			System.out.println("Introduzca el nuevo numero de cuenta");
	    	int num_cuenta = sc.nextInt();
	    	
	    	Cuenta cuenta =new Cuenta (num_cuenta, 0);

	    	
	    	listClientes.get(posicion).getlistCuentas().add(cuenta);
			
			System.out.println("La cuenta ha sido creada. Es la cuenta numero " + num_cuenta + " con saldo 0.");
		
		} else if (encontrado == true) {
			System.out.println("La cuenta ya está en el sistema");
		}
		
	}
	//Metodo para buscar posicion cuenta
		public static int buscarPosicionCuenta(ArrayList<Cliente>listClientes, int posicion) {
			int posicionCuenta = -1;
		    int i = 0;
		    System.out.println("Introduzca el número de cuenta a buscar:");
		    int num_cuenta = sc.nextInt();

		    ArrayList<Cuenta> cuentas = listClientes.get(posicion).getlistCuentas();

		    while (posicionCuenta == -1 && i < cuentas.size()) {
		        if (cuentas.get(i).getNumCuenta() == num_cuenta) {
		            posicionCuenta = i;
		        }
		        i++;
		    }

		    return posicionCuenta;
		}
	
	//Metodo para ingresar dinero
	public static void ingresarDinero(ArrayList<Cliente>listClientes, int posicion, int posicionCuenta, int num_cuenta) {
		
		if (listClientes.get(posicion).getlistCuentas().size() == 0) {
			System.out.println("No hay cuentas asociadas a este cliente");
		}else if (posicionCuenta == -1){
			System.out.println("La cuenta no está creada en el sistema");
			
		}else {
			System.out.println("Introduzca cuanto dinero quiere ingresar:");
	    	int ingreso = sc.nextInt();
		
	    	int nuevoSaldo = listClientes.get(posicion).getlistCuentas().get(posicionCuenta).ingresar(ingreso);
	    	System.out.println("El saldo de la cuenta numero "+num_cuenta+ " es de "+ nuevoSaldo);
		}
		
		
	}
	
	//Metodo para sacar dinero
		public static void sacarDinero(ArrayList<Cliente>listClientes, int posicion, int posicionCuenta, int num_cuenta) {
			if (listClientes.get(posicion).getlistCuentas().size() == 0) {
				System.out.println("No hay cuentas asociadas a este cliente");
			}else if (posicionCuenta == -1){
				System.out.println("La cuenta no está creada en el sistema");
				
			}else {
				System.out.println("Introduzca cuanto dinero quiere sacar:");
		    	int sacarDinero = sc.nextInt();
			
		    	int nuevoSaldo = listClientes.get(posicion).getlistCuentas().get(posicionCuenta).retirar(sacarDinero);
		    	System.out.println("El saldo de la cuenta numero "+num_cuenta+ " es de "+ nuevoSaldo);
			}
			
			
		}
	
	//Metodo para ver todos los clientes
	public static void verClientes(ArrayList<Cliente>listClientes) {
		System.out.println("Listado de clientes dados de alta:");
		for (Cliente cliente : listClientes){
			System.out.println(cliente);
			}
	}
	
}
