package tipo_pruebas;

import pacientes.Paciente;

public final class PruebaRapida implements PruebaCovid19 {//IMPLEMENTA INTERFAZ

	private Paciente paciente;//COMPOSICION

	//INYECCION DE DEPENDENCIA, AUNQUE PACIENTE SOLO TENGA UN TIPO
	public PruebaRapida(Paciente paciente) {
		this.paciente = paciente;
	}

	//SOBREESCRITURA
	@Override
	public boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 37 && paciente.getEdad() >= 60) {
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
