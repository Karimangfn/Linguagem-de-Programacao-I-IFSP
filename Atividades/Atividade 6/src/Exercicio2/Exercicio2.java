package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in);
		int opcao;
		Fila f = new Fila();
		String nome;
		
		do {
			 System.out.println("\nOpções:");
			 System.out.println("0 - Sair do Programa");
			 System.out.println("1 - Inserir Pessoa");
			 System.out.println("2 - Remover Pessoa");
			 System.out.println("3 - Imprimir Fila");
			 System.out.print("Digite sua opção: ");
			 opcao = Scan.nextInt();
			 
			 switch (opcao) {
			 case 1:
				 System.out.println("Digite o Nome da Pessoa: ");
				 Scan.nextLine();
				 nome = Scan.nextLine();
				 f.InserirPessoa(nome);
				 System.out.println("Pessoa Inserida com Sucesso!");
			 break;
			 	
			 case 2:
			     f.RemoverPessoa();
			     System.out.println("Pessoa Removida com Sucesso");
			 break;
			 
			 case 3:
				 System.out.println(f.getFila());
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