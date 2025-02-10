package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        int opcao;
        String produto1;
        String produto2;
        int quantidade;
        int contador;
        Conjunto c = new Conjunto();
        
        do {
             System.out.println("\nOpções:");
             System.out.println("0 - Sair do Programa");
             System.out.println("1 - Inserir produtos no 1º conjunto");
             System.out.println("2 - Inserir produtos no 2º conjunto");
             System.out.println("3 - Consultar todos produtos dos dois conjuntos");
             System.out.println("4 - Consultar apenas produtos em comum nos dois conjuntos");
             System.out.println("5 - Consultar produtos do 1º conjunto que não existem no 2º conjunto");
             System.out.println("6 - Consultar se o 1º conjunto está contido no 2º conjunto");
             System.out.print("Digite sua opção: ");
             opcao = Scan.nextInt();
             
             switch (opcao) {
             case 1:
                System.out.println("Digite Produtos que você quer inserir: ");
                quantidade = Scan.nextInt();
                for (contador = 1; contador <= quantidade; contador++) {
                    System.out.println("Digite o Nome do Produto Nº " + contador + ":");
                    produto1 = Scan.next();
                    c.InserirProd1(produto1);
                }
                System.out.println("Produto Inserido com Sucesso");
             break;
                 
             case 2:
                 System.out.println("Digite Produtos que você quer inserir: ");
                 quantidade = Scan.nextInt();
                 for (contador = 1; contador <= quantidade; contador++) {
                    System.out.println("Digite o Nome do Produto Nº " + contador + ":");
                    produto2 = Scan.next();
                    c.InserirProd2(produto2);
                    }
                 System.out.println("Produto Inserido com Sucesso");
             break;
             
             case 3:
                System.out.println("União entre o 1º Conjunto e o 2º Conjunto de Produtos: " + c.Consultar2Conj());
             break;
             
             case 4:
                 System.out.println("Interseção entre o 1º Conjunto e o 2º Conjunto de Produtos: " + c.ConsultarComum());
             break;
             
             case 5:
                 System.out.println("Diferença entre o 1º Conjunto e o 2º Conjunto de Produtos: " + c.Consultar1NExisteNo2());
             break;
             
             case 6:
             if (c.Consultar() == true) {
                  System.out.println("O 1º Conjunto de Produtos está Contido no 2º Conjunto de Produtos");
             }
             else {
                 System.out.println("O 1º Conjunto de Produtos Não está Contido no 2º Conjunto de Produtos");
             }
             break;
        
             default:
             if (opcao != 0)
                System.out.println("Opção inválida");
             else
                System.out.println("Finalizando Programa");
             break;
             }
             
             }while (opcao != 0);
            
             Scan.close();
    }
}
