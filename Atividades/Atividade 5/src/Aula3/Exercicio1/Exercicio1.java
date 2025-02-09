package Aula3.Exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
	  private static Produto p = new Produto();
	  private static Scanner Scan = new Scanner(System.in);
	  private static String ativo;

	public static void main(String[] args) { 
		try {
			lerCodigo();
			lerDescricao();
			lerPreco();
			lerAtivo();
		} finally {
			System.out.println("Fechando Programa \n");
			Scan.close();
		}
		
		System.out.println("Codigo: " + p.getcodigo());
		System.out.println("Descri��o: " + p.getdescricao());
		System.out.println("Pre�o: " + p.getpreco());
		if (p.getativo() == true)
		System.out.println("Ativo: Sim");
		else
		System.out.println("Ativo: N�o");

	}
	
	    private static void lerCodigo() {
	    	System.out.println("Digite o Codigo: ");
	    	try {
	    	p.setcodigo(Scan.nextInt());
	        Scan.nextLine();
	    	} catch (InputMismatchException N) {
	    		System.out.println("A Opera��o retornou o seguinte Erro: ");
	    		System.out.println("InputMismatchException");
	    		System.out.println("Informe Somente Numeros Inteiros");
	    		Scan.nextLine();
	    		lerCodigo();
	    	}
		}
	    
	    private static void lerDescricao() {
	    	System.out.println("Digite a Descri��o: ");
	    		p.setdescricao(Scan.nextLine());
	    }
	    
	    private static void lerPreco() {
	    	System.out.println("Digite o Preco: ");
	    	try {
	    		p.setpreco(Scan.nextDouble());
	  	        Scan.nextLine();
	    	} catch (InputMismatchException N) {
	    		System.out.println("A Opera��o retornou o seguinte Erro: ");
	    		System.out.println("InputMismatchException");
	    		System.out.println("Informe Somente Numeros");
	    		Scan.nextLine();
	    		lerPreco();
	    	}
	    }
	    
	    private static void lerAtivo() {
	    	System.out.println("O Produto esta Ativo?: ");
	    		ativo = Scan.nextLine();
	    		if(ativo.equals("sim")) {
	    			p.setativo(true);
	    		}
	    		else if (ativo.equals("n�o")) {
	    			p.setativo(false);
	    		}
	    		else {
	    			System.out.println("Informe Somente as Palavras \"sim\" ou \"n�o\"");
		    		lerAtivo();
	            } 
	    }
}