package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Retangulo r = new Retangulo();
		Circulo c = new Circulo();
		int opcao;
		
		do {
		 System.out.println("\nOpções:");
		 System.out.println("0 - Sair do Programa");
		 System.out.println("1 - Calcular Área do Retângulo");
		 System.out.println("2 - Calcular Área do Círculo");
		 System.out.print("Digite sua opção: ");
		 opcao = Scan.nextInt();
		 
		 switch (opcao) {
		 case 1:
			 System.out.println("Digite a Base do Retângulo: ");
			 r.setBase(Scan.nextInt());
			 System.out.println("Digite a Altura do Retângulo: ");
			 r.setAltura(Scan.nextInt());
			 System.out.println("Digite uma Cor para o Retângulo: ");
			 r.setCor(Scan.next());
			 System.out.printf("Área: %.0f", r.calcularArea());
			 System.out.println("\nCor: " + r.getCor());
	     break;
	     
		 case 2:
			 System.out.println("Digite o Raio do Círculo: ");
			 c.setRaio(Scan.nextDouble());
			 System.out.println("Digite uma Cor para o Círculo: ");
			 c.setCor(Scan.next());
			 System.out.println("Área: " + c.calcularArea());
			 System.out.println("Cor: " + c.getCor());
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
