package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PacienteModel;

public class PacienteController {
	
	public void create() {
		//BLOCO de Declaração de Variáveis
		PacienteModel pacienteModel = new PacienteModel();
		
		//BLOCO - Entradada de dados
		pacienteModel.setFirstName(JOptionPane.showInputDialog(null, "Digite o Primeiro nome:maria "));
		pacienteModel.setExame(JOptionPane.showInputDialog(null, "Você precisa do seguinte exame:sim"));
		//BLOCO - Saída de dados
		pacienteModel.tipoPeople();contando maria são mais de 25 paciente com estado grave  
		JOptionPane.showMessageDialog(null, pacienteModel);com covid e dengue
	}
}
