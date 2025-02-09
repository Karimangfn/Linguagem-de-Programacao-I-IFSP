package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		 Scanner Scan = new Scanner (System.in);
		 int opcao;
		 Lista l = new Lista();
		 String elemento; 
		 int posicao;
		 
		 do {
		 System.out.println("\nOpções:");
		 System.out.println("0 - Sair do Programa");
		 System.out.println("1 - Inserir Produto");
		 System.out.println("2 - Inserir produto em posição específica");
		 System.out.println("3 - Consultar produto (pelo nome)");
		 System.out.println("4 - Consultar produto (pela posição)");
		 System.out.println("5 - Substituir produto");
		 System.out.println("6 - Remover produto (pelo nome)");
		 System.out.println("7 - Remover produto (pela posição) ");
		 System.out.print("Digite sua opção: ");
		 opcao = Scan.nextInt();
		 
		 switch (opcao) {
		 case 1:
			 System.out.println("Digite o Nome do Produto: ");
			 elemento = Scan.next();
			 l.InserirProduto(elemento);
			 System.out.println("Produto Inserido com Sucesso");
		 break;
		 	
		 case 2:
			 System.out.println("Digite o Nome do Produto: ");
			 Scan.nextLine();
			 elemento = Scan.nextLine();
			 System.out.println("Digite a posição do Produto: ");
			 posicao = Scan.nextInt();
			 l.InserirProdutoPosicaoEspecifica(posicao, elemento);
			 System.out.println("Produto Inserido com Sucesso");
		 break;
		 
		 case 3:
			 System.out.println("Digite o Nome do Produto para Consulta: ");
			 Scan.nextLine();
			 elemento = Scan.nextLine();
			 l.ConsultarProdutoNome(elemento);
			 if (l.ConsultarProdutoNome(elemento) == true) {
				 System.out.println("O Produto Consultado Existe!");
			 }
			 else {
				 System.out.println("O Produto Consultado Não Existe!");
			 }
		 break;
			 
		 case 4:
			 System.out.println("Digite a Posição do Produto para Consulta: ");
			 posicao = Scan.nextInt();
			 System.out.println("Produto da Posição " + posicao + ": " + l.ConsultarProdutoPosicao(posicao));
		 break;
	     
		 case 5:
			 System.out.println("Digite a Posição do Produto Que Voce Quer Substituir: ");
			 posicao = Scan.nextInt();
			 System.out.println("Digite o Nome do Produto que Voce Quer Substituir: ");
			 Scan.nextLine();
			 elemento = Scan.nextLine();
			 l.SubstituirProduto(posicao, elemento);
			 System.out.println("Produto Substituido com Sucesso!");
		 break;
		 
		 case 6:
			 System.out.println("Digite o Nome do Produto que voce quer Remover: ");
			 Scan.nextLine();
			 elemento = Scan.nextLine();
			 l.RemoverProdutoNome(elemento);
		 break;
		 
		 case 7:
			 System.out.println("Digite a Posicao do Produto que voce quer Remover");
			 posicao = Scan.nextInt();
			 l.RemoverProdutoPosicao(posicao);
		 break;
		 
		 default:
		 if (opcao != 0)
			System.out.println("Opção inválida");
		 else
			System.out.println("Finalizando Programa");
	     break;
		 }
		 
		} while (opcao != 0);
		
		 Scan.close();
	}

}

