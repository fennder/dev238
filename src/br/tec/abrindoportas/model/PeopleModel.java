package br.tec.abrindoportas.model;
/*
 * MVC - Model
 */
public class PeopleModel {
	
	 String firstName;
	 String lastName;
	 String cpf;
	 int idade;
	 String endereco;
	 String cidade;
	 double salario;
	
	public PeopleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeopleModel(String firstName, String lastName, String cpf, int idade, String endereco, String cidade, double salario) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.cidade = cidade;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void imprimeInfo() {
		System.out.println("Nome: " + this.firstName);
	}
	
	@Override
	public String toString() {
		return "People [firstName=" + firstName 
					+ ", lastName=" + lastName 
					+ ", cpf=" + cpf 
					+ ", idade=" + idade
					+ ", endereco=" + endereco 
					+ ", cidade=" + cidade 
					+ ", salario=" + salario + "]";
	}
		
}
