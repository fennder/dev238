package br.tec.abrindoportas.model;

public class AlunoModel extends PeopleModel{

	private String matricula;
	
	public AlunoModel(String matricula, String firstName, String lastName, String cpf, int idade, String endereco, String cidade, double salario) {
		super(firstName, lastName, cpf, idade, endereco, cidade, salario);
		this.matricula = matricula;
	}
}
