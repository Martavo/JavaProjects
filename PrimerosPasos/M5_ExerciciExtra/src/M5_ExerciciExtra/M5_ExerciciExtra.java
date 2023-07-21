package M5_ExerciciExtra;
import java.util.Scanner;
public class M5_ExerciciExtra {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		char respuesta;
		byte num1;
		byte num2;
		String respuestaString;
		String operador;
		float resultado;
		
		do {
			System.out.println("Introduce el primer número");
			num1= sc.nextByte();
			
			System.out.println("Introduce el segundo número");
			num2= sc.nextByte();
			
			System.out.println("Ingrese el operador (+, -, *, /)");
			operador = sc.nextLine();
			resultado =0;
			
			switch(operador) {
			case "+": 
				resultado=num1+num2;
				break;
			case "-":
				resultado=num1-num2;
				break;
			case "*":
				resultado=num1*num2;
				break;
			case "/":
				resultado=(float) num1/ (float) num2;
				break;
			default:
				System.out.println("Operador no válido");
				return;	
			}
			
			System.out.println("El resultado es: " + resultado);
			
			System.out.println("Quieres realizar otra operación?");
			respuestaString = sc.nextLine();
			respuestaString= respuestaString.toLowerCase();
			respuesta = respuestaString.charAt(0);
			
		}while(respuesta != 'n');

	}

}
