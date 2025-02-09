import java.util.Calendar;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		Calendar Cal = Calendar.getInstance();
		
		int opcao;
		int Dia;
		int Mes;
		int Ano;
		
		System.out.println("Escolha uma Data: ");
		System.out.print("Dia: ");
		Dia = Scan.nextInt();
		System.out.print("Mes: ");
		Mes = Scan.nextInt();
		System.out.print("Ano: ");
		Ano = Scan.nextInt();
		Cal.set(Ano, Mes, Dia);
		
		do {
		System.out.println("\nEscolha uma Opção");
		System.out.println("0 - Sair");
		System.out.println("1 - Adicionar Dias");
		System.out.println("2 - Adicionar Meses");
		System.out.println("3 - Adicionar Anos");
		System.out.println("4 - Subtrair Dias");
		System.out.println("5 - Subtrair Meses");
		System.out.println("6 - Substrair Anos");
		opcao = Scan.nextInt();
		
		if (opcao == 1) {
			System.out.println("Digite Quantos Dias quer adicionar: ");
			int N = Scan.nextInt();
			Cal.set(Calendar.DAY_OF_MONTH, Cal.get(Calendar.DAY_OF_MONTH) + N);
		    System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
		else if (opcao == 2) {
			System.out.println("Digite Quantos Meses quer adicionar: ");
			int N2 = Scan.nextInt();
			Cal.set(Calendar.MONTH, Cal.get(Calendar.MONTH) + N2);
			System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
        else if (opcao == 3) {
        	System.out.println("Digite Quantos Anos quer adicionar: ");
        	int N3 = Scan.nextInt();
        	Cal.set(Calendar.YEAR, Cal.get(Calendar.YEAR) + N3);
        	System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
        else if (opcao == 4) {
        	System.out.println("Digite Quantos Dias quer Remover: ");
        	int N4 = Scan.nextInt();
			Cal.set(Calendar.DAY_OF_MONTH, Cal.get(Calendar.DAY_OF_MONTH) - N4);
			System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
        else if (opcao == 5) {
        	System.out.println("Digite Quantos Meses quer Remover: ");
        	int N5 = Scan.nextInt();
			Cal.set(Calendar.MONTH, Cal.get(Calendar.MONTH) - N5);
			System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
        else if (opcao == 6) {
        	System.out.println("Digite Quantos Anos quer Remover: ");
        	int N6 = Scan.nextInt();
        	Cal.set(Calendar.YEAR, Cal.get(Calendar.YEAR) - N6);
        	System.out.println("Nova Data: " + Cal.get(Calendar.DAY_OF_MONTH) + "/" + Cal.get(Calendar.MONTH) + "/" +  Cal.get(Calendar.YEAR));
		}
        else if (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6) {
        	System.out.println("Opcao Invalida");
        }
        else {
        	System.out.println("Finalizando Programa");
        }
		} while (opcao != 0);
			
	}

}
