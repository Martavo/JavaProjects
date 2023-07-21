package CalculoPasta;
import java.util.Scanner;
public class CalculoPasta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int pastaCrudaMarta = 70;
		int pastaCrudaJC = 100;
		
		float porcentajeMarta = (float) 0.41;
		float porcentajeJC = (float) 0.59;
		
	System.out.println("Cuanta pasta has cocido?");
	float pastacocida = sc.nextInt();
	
	float pastacocidaMarta = pastacocida*porcentajeMarta;
	System.out.println("Marta come "+ pastacocidaMarta + " gramos de pasta");
	
	float pastacocidaJC = pastacocida*porcentajeJC;
	
	System.out.println("Juan Carlos come "+ pastacocidaJC + " gramos de pasta");

	}

}
