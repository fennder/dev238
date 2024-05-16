package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PeopleModel;

public class PeopleController {

	/*
	 * MVC - Controller
	 * CRUD - Create
	 */
	public void createPerson() {
		PeopleModel peopleModel = new PeopleModel();
		
		peopleModel.setFirstName(JOptionPane.showInputDialog(null, "Digite o Primeiro Nome: "));
		peopleModel.setLastName(JOptionPane.showInputDialog(null, "Digite o Sobre Nome: "));
		peopleModel.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
		peopleModel.setEndereco(JOptionPane.showInputDialog(null, "Digite o Endereço: "));
		
		peopleModel.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Idade: ")));
		
		peopleModel.setCidade(JOptionPane.showInputDialog(null, "Digite o primeiro nome: "));
		peopleModel.setSalario(JOptionPane.showInputDialog(null, "Digite o Salário: "));
		
		JOptionPane.showMessageDialog(null, peopleModel);

//		System.out.println(peopleModel.toString());
//
//		System.out.println("Nome: " + peopleModel.getFirstName() 
//					+ "\nSobre Nome: " + peopleModel.getLastName()
//					+ "\nCPF: " + peopleModel.getCpf()
//					+ "\nEndereço: " + peopleModel.getEndereco()
//					+ "\nIdade: " + peopleModel.getIdade()
//					+ "\nCidade: " + peopleModel.getCidade()
//					+ "\nSalario: " + peopleModel.getSalario());

	}

}
