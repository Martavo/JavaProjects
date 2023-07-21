package M3_EjemplosClase;
import java.util.Scanner;
public class Ejemploswitch1 {

	public static void main(String[] args) {
		
		Scanner semana = new Scanner(System.in);
		
		String mensaje;
		
		System.out.println("Indica el dia de la semana en números");
		int dia = semana.nextInt();
		
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			mensaje= "Dia laboral";
			break;
		case 6:
		case 7:
			mensaje = "Fin de semana";
			break;
		default:
			mensaje = "Has introducido mal el número del dia";
		
		}
		
		System.out.println(mensaje);
	}

}
