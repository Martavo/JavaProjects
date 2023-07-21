package M7_3_Exercici2;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_Exercici2 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
	  String palabra;
	  //String reserse = "";
	  char caracter;
	  int length;
	  
	  
	  
		System.out.println("Introduce la palabra");
		palabra=sc.nextLine();
		
		length = palabra.length()-1; //pasamos el metodo que lee la medida del String a una variable para que sea más eficiente
		String alReves = ""; //variable para ir acumulando el String al revés
		
		for (int i = length; i >= 0; i-- ) {
			alReves += palabra.charAt(i); //System.out.print(palabra.charAt(i));
		}
		System.out.println(alReves);
		
		//Version2
		
		/*length = palabra.length();
		 for (int i = 0; i< length; i++){
		 caracter = palabra.charAt(i);
		 reserse = caracter + reverse;
		 }
		 System.out.println(reverse);
		 */
	
	
		

}
}
