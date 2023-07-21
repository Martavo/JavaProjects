package M7_3_Exercici6;
import java.util.ArrayList;
import java.util.HashSet;
public class M7_3_Exercici6 {

	public static void main(String[] args) {
		 ArrayList<Integer> numeros = new ArrayList<>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(2);
	        numeros.add(4);
	        numeros.add(1);
	        numeros.add(5);

	        System.out.println("Lista original: " + numeros);

	        //Versió Array HashSet
	        
	   /*HashSet <Integer> numerosUnicos = new HashSet<>();
	        
	   int numerosEliminados=0;
	   int i = 0;
	
	   for (int =0; i<numeros.size(); i++) {
		   //devuelve true si el número ya existe en el hashset
		   if (!numerosUnicos.add(numeros.get(i))) { //el add siempre será como un booleano porque lo hace o no, entonces con la ! quiere decir que si no lo hace, lo mete en esa variable
			   numerosEliminados++;
	   		}
	   }
	        
	   System.out.println("Lista sin duplicados: " + numerosUnicos);
       System.out.println("Numeros borrados: " + numerosEliminados); */    
	        
	        
	   //Método2
      
	   HashSet<Integer> numerosHashSet= new HashSet <>(numeros);
       
       System.out.println("\nNúmeros únicos: " + numerosHashSet);
       System.out.println("Tamaño del arraylist: " + numeros.size());
       System.out.println("Tamaño únicos: " + numerosHashSet.size());
       System.out.println("Números eliminados: " + (numeros.size() - numerosHashSet.size())); 
       
       
       
       
       //Método3
	        
	        /*ArrayList<Integer> numerosUnics = new ArrayList<>();
	        int numerosBorrados = 0;

	        for (Integer num : numeros) {
	            if (!numerosUnics.contains(num)) {
	                numerosUnics.add(num);
	            } else {
	                numerosBorrados++;
	            }
	        }

	        System.out.println("Lista sin duplicados: " + numerosUnics);
	        System.out.println("Numeros borrados: " + numerosBorrados);*/
	        
	        
	        
	    }
	}