package pacientes;

public final class Paciente {//NO PUEDE SER HEREDADA POR "FINAL", CLASE INMUTABLE

	//INMUTABILIDAD DE ATRIBUTOS, SON FINAL Y NO TIENEN UN METODO SETTER
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;

	
	public Paciente(String nombre, int edad, int temperatura, boolean vomito) {
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.vomito = vomito;
	}
	
	//ENCAPSULAMIENTO, METODOS PRIVADOS CON SETTERS Y GETTERS

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public boolean isVomito() {
		return vomito;
	}

}
