package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	

	public static void main(String[] args) { //Comentar tudo = Ctrl + 7
		Produto p = new Produto();
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Digite o codigo: ");
		p.setcodigo(Scan.nextInt());
		
		System.out.println("Digite a descricao");
		p.setdescricao(Scan.next());
		
		System.out.println("Digite o preco");
		p.setpreco(Scan.nextFloat());
		
		System.out.println("O Produto esta ativo?: ");
		p.setativo(Scan.nextBoolean());
		
		System.out.println("Codigo: " + p.getcodigo());
		
		System.out.println("Descrição: " + p.getdescricao());
		
		System.out.println("Preço: " + p.getpreco());
		
		System.out.println("Ativo: " + p.getativo());
		
		Scan.close();
	}

}