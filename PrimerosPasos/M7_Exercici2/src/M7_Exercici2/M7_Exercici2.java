package M7_Exercici2;
import java.util.Scanner;
public class M7_Exercici2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int suma_notes; 
		Float media;
		
		System.out.println("Introdueix quantes notes vols calcular");
		int num_notes=sc.nextInt(); 
		
		
		suma_notes=notas(num_notes);
		
		media=obtener_media(suma_notes, num_notes);
		
		respuesta(media);
	}
	
	public static byte notas(int num_notes) {
		Scanner sc = new Scanner(System.in);
		
		float nota = 0;
		int suma_notes=0;
		int i=0;
		
		while (i<num_notes) {
			System.out.println("Introdueix la nota numero " + (i+1)+":");
			nota=sc.nextFloat();
			
			if (nota >= 0 && nota <= 10) { 
				suma_notes+= nota;
				i++;
			}else {
				
			}
		}
		
		return (byte) suma_notes;
	}
	public static Float obtener_media (int suma_notes, int num_notes) {
		float media = (float) (suma_notes / num_notes);
		return media;
		
	}
	
	public static void respuesta(float media) {
		if (media < 5) {
			System.out.println("La nota mitjana de la classe està suspesa amb un "+media+ ". Els/les alumnes haurien de preguntar els seus dubtes i treballar més");
		} else if (media >= 5 && media <= 7) {
			System.out.println("La nota mitjana de la classe és bona amb un " +media+ ", però els/les alumnes haurien de millorar el treball personal"); 
		}else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat, un " +media+".");
		}
		
	}
	
	
}
