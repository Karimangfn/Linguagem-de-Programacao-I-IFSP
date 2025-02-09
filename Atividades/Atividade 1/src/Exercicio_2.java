package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Digite o Valor do Produto: R$");
		float N = Scan.nextFloat();
		
		System.out.print("Digite a Quantidade de Desconto: ");
		float N2 = Scan.nextFloat();
				
		float Valor = N - (N*(N2/100));
		
		System.out.printf("\nValor do Produto com Desconto: R$%.2f", Valor);
	}

}
