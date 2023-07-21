package M7_Ejercicio6;
import java.util.Scanner;
public class M7_Ejercicio6 {

	public static void main(String[] args) {
	
		int num = pedirNumero();
		tablaMultiplicar(num);
		
	}
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in); 
		int num;
		do {
			System.out.println("Dime un número del 1 al 10");
			num=sc.nextInt();
		}while (num < 0 || num >10);
		
		return num;
	}
	
	public static void tablaMultiplicar(int num) {
		int resultado = 0;
		System.out.println("Tabla de multiplicar del " + num + ":");
		
		for (int i = 0; i <= 10; i++) {
            int resultado1 = num * i;
            System.out.println(num + " x " + i + " = " + resultado1);
			
		}
		
	}
	
}
