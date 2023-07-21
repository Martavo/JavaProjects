package M3_EjemplosClase;

public class IfAfinidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "";
		
		boolean nevando = false;
		
		byte temperatura =28;
		
		if (temperatura > 15) {
			if (temperatura > 25) {
				mensaje = "A la playa!!";
			} else {
				mensaje = "A la montaña";
			}
		}else if (temperatura < 5) {
			if (nevando) {
				mensaje = "A esquiar";
			}
		}else {
			mensaje = "A descansar....zZz";
		}
		System.out.println(mensaje);
	}

}
