package M5_Exercici3;
import java.util.Scanner;
public class M5_Exercici3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numPc = (int)(Math.random() *10); //treure aleatoriament un numero fins a 10
		int numUser = 0;
		int intento=0;
		final int MAXINTENTOS = 5 ;
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println(numPc); //para saber cual es 
		
		do{
			System.out.println("Digues un número");
			numUser = entrada.nextInt();
			intento +=1;
			
			if (numUser < numPc) { // con esto damos las pistas sobre el número
				System.out.println("Numero bajo");
			} else if (numUser > numPc){
				System.out.println("Numero alto");
			}
			
		}while(numPc != numUser && intento < MAXINTENTOS); //de esta manera primera marcamos el limite de intentos
		
		if(numPc == numUser) { //con esto hacemos la condición para el sorteo
		System.out.println("Enhorabuena, el número es " + numPc + " y has necesitado " + intento+ " intentos por acertarlo”.");
		}else {
			System.out.println("Has utilizado el número máximo" + intento+ " intentos. El número aleatorio es " + numPc);
		}
}
}
		


