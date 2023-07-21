package M7_3_Exercici5;

import java.util.Scanner;

public class M7_3_Exercici5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la frase");
		String frase=sc.nextLine();
		
	
        if (frase.equals(frase.toUpperCase())) {
        	System.out.println("La frase está formada por mayúsculas");
        }else if (frase.equals(frase.toLowerCase())){
        	System.out.println("La frase está formada por minúsculas");
        }else {
        	System.out.println("La frase está formada por mayúsculas y minúsculas");
        }

}
	
}
	

