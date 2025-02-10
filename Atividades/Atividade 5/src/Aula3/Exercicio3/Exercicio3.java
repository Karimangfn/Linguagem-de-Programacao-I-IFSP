package Aula3.Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    private static int opcao, cod, codigo = 1;
    private static String nome, cpf, razaoSocial, cnpj, endereco, telefone;
    private static PessoaFisica pf = new PessoaFisica();
    private static PessoaJuridica pj = new PessoaJuridica();
    
    private static PessoaFisica[] clientesPF = new PessoaFisica[10];
    private static PessoaJuridica[] clientesPJ = new PessoaJuridica[10];
    
    private static Scanner dado = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            menu();
        } finally {
            System.out.println("Finalizando Programa");
            dado.close();
        }
    }
    
    private static void menu() {
        System.out.println("\nOPÇÕES:");
        System.out.println("0) Sair do Programa");
        System.out.println("1) Inserir cliente ");
        System.out.println("2) Remover cliente");
        System.out.println("3) Consultar clientes");
        System.out.print("Digite sua opção: ");
        try {
            opcao = dado.nextInt();
            dado.nextLine(); 
        } catch (InputMismatchException N) {
            System.out.println("A Operação retornou o seguinte Erro: ");
            System.out.println("InputMismatchException");
            System.out.println("Informe Somente os Numeros 0, 1, 2 ou 3"); 
            dado.nextLine();
            menu(); 
        }
        switch (opcao)
        {
        case 1:
            inserirCliente();
            menu();
            break;
            
        case 2:
            removerCliente();
            menu();
            break;
        
        case 3:
            consultarCliente();
            menu();
            break;
            
        default:
            if (opcao != 0) {
                System.out.println("Opção inválida!");
                menu();
            }
            else {
            }
            break;
        }
    }

    private static void inserirCliente() {
        String tipo_cliente;
        System.out.print("O cliente é PF ou PJ?: ");
        tipo_cliente = dado.nextLine();
        switch (tipo_cliente) {
        case "pf":
            System.out.print("Nome: ");
            nome = dado.nextLine();
            System.out.print("CPF: ");
            cpf = dado.nextLine();
            System.out.print("Endereço: ");
            endereco = dado.nextLine();
            System.out.print("Telefone: ");
            telefone = dado.nextLine();
            pf = new PessoaFisica();
            pf.setCodigo(codigo);
            pf.setNome(nome);
            pf.setCpf(cpf);
            pf.setEndereco(endereco);
            pf.setTelefone(telefone);
            clientesPF[codigo - 1] = pf;
            codigo++;
            System.out.println("Cliente inserido com sucesso!");
            break;
            
        case "pj":
            System.out.print("Razão Social: ");
            razaoSocial = dado.nextLine();
            System.out.print("CNPJ: ");
            cnpj = dado.nextLine();
            System.out.print("Endereço: ");
            endereco = dado.nextLine();
            System.out.print("Telefone: ");
            telefone = dado.nextLine();
            pj = new PessoaJuridica();
            pj.setCodigo(codigo);
            pj.setRazaoSocial(razaoSocial);
            pj.setCnpj(cnpj);
            pj.setEndereco(endereco);
            pj.setTelefone(telefone);
            
            clientesPJ[codigo - 1] = pj;
            codigo++;
            System.out.println("Cliente inserido com sucesso!");
            break;
        default:
            System.out.println("Este tipo de cliente não existe!");
            break;
        }
    }
    
    private static void removerCliente() {
        String tipo_cliente;
        
        System.out.print("O cliente é PF ou PJ?");
        tipo_cliente = dado.nextLine();
        
        boolean remocao = false;
        switch (tipo_cliente) {
        case "pf":
            try {
                System.out.print("Informe o código do cliente: ");
                cod = dado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("A Operação retornou o seguinte Erro: ");
                System.out.println("InputMismatchException");
                System.out.println("Informe Somente os Numeros"); 
                dado.nextLine();
            }
            for (int i = 0; i < codigo; i++)
            if (clientesPF[i] != null)
            if (clientesPF[i].getCodigo() == cod) {
                clientesPF[i] = null;
                remocao = true;
                break;
            }
            break;
            
        case "pj":
            try {
                System.out.print("Informe o código do cliente: ");
                cod = dado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("A Operação retornou o seguinte Erro: ");
                System.out.println("InputMismatchException");
                System.out.println("Informe Somente os Numeros"); 
                dado.nextLine();
            }
            for (int i = 0; i < codigo; i++)
            if (clientesPJ[i] != null)
            if (clientesPJ[i].getCodigo() == cod) {
                clientesPJ[i] = null;
                remocao = true;
                break;
            }
            break;
        default:
            System.out.println("Este tipo de cliente não existe!");
            System.out.println();
            break;
        }
        if (remocao)
            System.out.println("Cliente removido com sucesso!");
        else
            System.out.println("Este cliente não existe!");
    }
    
    private static void consultarCliente() {
        boolean existe_pf = false;
        for (int i = 0; i < codigo - 1; i++) {
        if (clientesPF[i] != null) {
        existe_pf = true;
        break;
        }
        }
        if (existe_pf == true)
        System.out.println("PESSOAS FÍSICAS:");
        else
        System.out.println("PESSOAS FÍSICAS: Nenhum registro encontrado!");
        for (int i = 0; i < codigo - 1; i++) {
        if (clientesPF[i] != null)
        System.out.println(clientesPF[i].getCodigo() + " - " +
        clientesPF[i].getNome() + " - " +
        clientesPF[i].getCpf() + " - " +
        clientesPF[i].getEndereco() + " - " +
        clientesPF[i].getTelefone());
        }
        
        boolean existe_pj = false;
        for (int i = 0; i < codigo - 1; i++) {
        if (clientesPJ[i] != null) {
        existe_pj = true;
        break;
        }
        }
        if (existe_pj == true)
        System.out.println("PESSOAS JURÍDICAS:");
        else
        System.out.println("PESSOAS JURÍDICAS: Nenhum registro encontrado!");
        for (int i = 0; i < codigo - 1; i++) {
        if (clientesPJ[i] != null)
        System.out.println(clientesPJ[i].getCodigo() + " - " +
        clientesPJ[i].getRazaoSocial() + " - " +
        clientesPJ[i].getCnpj() + " - " +
        clientesPJ[i].getEndereco() + " - " +
        clientesPJ[i].getTelefone());
        }
    }
}
