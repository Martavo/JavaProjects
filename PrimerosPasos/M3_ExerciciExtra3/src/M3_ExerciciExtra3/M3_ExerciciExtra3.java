package M3_ExerciciExtra3;

import java.util.Scanner;

public class M3_ExerciciExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte coberturaLitro = 12;
		byte altura;
		byte anchura;
		byte numero_de_mano;
		byte area;
		
		Scanner pintura =new Scanner (System.in);
		
		System.out.println("Introduce cuando mide de altura la pared, por favor");
		altura = pintura.nextByte();
		
		System.out.println("Introduce cuando mide de ancha la pared, por favor");
		anchura = pintura.nextByte();
		
		area = (byte) (altura * anchura);
		
		System.out.println("El area que tenemos que pintar es de " + area+ "m2");
		
		System.out.println("Introduce cuantas manos de pintura quieres darle a la pared, por favor");
		numero_de_mano = pintura.nextByte();
		
		byte litros_de_pintura = (byte) (area/12*numero_de_mano);
		
		System.out.println("Necesitamos " + litros_de_pintura + " litros de pintura");
		
		
	}

}
