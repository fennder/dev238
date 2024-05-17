package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PacienteModel;

public class PacienteController {
	public void create() {
		PacienteModel pacienteModel = new PacienteModel();
		pacienteModel.setFirstName(JOptionPane.showInputDialog(null, "Digite o Primeiro Nome:"));
		
		pacienteModel.tipoPeople();
	}
}
