package br.tec.abrindoportas.model;

public class AlunoModel extends PeopleModel{

	private String matricula;
	
	public AlunoModel(String matricula, String firstName, String lastName, String cpf, int idade, String endereco, String cidade) {
		super(firstName, lastName, cpf, idade, endereco, cidade);
		this.matricula = matricula;
	}
}
