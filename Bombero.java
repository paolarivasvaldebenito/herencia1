//Ejercicio Get y Set Define una clase Bombero considerando los siguientes atributos de clase: 
//nombre (String), apellidos (String), edad (int), casado (boolean), especialista (boolean). 
//Define un constructor que reciba los parámetros necesarios para la inicialización y los métodos para poder establecer 
//y obtener los valores de los atributos. 
//Compila el código para comprobar que no presenta errores, 
//crea un objeto y comprueba que se inicializa correctamente consultando el valor de sus atributos después de haber creado el objeto.


package TareaHerencia;

public class Bombero {

	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	
	public Bombero() {
		super();
	}


	public Bombero(String nombre, String apellido, int edad, boolean casado, boolean especialista) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.casado = casado;
		this.especialista = especialista;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	public boolean isEspecialista() {
		return especialista;
	}


	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}

// 
	@Override
	public String toString() {
		return "Bombero [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado=" + casado
				+ ", especialista=" + especialista + "]";
	}
	
	

	
}
