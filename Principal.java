package TareaHerencia;



public class Principal {

	public static void main(String[] args) {
		
		Bombero A1= new Bombero("jose", "Cardenas", 38, false, true);
		
System.out.println(A1.getEdad());
//A1.getEdad();

System.out.println(A1.getNombre());
//A1.getNombre()

System.out.println(A1.getApellido());
//A1.getApellido()


System.out.println (A1.isCasado()?"Es casado":"No es casado");

System.out.println (A1.isEspecialista()?"Es especialista":"No es especialista");





	}

	
	
}
