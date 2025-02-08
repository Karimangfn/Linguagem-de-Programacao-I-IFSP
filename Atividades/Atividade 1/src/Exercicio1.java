import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("\nEscolha a Opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Arredondar Numero");
			System.out.println("2 - Calcular Raiz Quadrada");
			System.out.println("3 - Calcular Potencia");
			opcao = Scan.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o Numero: ");
				float N = Scan.nextFloat();
				System.out.println("Numero Arredondado: \n" + Math.round(N));
			}
			else if (opcao == 2) {
				System.out.println("Digite o Numero: ");
				int N2 = Scan.nextInt();
				System.out.println("Raiz Quadrada: " + Math.sqrt(N2));
			}
			else if (opcao == 3) {
				System.out.println("Digite o Numero de Base: ");
				int N3 = Scan.nextInt();
				System.out.println("Digite o Expoente: ");
				int N4 = Scan.nextInt();
				System.out.println("Numero com Potencia: " + Math.pow(N3, N4));
			}
			else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
				System.out.println("Opcao Invalida");
			}
			else {
				System.out.println("Finalizando Programa");
			}
		} while (opcao != 0);

	}

}
