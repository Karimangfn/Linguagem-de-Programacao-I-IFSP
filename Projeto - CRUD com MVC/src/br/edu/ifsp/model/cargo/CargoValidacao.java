package br.edu.ifsp.model.cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoValidacao {
	private static List<String> errosValidacao;
	
	public static List<String> validaCargo(Cargo cargo){
		errosValidacao = new ArrayList<>();
		
		//Validação do campo Descrição (Tamanho)
		if (!cargo.getDescricao().equals("")) {
			if (cargo.getDescricao().length() < 5 || cargo.getDescricao().length() > 30)
				errosValidacao.add("* O Cargo deve ter entre 5 e 30 caracteres.");
		} else {
			errosValidacao.add("* O Cargo não foi informado.");
		}
		
		//Validação do campo Descrição (A descrição deve começar com uma letra maiúscula)
		if (!cargo.getDescricao().equals("")) {
			if (!cargo.getDescricao().substring(0,1).matches("[A-Z]"))
			errosValidacao.add("* O Cargo deve Começar com uma Letra Maiúscula");
		}
		
		//Validação dos Números (A descrição não pode conter números)
		if (!cargo.getDescricao().equals("")) {
			for (int i = 0; i < cargo.getDescricao().length(); i++) {
				if (Character.isDigit(cargo.getDescricao().charAt(i)) == true) {
				errosValidacao.add("* O Cargo não pode conter Números");
				break;
				}
			}
		}
		
		//Validação do campo Departamento (Para o caso de não existirem departamentos cadastrados)
		if (cargo.getDepartamento() == null)
			errosValidacao.add("* O Departamento não foi informado.");
				
		return errosValidacao;
	}
}
