package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	    Scanner Scan = new Scanner (System.in);
	    
		int opcao;
		Pesquisa p = new Pesquisa();
		
		do {
	    System.out.println("\nOpções");
		System.out.println("0 - Sair");
		System.out.println("1 - Informar texto");
		System.out.println("2 - Buscar String");
		System.out.println("3 - Buscar String no Inicio");
		System.out.println("4 - Buscar String no Fim");
		System.out.print("Digite sua opção: ");
		opcao = Scan.nextInt();
		Scan.nextLine();
		if (opcao == 1) {
			System.out.print("Digite o texto: ");
			p.setTexto(Scan.nextLine());
		}
		else if (opcao == 2) {
			if (p.getTexto() == null) {
				System.out.println("Nenhuma texto foi digitado");
			}
			else {
			System.out.print("Digite a String: ");
			if (p.BuscarString(Scan.nextLine()) == true) {
				System.out.println("String encontrada!");
			}
			else {
				System.out.println("String não encontrada!");
			}
			}
		}
		else if (opcao == 3) {
			if (p.getTexto() == null) {
				System.out.println("Nenhum texto foi digitado");
			}
			else {
			System.out.print("Digite a String: ");
			p = new PesquisaInicio();
			if (p.BuscarString(Scan.nextLine()) == true) {
				System.out.println("String encontrada!");
			}
			else {
				System.out.println("String não encontrada!");
			}
			}
		}
		else if (opcao == 4) {
			if (p.getTexto() == null) {
				System.out.println("Nenhum texto foi digitado");
			}
			else {
			System.out.print("Digite a String: ");
			p = new PesquisaFim();
			if (p.BuscarString(Scan.nextLine()) == true) {
				System.out.println("String encontrada!");
			}
			else {
				System.out.println("String não encontrada!");
			}
			}
		}
		else if (opcao == 0) {
			System.out.println("Finalizando Programa");
		}
		else {
			System.out.println("Opcao Invalida");
		}
		
		} while (opcao != 0);
		Scan.close();
	}

}
