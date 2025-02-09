package Exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		System.out.print("Digite a Primeira Nota: "); // sysout + control space
		Scanner Scan = new Scanner(System.in);
		float N = Scan.nextFloat();

		System.out.print("Digite a Segunda Nota: ");
		float N2 = Scan.nextFloat();

		float media = (N + N2) / 2;

		System.out.print("\nA M�dia do Aluno �: " + media);
	}

}
