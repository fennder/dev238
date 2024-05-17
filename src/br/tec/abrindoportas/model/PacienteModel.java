package br.tec.abrindoportas.model;

public class PacienteModel extends PeopleModel {

	private String exame;
	private String resultado;
	
	public PacienteModel() {
		super();
	}

	public PacienteModel(String exame, String resultado, String firstName, String lastName, String cpf, int idade, String endereco, String cidade) {
		super(firstName, lastName, cpf, idade, endereco, cidade);
		this.exame = exame;
		this.resultado = resultado;
	
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "PacienteModel [exame=" + exame 
				+ ", resultado=" + resultado + "]";
	}
	
}
