package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PacienteModel;

public class PacienteController {
	
	public void create() {
		//BLOCO de Declaração de Variáveis
		PacienteModel pacienteModel = new PacienteModel();
		
		//BLOCO - Entradada de dados
		pacienteModel.setFirstName(JOptionPane.showInputDialog(null, "Digite o Primeiro nome:"));
		pacienteModel.setExame(JOptionPane.showInputDialog(null, "Você precisa do seguinte exame:"));
		//BLOCO - Saída de dados
		pacienteModel.tipoPeople();
		JOptionPane.showMessageDialog(null, pacienteModel);
	}
}
