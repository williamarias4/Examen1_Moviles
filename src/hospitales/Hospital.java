package hospitales;

public enum Hospital {//COHESION, CLASE FUE DISE:ADA CON RESPONSABILIDAD UNICA
	Nicoya("Hospital de Nicoya"), Mexico("Hospital de Mexico");

	
	private String tipo;

	private Hospital(String tipo) {
		this.tipo = tipo;
	}

	//ENCAPSULAMIENTO
	public String getTipo() {
		return tipo;
	}
}
 