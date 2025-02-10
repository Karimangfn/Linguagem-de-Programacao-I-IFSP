package br.edu.ifsp.model.funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioValidacao {
	private static List<String> errosValidacao; // List para armazenar as mensagens de erro de validação.
	
	// Valida os dados informados conforme as regras abaixo.
	public static List<String> validaFuncionario(Funcionario funcionario){
		errosValidacao = new ArrayList<>();
		
		// Validação do campo Nome (Tamanho)
		if (!funcionario.getNome().equals("")) {
			if (funcionario.getNome().length() < 5 || funcionario.getNome().length() > 100)
				errosValidacao.add("* O Nome deve ter entre 5 e 100 caracteres.");
		} else {
			errosValidacao.add("* O Nome não foi informado.");
		}
		
		// Validação do campo Nome (O Nome não pode conter Números)
		if (!funcionario.getNome().equals("")) {
			for (int i = 0; i < funcionario.getNome().length(); i++) {
				if (Character.isDigit(funcionario.getNome().charAt(i)) == true) {
					errosValidacao.add("* O Nome não pode conter Números");
					break;
				}
			}
		}
				
		// Validação do campo Nome (O Nome deve começar com letra maiúscula)
		if (!funcionario.getNome().equals("")) {
			if (!funcionario.getNome().substring(0,1).matches("[A-Z]"))
				errosValidacao.add("* O Nome deve Começar com uma Letra Maiúscula");
		}
		
		// Validação do campo Salário
		if (funcionario.getSalario() != null) {
			if (funcionario.getSalario().doubleValue() < 1000 || funcionario.getSalario().doubleValue() > 10000)
				errosValidacao.add("* O Salário deve ser de R$ 1.000,00 a R$ 10.000,00.");
		} else
			errosValidacao.add("* O Salário não foi informado.");
		
		// Validação do campo Cargo (Para o caso de não existirem cargos cadastrados).
		if (funcionario.getCargo() == null)
			errosValidacao.add("* O Cargo não foi informado.");
		
		
		return errosValidacao; // Retorna o ArrayList contendo as mensagens de erro de validação.
	}
}
