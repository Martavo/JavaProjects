package M3_ExerciciExtra2;

import java.util.Scanner;

public class M3_ExerciciExtra2 {

public static void main(String[] args) {
		
		Scanner valor=new Scanner (System.in);
		int numero;
		int resultado;
		
		
		System.out.print("Introdueix un nombre enter: ");
        int num = valor.nextInt();
        
        int varInt = (num < 10) ? num : 1;
        
        System.out.println("Taula de multiplicar de " + varInt + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(varInt + " x " + i + " = " + (varInt * i));
        }

}
}
