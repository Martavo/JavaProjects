package M7_2_Exercici4;
import java.util.ArrayList;
public class M7_2_Exercici4 {

	public static void main(String[] args) {
		 ArrayList<Integer> lista1 = new ArrayList<>();
	        lista1.add(3);
	        lista1.add(5);
	        lista1.add(6);
	        lista1.add(8);
	        lista1.add(10);
	        
	        System.out.println(crearLista(lista1));

	    }

	    public static ArrayList<Integer> crearLista(ArrayList<Integer> lista1) {
	        ArrayList<Integer> lista2 = new ArrayList<>();
	        
	        int size = lista1.size();

	        for (int i = size - 1; i >= 0; i--) {
	            lista2.add(lista1.get(i));
	        }

	        return lista2;
	    }
}
