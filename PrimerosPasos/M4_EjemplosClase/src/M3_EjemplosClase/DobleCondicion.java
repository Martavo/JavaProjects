package M3_EjemplosClase;

public class DobleCondicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numero = 5;
		byte numero2 = 16;
		
		if (numero > 5 && numero2 > 10) { //LAS DOS CONDICIONES TIENEN QUE CUMPLIRSE
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if (numero < 12 || numero2 > 15) { //CON QUE SE CUMPLA UNA CONDICIÓN YA QUE CUMPLE
			System.out.println("true");
		}else {
			System.out.println("false");
			}
	}

}
