package br.tec.abrindoportas.model;

public class MedicoModel {

	private String horario;
	private String especialidade;
	
	public MedicoModel() {
		super();
	}

	public MedicoModel(String horario, String especialidade) {
		super();
		this.horario = horario;
		this.especialidade = especialidade;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void tipoPeople() {
		System.out.println("É uma pessoa formada em medicina.");
	}
	
	@Override
	public String toString() {
		return "MedicoModel [horario=" + horario 
				+ ", especialidade=" + especialidade + "]";
	}
	
}
