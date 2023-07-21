package M5_EjemplosClase;
import java.util.ArrayList;
import java.util.Scanner;
public class M5_ArraysFor1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);


	        for (int i = 0; i < 5; i++) {
	            System.out.println(i);
	        }

	        for (int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }

	        for (int i = 1; i < 6; i++) {
	            System.out.println(i);
	        }


	        ArrayList<String> cars = new ArrayList<String>();

	        cars.add("Renault");
	        cars.add("Citroen");
	        cars.add("Ferrari");
	        cars.add("Aston Martin");
	        cars.add("Ford");

	        System.out.println("Introduce tu coche:");
	        String coche = sc.nextLine();

	        cars.add(coche);


	        //Y si el array tiene 5 millones de elementos//
	        System.out.println(cars.get(0));
	        System.out.println(cars.get(1));
	        System.out.println(cars.get(2));
	        System.out.println(cars.get(3));
	        System.out.println(cars.get(4));
	        System.out.println(cars.size());
	        System.out.println(cars.get(cars.size() - 1));


	        cars.remove(0);

	        System.out.println(cars);

	        System.out.println("**Imprimiendo el arraylist***");
	        //int size = cars.size();

	        //Para recorrer un array es importante que el �ndice empiece por 0
	        for (byte i = 0; i < cars.size(); i++) {
	               System.out.println(cars.get(i));
	        }

	        System.out.println(cars);


	    }

	}
