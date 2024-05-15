package br.tec.abrindoportas.controller;

import br.tec.abrindoportas.model.PeopleModel;

public class PeopleController {

	public void createPerson() {

		PeopleModel person = new PeopleModel();

		person.setFirstName("Edir");
		person.setLastName("Santos");
		person.setCpf("78965412369");
		person.setEndereco("Quadra 1005 Sul");
		person.setIdade(38);
		person.setCidade("Palmas");
		person.setSalario(4500.0);

		System.out.println("Nome: " + person.getFirstName() 
							+ "\nSobre Nome: " + person.getLastName()
							+ "\nCPF: " + person.getCpf()
							+ "\nEndereço: " + person.getEndereco()
							+ "\nIdade: " + person.getIdade()
							+ "\nCidade: " + person.getCidade()
							+ "\nSalario: " + person.getSalario());

	}

}
