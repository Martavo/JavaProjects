package M4_Exercici4;

import java.util.Scanner;

public class M4_Exercici4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introdueix el mes que vulguis consultar");
		byte mes = sc.nextByte();
		
		switch(mes) {
		case 1:
			System.out.println("Gener té 31 dies");
			break;
		case 2: 
			System.out.println("Febrer té 28 dies");
			break;
		case 3: 
			System.out.println("Març té 31 dies");
			break;
		case 4: 
			System.out.println("Abril té 30 dies");
			break;
		case 5: 
			System.out.println("Maig té 31 dies");
			break;
		case 6: 
			System.out.println("Juny té 30 dies");
			break;
		case 7: 
			System.out.println("Juliol té 30 dies");
			break;
		case 8: 
			System.out.println("Agost té 31 dies");
			break;
		case 9: 
			System.out.println("Septembre té 30 dies");
			break;
		case 10: 
			System.out.println("Octubre té 31 dies");
			break;
		case 11: 
			System.out.println("Novembre té 30 dies");
			break;
		case 12: 
			System.out.println("Desembre té 31 dies");
			break;
		default:
			System.out.println("No has introduit cap mes");
	
		}

	}

}