package br.tec.abrindoportas.model;

import javax.swing.JOptionPane;

/*
 * MVC - Model
 */
public class PeopleModel {
	
	 private String firstName;
	 private String lastName;
	 private String cpf;
	 private int idade;
	 private String endereco;
	 private String cidade;
	
	
	public PeopleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeopleModel(String firstName, String lastName, String cpf, int idade, String endereco, String cidade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.cidade = cidade;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void tipoPeople() {
		JOptionPane.showMessageDialog(null, this.firstName + " Você é um tipo de pessoas obesa.");
//		System.out.println();
	}
	
	@Override
	public String toString() {
		return "People [firstName=" + firstName 
					+ ", lastName=" + lastName 
					+ ", cpf=" + cpf 
					+ ", idade=" + idade
					+ ", endereco=" + endereco 
					+ ", cidade=" + cidade + "]";
	}
		
}
