package br.tec.abrindoportas.principal;

import br.tec.abrindoportas.controller.Funcoes;
import br.tec.abrindoportas.controller.PacienteController;
import br.tec.abrindoportas.controller.PeopleController;
import br.tec.abrindoportas.controller.VideoLocadora;
import br.tec.abrindoportas.model.PeopleModel;

public class Principal {

	public static void main(String[] args) {
		
		//Instância da classe Funções
//		PeopleController peopleController = new PeopleController();
//		peopleController.createPerson();
	
		PacienteController pacienteController = new PacienteController();
		pacienteController.create();
		
		
	}
}
