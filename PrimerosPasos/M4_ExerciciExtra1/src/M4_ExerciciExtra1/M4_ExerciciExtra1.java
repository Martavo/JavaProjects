package M4_ExerciciExtra1;
import java.util.Scanner;
public class M4_ExerciciExtra1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (debe estar entre 2 y 7): ");
        int divisor = sc.nextInt();

        if (divisor >= 2 && divisor <= 7) {
            if (dividendo % divisor == 0) {
                System.out.println(dividendo + " es múltiplo de " + divisor + ".");
            } else {
                System.out.println(dividendo + " no es múltiplo de " + divisor + ".");
            }
        } else {
            System.out.println("Error: El divisor debe estar entre 2 y 7.");
        }


}
}
