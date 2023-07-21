package M7_Exercici8;
import java.util.Scanner;
public class M7_Exercici8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los grados en ºC que quieres convertir");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius*9/5)+32;
		
		System.out.println(celsius + " grados celsius son "+fahrenheit+" grados Fahrenheit");
	}

}
