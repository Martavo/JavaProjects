package M5_Exercici1;
import java.util.ArrayList;
import java.util.Scanner;
public class M5_Exercici1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> palabras = new ArrayList<String>();
		
		System.out.println("Introduce el numero de palabras que quieres introducir en la lista:");
		int tamaño=sc.nextInt();
		
		
		for (int i = 0; i < tamaño; i++) {
			System.out.println("Introduce la palabra:");
			String palabra = sc.next();
            palabras.add(palabra);  //añadir palabras en un array
        }
		
		for (int i=0; i<tamaño; i++) {
			System.out.println(palabras.get(i)); //para que imprima en lista las palabras introducidas
		}

}
}