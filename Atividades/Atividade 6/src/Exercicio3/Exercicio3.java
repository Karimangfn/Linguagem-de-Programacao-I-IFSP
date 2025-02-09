package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int opcao;
		String produto1;
		String produto2;
		int quantidade;
		int contador;
		Conjunto c = new Conjunto();
		
		do {
			 System.out.println("\nOp��es:");
			 System.out.println("0 - Sair do Programa");
			 System.out.println("1 - Inserir produtos no 1� conjunto");
			 System.out.println("2 - Inserir produtos no 2� conjunto");
			 System.out.println("3 - Consultar todos produtos dos dois conjuntos");
			 System.out.println("4 - Consultar apenas produtos em comum nos dois conjuntos");
			 System.out.println("5 - Consultar produtos do 1� conjunto que n�o existem no 2� conjunto");
			 System.out.println("6 - Consultar se o 1� conjunto est� contido no 2� conjunto");
			 System.out.print("Digite sua op��o: ");
			 opcao = Scan.nextInt();
			 
			 switch (opcao) {
			 case 1:
				System.out.println("Digite Produtos voce quer inserir: ");
				quantidade = Scan.nextInt();
				for (contador = 1; contador <= quantidade; contador++) {
					System.out.println("Digite o Nome do Produto N" + contador + ":");
					produto1 = Scan.next();
					c.InserirProd1(produto1);
				}
				System.out.println("Produto Inserido com Sucesso");
			 break;
			 	
			 case 2:
				 System.out.println("Digite Produtos voce quer inserir: ");
				 quantidade = Scan.nextInt();
				 for (contador = 1; contador <= quantidade; contador++) {
					System.out.println("Digite o Nome do Produto N" + contador + ":");
					produto2 = Scan.next();
					c.InserirProd2(produto2);
					}
				 System.out.println("Produto Inserido com Sucesso");
			 break;
			 
			 case 3:
				System.out.println("Uni�o entre o 1� Conjunto e o 2� Conjunto de Produtos: " + c.Consultar2Conj());
			 break;
			 
			 case 4:
				 System.out.println("Intersecc��o entre o 1� Conjunto e o 2� Conjunto de Produtos: " + c.ConsultarComum());
			 break;
			 
			 case 5:
				 System.out.println("Diferen�a entre o 1� Conjunto e o 2� Conjunto de Produtos: " + c.Consultar1NExisteNo2());
			 break;
			 
			 case 6:
				if (c.Consultar() == true) {
				  System.out.println("O 1� Conjunto de Produtos est� Contido no 2� Conjunto de Produtos");
				}
				else {
					System.out.println("O 1� Conjunto de Produtos N�o est� Contido no 2� Conjunto de Produtos");
				}
			 break;
		
			 default:
			 if (opcao != 0)
				System.out.println("Op��o inv�lida");
			 else
				System.out.println("Finalizando Programa");
		     break;
			 }
			 
			 }while (opcao != 0);
			
			 Scan.close();
	}
}

