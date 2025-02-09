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
		 System.out.println("1 - Calcular Area do Retangulo ");
		 System.out.println("2 - Calcular Area do Circulo");
		 System.out.print("Digite sua opção: ");
		 opcao = Scan.nextInt();
		 
		 switch (opcao) {
		 case 1:
			 System.out.println("Digite a Base do Retangulo: ");
			 r.setBase(Scan.nextInt());
			 System.out.println("Digite a Altura do Retangulo: ");
			 r.setAltura(Scan.nextInt());
			 System.out.println("Digite uma Cor para o Retangulo: ");
			 r.setCor(Scan.next());
			 System.out.printf("Area: %.0f " , r.calcularArea());
			 System.out.println("\nCor: " + r.getCor());
	     break;
	     
		 case 2:
			 System.out.println("Digite o Raio do Circulo: ");
			 c.setRaio(Scan.nextDouble());
			 System.out.println("Digite uma Cor para o Circulo: ");
			 c.setCor(Scan.next());
			 System.out.println("Area: " + c.calcularArea() );
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
