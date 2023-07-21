package M7_Exercici1;
import java.util.Scanner;
public class M7_Exercici1 {

	public static void main(String[] args) {
		final int numero_notas=3;
		
		float suma=pedirNotas(numero_notas); //porque me da error sin el byte??
		float media = obtenerMedia(suma, numero_notas);
		String mensaje = obtenerMensaje(media);
		
	}

	public static float pedirNotas(int numero_notas) {
		Scanner sc = new Scanner(System.in);
		
		float suma= 0, nota;
		int i = 0;
		
		while (i < numero_notas) {
			System.out.println("Introduce la nota "+(i+1)+":");
			nota = sc.nextFloat();
			if(nota>0 && nota <= 10) {
				suma += nota;
				i++;
			}else {
				System.out.println("La nota es incorrecta");
			}
		}
		return suma;
	}
	
	public static float obtenerMedia (float suma, final int numero_notas) {
		float media = (float) (suma / numero_notas);
		return media;
		
	}	
	
	public static String obtenerMensaje(float media) {
		String result = null;
		if (media <5) {
			System.out.println("No has superado el curso, debes recuperar");
		}else if (media <7) {
			System.out.print("Enhorabuena! Has aprobado pero deberías seguir practicando");
		}else {
			System.out.println("Enhorabuena! Has superado el curso! Pasa ya al siguiente nivel");
		}
		return result;
	}
}
