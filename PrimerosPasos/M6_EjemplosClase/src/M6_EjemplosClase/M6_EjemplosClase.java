package M6_EjemplosClase;
import java.util.Scanner;
public class M6_EjemplosClase {
//static Scanner sc = new Scanner(System.in); es la manera de declarar la clase de forma global para no ponerla en todos los metodos. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero1 = 5;
        int numero2 = 8;
        int numero3 = 10;

        System.out.println("Llamada a la primera función:");
        suma();
        //suma(numero1, numero2); // esta es la de la linea 43
        //suma();
        
        System.out.println("Llamada a la segunda función:");
        int result = suma2();
        System.out.println(result);
        
        System.out.println("Llamada a la tercera función:");
        String mensaje = suma3(numero1, numero2); //en la llamada ponemos el nombre dedel dato, no el tipo de dato
        System.out.println(mensaje);
        
        System.out.println("Llamada a la cuarta función:");
        suma4(numero1, numero2, numero3); //se llama parámetro lo de dentro del (), no tiene porque coincidir con el nombre del argumento, pero el orden si
    }
	
	
	//Función sin parámetros y sin return// 
    public static void suma() { // se pone void cuando no devuelve nada
        Scanner sc = new Scanner(System.in);
        int resultado;

        System.out.println("Introduce un número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = sc.nextInt();
        resultado = numero1 + numero2;
        System.out.println("El resultado es " + resultado);
    }

    public static void suma(int numero1, int numero2) { //aqui si que ponemos el tipo de dato y su nombre
        int resultado = numero1 + numero2;
        System.out.println("El resultado es " + resultado);
    }

    //Función sin parámetros con return//
    public static int suma2() {
        Scanner sc = new Scanner(System.in);
        int resultado;

        System.out.println("Introduce un número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = sc.nextInt();

        resultado = numero1 + numero2;
        return resultado;
    }

    //Función con parámetros y return //
    public static String suma3(int numero1, int numero2) {
        String mensaje;

        float resultado = (numero1 + numero2) / 2;

        if (resultado >= 5) {
            mensaje = "Has aprobado";
        } else {
            mensaje = "Has suspendido";
        }
        return mensaje;
    }

    //Función con parámetros sin return//
    public static void suma4(int numero1, int numero2, int numero3) { //esto se llama argumento no parametros
        System.out.println(numero1 + numero2 + numero3);
    }





	}


