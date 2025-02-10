package Aula4.Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    private static Scanner Scan = new Scanner(System.in);
    private static Retangulo r = new Retangulo();
    private static Circulo c = new Circulo();
    private static int opcao;

    public static void main(String[] args) {
        try {
            menu();
        } finally {
            System.out.println("Finalizando Programa");
            Scan.close();
        }
    }
    
    private static void menu() {
         System.out.println("\nOpções:");
         System.out.println("0 - Sair do Programa");
         System.out.println("1 - Calcular Área do Retângulo");
         System.out.println("2 - Calcular Área do Círculo");
         System.out.print("Digite sua opção: ");
         try {
            opcao = Scan.nextInt();
            Scan.nextLine();
         } catch (InputMismatchException N) {
            System.out.println("A Operação retornou o seguinte Erro: ");
            System.out.println("InputMismatchException");
            System.out.println("Informe Somente os Números 0, 1 ou 2"); 
            Scan.nextLine();
            menu();
        } 
         
        switch (opcao) {
        case 1:
            areaRetangulo();
            menu();
         break;
         
        case 2:
            try {
            areaCirculo();
            } catch (InputMismatchException N) {
                 System.out.println("A Operação retornou o seguinte Erro: ");
                 System.out.println("InputMismatchException");
                 System.out.println("Informe Somente os Números");
                 Scan.nextLine();
                 menu();
            }
         break;
         
        default:
            if (opcao != 0) {
                System.out.println("Opção Inválida");
                menu();
            }
            else {
            }
    }
    
    private static void areaRetangulo() {
         try {
         System.out.println("Digite a Base do Retângulo: ");
         r.setBase(Scan.nextInt());
         System.out.println("Digite a Altura do Retângulo: ");
         r.setAltura(Scan.nextInt());
         System.out.println("Digite uma Cor para o Retângulo: ");
         r.setCor(Scan.next());
         System.out.printf("Área: %.0f " , r.calcularArea());
         System.out.println("\nCor: " + r.getCor());
         } catch (InputMismatchException N) {
             System.out.println("A Operação retornou o seguinte Erro: ");
             System.out.println("InputMismatchException");
             System.out.println("Informe Somente os Números");
             Scan.nextLine();
         }
         
    }
    
    private static void areaCirculo() throws InputMismatchException {
        System.out.println("Digite o Raio do Círculo: ");
         c.setRaio(Scan.nextDouble());
         System.out.println("Digite uma Cor para o Círculo: ");
         c.setCor(Scan.next());
         System.out.println("Área: " + c.calcularArea() );
         System.out.println("Cor: " + c.getCor());
         menu();
    }
}
