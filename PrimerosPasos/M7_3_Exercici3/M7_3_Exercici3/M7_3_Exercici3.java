package M7_3_Exercici3;
import java.util.Scanner;
public class M7_3_Exercici3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        boolean esPalindromo = true;
        int i= 0;
    	
        String frasefinal = frase.replaceAll("\\s", "").toLowerCase(); //quitar espacios y pasar a minúscula.
        
        int longitud = frasefinal.length()-1; //para que sea una variable mas corta y se le resta una posición
        
        int tamaño = longitud/2;
		
       
		while (esPalindromo && i < tamaño) {
        	if (frasefinal.charAt(i) != frasefinal.charAt(longitud - i)) {
        		esPalindromo = false;
        	}
        	i++;
        }
        
        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        
        //No seria tan efectivo porque rompemos el bucle de manera bruta con el return. Se prefiere la primera opción.
        /*for (int i = 0; i < tamaño ; i++) { 
            if (frasefinal.charAt(i) != frasefinal.charAt(longitud - i)) { //para comprobar los caracteres, primera parte mira posicion 2, y el otro extremo tamaño de la frase - posicion
                return false;
            }
        }return true;
        */
        
    }
}