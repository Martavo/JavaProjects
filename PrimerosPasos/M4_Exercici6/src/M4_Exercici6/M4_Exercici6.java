package M4_Exercici6;
import java.util.Scanner;
public class M4_Exercici6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String signo = null;
		
		System.out.println("Ingrese su dia de nacimiento");
		byte dia= sc.nextByte();
		
		System.out.println("Ingrese su mes de nacimiento");
		byte mes= sc.nextByte();
		
		switch(mes) {
		case 1: 
			if (dia >= 1 && dia <20) {
				signo = "Capricornio";
			}else if (dia >= 20 && dia <= 31) {
				signo = "Acuario";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 2: 
			if (dia >= 1 && dia <= 19) {
				signo = "Acuario";
			}else if (dia >= 20 && dia <= 29) {
				signo = "Piscis";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 3: 
				if (dia >= 1 && dia <= 20) {
					signo = "Piscis";
				}else if (dia > 20 && dia <= 31) {
					signo = "Aries";
				}else {
					signo = "El dia no está bien introducido";
				}
				break;
		case 4: 
			if (dia >= 1 && dia <= 20) {
				signo = "Aries";
			}else if (dia > 20 && dia <= 30) {
				signo = "Tauro";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 5: 
			if (dia >= 1 && dia <= 20) {
				signo = "Tauro";
			}else if (dia > 20 && dia <= 31) {
				signo = "Geminis";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 6: 
			if (dia >= 1 && dia <= 20) {
				signo = "Geminis";
			}else if (dia > 20 && dia <= 30) {
				signo = "Cáncer";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 7: 
			if (dia >= 1 && dia <= 20) {
				signo = "Cancer";
			}else if (dia > 20 && dia <= 30) {
				signo = "Leo";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 8: 
			if (dia >= 1 && dia <= 23) {
				signo = "Leo";
			}else if (dia > 23 && dia <= 31) {
				signo = "Virgo";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 9: 
			if (dia >= 1 && dia <= 23) {
				signo = "Virgo";
			}else if (dia > 23 && dia <= 31) {
				signo = "Libra";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 10: 
			if (dia >= 1 && dia <= 22) {
				signo = "Libra";
			}else if (dia > 22 && dia <= 31) {
				signo = "Escorpio";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 11: 
			if (dia >= 1 && dia <= 22) {
				signo = "Escorpio";
			}else if (dia > 22 && dia <= 30) {
				signo = "Sagitario";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		case 12: 
			if (dia >= 1 && dia <= 22) {
				signo = "Sagitario";
			}else if (dia > 22 && dia <= 31) {
				signo = "Capricornio";
			}else {
				signo = "El dia no está bien introducido";
			}
			break;
		default:
	}
		System.out.println("Tu signo del zodiaco es " + signo);
		
}
}

