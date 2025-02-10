import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		System.out.print("Digite a Distancia da sua Viagem(Km): ");
		Scanner Scan = new Scanner(System.in);
		float N = Scan.nextFloat();
		
		System.out.print("Digite o Preço do Combustivel: R$");
		float N1 = Scan.nextFloat();
		
		System.out.print("Digite o Consumo de Combustivel(Km/Litro): ");
		float N2 = Scan.nextFloat();
		
		float Total = N * (N1/N2);
		
		System.out.printf("Valor a ser Gasto na Viagem: R$%.2f", Total);
	}

}
