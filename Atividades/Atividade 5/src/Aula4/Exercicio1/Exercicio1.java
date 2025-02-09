package Aula4.Exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
	private static Scanner Scan = new Scanner (System.in);
	private static int opcao;
	private static Pesquisa p = new Pesquisa();

	public static void main(String[] args) {
	    try {
	    	try {
	    	menu();
	    	} catch (IllegalArgumentException e) {
	    		System.out.println("A Operação retornou o seguinte Erro: ");
		    	System.out.println("IllegalArgumentException");
	    	    System.out.println(e.getMessage());
	    	    menu();
	    	    Scan.nextLine();
	    	}
	    } finally {
	    	System.out.println("Finalizando Programa");
			Scan.close();
	    }
	}
	
	private static void menu() {
		System.out.println("\nOpções");
		System.out.println("0 - Sair");
		System.out.println("1 - Informar texto");
		System.out.println("2 - Buscar String");
		System.out.println("3 - Buscar String no Inicio");
		System.out.println("4 - Buscar String no Fim");
		System.out.print("Digite sua opção: ");
		try {
		opcao = Scan.nextInt();
		Scan.nextLine();
		} catch (InputMismatchException N) {
			System.out.println("A Operação retornou o seguinte Erro: ");
	    	System.out.println("InputMismatchException");
	    	System.out.println("Informe Somente os Numeros 0, 1, 2, 3 ou 4");
	    	Scan.nextLine();
	    	menu();
		}
		if (opcao == 1) {
			informarTexto();
			menu();
		}
		else if (opcao == 2) {
			buscarString();
			menu();
		}
		else if (opcao == 3) {
			buscarStringInicio();
			menu();
		}
		else if (opcao == 4) {
			buscarStringFim();
			menu();
		}
		else if (opcao != 0) {
			throw new IllegalArgumentException("Informe Somente os Numeros 0, 1, 2, 3 ou 4");
		}
	}
	private static void informarTexto() {
		System.out.print("Digite o texto: ");
		p.setTexto(Scan.nextLine());
		System.out.println("Texto Inserido com Sucesso!");
	}
	
	private static void buscarString() {
		System.out.print("Digite a String: ");
		try {
		if (p.BuscarString(Scan.nextLine()) == true) {
			System.out.println("String encontrada!");
		}
		else {
			System.out.println("String não encontrada!");
		}
		} catch (NullPointerException N1) {
			System.out.println("A Operação retornou o seguinte Erro: ");
	    	System.out.println("NullPointerException");
	    	System.out.println("Informe Um Texto na Opção Numero 1!");
		}
	}
	
	private static void buscarStringInicio() {
		System.out.print("Digite a String: ");
		p = new PesquisaInicio();
		try {
		if (p.BuscarString(Scan.nextLine()) == true) {
			System.out.println("String encontrada!");
		}
		else {
			System.out.println("String não encontrada!");
		}
		} catch (NullPointerException N1) {
			System.out.println("A Operação retornou o seguinte Erro: ");
	    	System.out.println("NullPointerException");
	    	System.out.println("Informe Um Texto na Opção Numero 1!");
		}
	}
	
	private static void buscarStringFim() {
		System.out.print("Digite a String: ");
		p = new PesquisaFim();
		try {
		if (p.BuscarString(Scan.nextLine()) == true) {
			System.out.println("String encontrada!");
		}
		else {
			System.out.println("String não encontrada!");
		}
		} catch (NullPointerException N1) {
			System.out.println("A Operação retornou o seguinte Erro: ");
	    	System.out.println("NullPointerException");
	    	System.out.println("Informe Um Texto na Opção Numero 1!");
		}
	}

}