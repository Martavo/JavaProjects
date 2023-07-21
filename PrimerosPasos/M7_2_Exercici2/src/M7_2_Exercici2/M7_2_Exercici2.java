package M7_2_Exercici2;
import java.util.Scanner;
public class M7_2_Exercici2 {

public static void main(String[] args) {
		
		int numero = pedirNumero();
		char simbolo = '*';
		//String text;
		
		for (int i = numero; i>=1; i--) { //
			 for (int j = 1; j<=i; j++) { //es de donde sale la orden de que se repita x veces el * 
	        	System.out.print(simbolo + " ");
	        }System.out.println();{
	        	
	        }
		}
		
}
		/*for (int i=0; i<numero; i++){
			for (int j=i; j<numero; j++){
				text += "*";
		 	}
		 	text += "\n"; (es para añadir un espacio despues de cada linea de *)
	}
	System.out.println(text);*/
		
		
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		return numero;
	}

}
