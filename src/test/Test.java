package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import hospitales.HospitalMexico;
import hospitales.HospitalNicoya;
import oms.OMS;
import pacientes.Paciente;

public class Test {

	public static void main(String[] args) {
		OMS oms;//Composicion
		List<Paciente> pacientes = new ArrayList<>();//LISTA DE TIPO ARRAY
		List<Paciente> pacientes2 = new LinkedList<>();//LISTA LINKEDLIST
		pacientes.add(new Paciente("William", 23, 39, true));
		pacientes.add(new Paciente("Keylor", 25, 40, true));
		pacientes.add(new Paciente("Kimberly", 24, 39, false));
		pacientes.add(new Paciente("Esteban", 60, 37, false));
		pacientes.add(new Paciente("Maria", 60, 36, false));
		pacientes.add(new Paciente("Juancho", 62, 40, true));
		
		pacientes2.add(new Paciente("William", 23, 39, true));
		pacientes2.add(new Paciente("Keylor", 25, 40, true));
		pacientes2.add(new Paciente("Kimberly", 24, 39, false));
		pacientes2.add(new Paciente("Esteban", 60, 37, false));
		pacientes2.add(new Paciente("Maria", 60, 36, false));
		pacientes2.add(new Paciente("Juancho", 62, 40, true));


		// INYECTANDO UNA INSTANCIA DE ARRAYLIST GRACIAS A POLIMORFISMO
		oms = new HospitalMexico(pacientes);//POLIMORFISMO
		oms.imprimirReporte();

		System.out.println("\n");

		oms = new HospitalNicoya(pacientes);//POLIMORFISMO
		oms.imprimirReporte();
		
		System.out.println("\n");
		

		// INYECTANDO UNA INSTANCIA DE LINKEDLIST GRACIAS A POLIMORFISMO
		oms = new HospitalMexico(pacientes2);//POLIMORFISMO
		oms.imprimirReporte();

		System.out.println("\n");

		oms = new HospitalNicoya(pacientes2);//POLIMORFISMO
		oms.imprimirReporte();

	}

	/*
	 * La “PruebaPCR” da positivo si la temperatura del paciente es igual o mayor a
	 * 39 y el paciente tiene vomito.
	 * 
	 * La “PruebaRapida” da positivo si la temperatura es igual o mayor 37 y el
	 * paciente tiene edad igual o superior a 60 años.
	 */

}
