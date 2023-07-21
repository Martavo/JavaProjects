package M7_2_Exercici5;

import java.util.Scanner;

public class M7_2_Exercici5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		int i =2;
		boolean esPrimo = true; //con el booleano podemos hacerlo más eficiente para que salga del bucle

		//Opcion mas eficiente
		
		if (numero>1) {
			while(esPrimo && i< numero) { //así si a la primer ya ve que es primo, no hace falta que siga en el bucle
				if (numero % i==0) {
					esPrimo=false;
				}
				i++;
			}
		}else {
			esPrimo=false;
		}
		
		/*Opcion menos eficiente
         * if (numero <= 1) {
        
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        } */

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
	}

}
