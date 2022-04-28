package tipo_pruebas;

import pacientes.Paciente;
//ALTA COHESION, DISE:ADA CON RESPONSABILIDAD UNICA
public final class PruebaPCR implements PruebaCovid19 {//IMPLEMENTA INTERFAZ

	private Paciente paciente;//COMPOSICION

	//INYECCION DE DEPENDENCIA, AUNQUE PACIENTE SOLO TENGA UN TIPO
	public PruebaPCR(Paciente paciente) {
		this.paciente = paciente;
	}

	//SOBREESCRITURA
	@Override
	public boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 39 && paciente.isVomito() == true) {
			return true;
		}
		return false;
	}

	//SOBREESCRITURA
	@Override
	public String getNombrePaciente() {
		return paciente.getNombre();
	}

}
