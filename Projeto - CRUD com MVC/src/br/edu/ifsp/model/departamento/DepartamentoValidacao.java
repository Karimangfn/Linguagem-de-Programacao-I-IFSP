package br.edu.ifsp.model.departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoValidacao {
	private static List<String> errosValidacao;
	
	public static List<String> validaDepartamento(Departamento departamento){
		errosValidacao = new ArrayList<>();
		
		// Validação do campo Departamento (Tamanho)
		if (!departamento.getNomeDepto().equals("")) {
			if (departamento.getNomeDepto().length() < 5 || departamento.getNomeDepto().length() > 100)
				errosValidacao.add("* O Departamento deve ter entre 5 e 100 caracteres.");
		} else {
			errosValidacao.add("* O Departamento não foi informado.");
		}
				
		// Validação do campo Departamento (O Departamento deve começar com uma letra maiúscula)
		if (!departamento.getNomeDepto().equals("")) {
			if (!departamento.getNomeDepto().substring(0,1).matches("[A-Z]"))
				errosValidacao.add("* O Departamento deve Começar com uma Letra Maiúscula");
		}
		  
		// Validação do campo Departamento (O Departamento não deve conter números)
		if (!departamento.getNomeDepto().equals("")) {
			for (int i = 0; i < departamento.getNomeDepto().length(); i++) {
				if (Character.isDigit(departamento.getNomeDepto().charAt(i)) == true) {
					errosValidacao.add("* O Departamento não pode conter Números");
					break;
				}
			}
		}	  
		
		return errosValidacao;
	}
}
