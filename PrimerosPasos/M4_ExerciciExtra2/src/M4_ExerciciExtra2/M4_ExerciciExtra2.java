package M4_ExerciciExtra2;
import java.util.Scanner;
import java.util.ArrayList;
public class M4_ExerciciExtra2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		ArrayList<String> numeros = new ArrayList<String>();
		
		numeros.add("cero");
		numeros.add("uno");
		numeros.add("dos");
		numeros.add("tres");
		numeros.add("cuatro");
		numeros.add("cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		numeros.add("nueve");
		numeros.add("diez");
		numeros.add("once");
		numeros.add("doce");
		numeros.add("trece");
		numeros.add("catorce");
		numeros.add("quince");
		numeros.add("dieciseis");
		numeros.add("diecisiete");
		numeros.add("dieciocho");
		numeros.add("diecinueve");
		numeros.add("veinte");
		numeros.add("treinta");
		
		
		System.out.println("Introduce el número");
		int num1= sc.nextByte();
		System.out.println(numeros.get(num1));
	}

}
