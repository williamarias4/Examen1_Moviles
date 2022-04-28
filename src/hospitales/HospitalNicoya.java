package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalNicoya extends OMS{//HERENCIA

	//UTILIZA CONSTRUCTOR DE SUPER CLASE
	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
	}

	//SOBREESCRITURA DE METODO
	@Override
	protected boolean isGamHospital() {
		return false;
	}

	//SOBREESCRITURA DE METODO
	@Override
	public Hospital getNombreHospital() {
		return Hospital.Nicoya;
	}

}
