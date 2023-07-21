package EjemploMenu2;

import java.util.Scanner;

public class EjemploMenu2 {

	private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		            
		            int opcio;
		 
		            do {
		                mostrarMenu();
		                opcio = scanner.nextInt();
		 
		                switch (opcio) {
		                    case 1:
		                        boolean experiencia = demanarExperiencia();
		                        String materialTaula = calcularMaterialTaula(experiencia);
		                        System.out.println("Material de la taula: " + materialTaula);
		                        break;
		                    case 2:
		                        float alçadaOnada = demanarAlçadaOnada();
		                        String forecast = imprimirForecast(alçadaOnada);
		                        System.out.println("Forecast: " + forecast);
		                        break;
		                    case 3:
		                        int minutsReserva = demanarMinutsReserva();
		                        String tipusTaula = demanarTipusTaula();
		                        float costReserva = calcularCostReserva(minutsReserva, tipusTaula);
		                        System.out.println("Cost de la reserva: " + costReserva + " €");
		                        break;
		                    case 4:
		                        System.out.println("Gràcies per utilitzar el programa. Fins aviat!");
		                        break;
		                    default:
		                        System.out.println("Opció invàlida. Torna a intentar-ho.");
		                        break;
		                }
		            } while (opcio != 4);
		 
		            scanner.close();
		        }
		 
		        public static void mostrarMenu() {
		            System.out.println("**************");
		            System.out.println("Menú Principal");
		            System.out.println("**************");
		            System.out.println("1. Calcular material de taula");
		            System.out.println("2. Imprimir forecast");
		            System.out.println("3. Calcular cost per reserva");
		            System.out.println("4. Sortir del programa");
		            System.out.println("**************");
		            System.out.print("Selecciona una opció: ");
		        }
		 
		        public static boolean demanarExperiencia() {
		            System.out.print("Tens experiència en surf? (Sí/No): ");
		            String resposta = scanner.next();
		            return resposta.equalsIgnoreCase("Sí");
		        }
		 
		        public static String calcularMaterialTaula(boolean experiencia) {
		            return experiencia ? "taula de fibra" : "taula d'espuma";
		         
		        }
		 
		        public static float demanarAlçadaOnada() {
		            System.out.print("Introdueix l'alçada de l'onada (en metres): ");
		            return scanner.nextFloat();
		        }
		 
		        public static String imprimirForecast(float alçadaOnada) {
		            return alçadaOnada > 2.0f ? "onades grans" : "onades petites";
		        }
		 
		        public static int demanarMinutsReserva() {
		            System.out.print("Introdueix els minuts de reserva: ");
		            return scanner.nextInt();
		        }
		 
		        public static String demanarTipusTaula() {
		            System.out.print("Introdueix el tipus de taula (Iniciació/Intermig): ");
		            return scanner.next();
		        }
		 
		        public static float calcularCostReserva(int minutsReserva, String tipusTaula) {
		            float costPerHora;
		 
		            if (tipusTaula.equalsIgnoreCase("Iniciació")) {
		                costPerHora = 20.0f;
		            } else if (tipusTaula.equalsIgnoreCase("Intermig")) {
		                costPerHora = 35.0f;
		            } else {
		                return 0.0f;
		            }
		 
		            float hores = minutsReserva / 60.0f;
		            return costPerHora * hores;
		        }
		 
		}
