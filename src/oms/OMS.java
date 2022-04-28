package oms;

import java.util.ArrayList;
import java.util.List;

import hospitales.Hospital;
import pacientes.Paciente;
import tipo_pruebas.PruebaCovid19;
import tipo_pruebas.PruebaPCR;
import tipo_pruebas.PruebaRapida;

public abstract class OMS {//patron de diseno template

	List<Paciente> pacientes;
	//PROGRAMAR HACIA INTREFACES ES UTIL AQUI, LA MISMA LISTA SE PUEDE USAR PARA CUALQUIERA DE SUS IMPLEMENTACIONES: PruebaPCR o PruebaRapida
	List<PruebaCovid19> resultadoList;

	//BAJO ACOPLAMIENTO O ACOMPLAMIENTO SUELTO EN LIST, Y PERMITE INJECTAR DEPENDENCIAS AL TIPO DE LISTAS, SE PUEDE MANDAR CUALQUIER TIPO DE LISTA POR PARAM.
	//NO ESTA ATADO A UN SOLO TIPO.
	public OMS(List<Paciente> pacientes) {
		this.pacientes = pacientes;
		//DIAGNOSTICAR ES PRIVADO, SOLO LO PUEDO LLAMAR DENTRO DE SU CLASE
		diagnosticar();
	}

	//PERMITE SOBREESCRITURA PORQUE ES ABSTRACTO
	protected abstract boolean isGamHospital();

	//PERMITE SOBREESCRITURA PORQUE ES ABSTRACTO
	public abstract Hospital getNombreHospital();

	private void diagnosticar() {
		resultadoList = new ArrayList<>();

		if (isGamHospital()) {
			for (Paciente paciente : pacientes) {
				resultadoList.add(new PruebaPCR(paciente));
			}
		} else if (isGamHospital() == false) {
			for (Paciente paciente : pacientes) {
				resultadoList.add(new PruebaRapida(paciente));
			}
		}

	}

	//NO PERMITE SOBREESCRITURA POR FINAL
	public final void imprimirReporte() {
		System.out.println(getNombreHospital().getTipo()); 

		for (PruebaCovid19 resultado : resultadoList) {
			System.out.println(resultado.getNombrePaciente());

			if (resultado.isPositiveCase()) {
				System.out.println("El caso es positivo");
				
			} else if (resultado.isPositiveCase() == false) {
				System.out.println("El caso es negativo");
			}
		}
	}
}
