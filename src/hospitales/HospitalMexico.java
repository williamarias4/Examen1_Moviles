package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalMexico extends OMS{//HERENCIA

	//UTILIZA CONSTRUCTOR DE SUPER CLASE
	public HospitalMexico(List<Paciente> pacientes) {
		super(pacientes);
	}
	
	//SOBREESCRITURA DE METODO
	@Override
	protected boolean isGamHospital() {
		return true;
	}

	//SOBREESCRITURA DE METODO
	@Override
	public Hospital getNombreHospital() {
		return Hospital.Mexico;
	}
	
}
