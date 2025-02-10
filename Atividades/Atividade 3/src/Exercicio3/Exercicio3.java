package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int opcao;
		int contador = 0;
		int contador2 = 0;
		int contador3 = 0;
		int codigo = 0;
		PessoaFisica[] VetorPF = new PessoaFisica[10];
		PessoaJuridica[] VetorPJ = new PessoaJuridica[10];
		
		do {
			System.out.println("\nEscolha a Opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir Cliente");
			System.out.println("2 - Remover Cliente");
			System.out.println("3 - Consultar Clientes");
			opcao = Scan.nextInt();
		
		if (opcao == 1) {
		  System.out.println("Voce é uma Pessoa Fisica[PF] ou uma Pessoa Juridica[PJ]?");
		  	String N = Scan.next();
		  	if (N.equals("PF")) {
		  		VetorPF[contador] = new PessoaFisica();
		  		VetorPF[contador].setCodigo(codigo);
		  		System.out.println("Digite seu Nome: ");
		  		VetorPF[contador].setNome(Scan.next());
		  		Scan.nextLine(); //Limpar Buffer
		  		System.out.println("Digite seu CPF: ");
		  		VetorPF[contador].setCpf(Scan.next());
		  		System.out.println("Digite seu Endereco: ");
		  		VetorPF[contador].setEndereco(Scan.next());
		  		Scan.nextLine(); //Limpar Buffer
		  		System.out.println("Digite seu Telefone: ");
		  		VetorPF[contador].setTelefone(Scan.next());
		  		System.out.println("Cliente Inserido com Sucesso");
		  		contador++;
		  	}
		  	else if (N.equals("PJ")) {
		  		VetorPJ[contador2] = new PessoaJuridica();
		  		VetorPJ[contador2].setCodigo(codigo);
		  		System.out.println("Sua Razao Social: ");
		  		VetorPJ[contador2].setRazaosocial(Scan.next());
		  		Scan.nextLine(); //Limpar Buffer
		  		System.out.println("Digite seu CNPJ: ");
		  		VetorPJ[contador2].setCnpj(Scan.next());
		  		System.out.println("Digite seu Endereco: ");
		  		Scan.nextLine(); //Limpar Buffer
		  		VetorPJ[contador2].setEndereco(Scan.next());
		  		System.out.println("Digite seu Telefone: ");
		  		VetorPJ[contador2].setTelefone(Scan.next());
		  		System.out.println("Cliente Inserido com Sucesso");
		  		contador2++;
		  	}
		  	else {
		  		System.out.println("Opcao Invalida, Por Favor Digite PF para Pessoa Fisica ou PJ para Pessoa Juridica");
		  	}
		  	codigo++;
		}
		else if (opcao == 2) {
			 System.out.println("Voce é uma Pessoa Fisica[PF] ou uma Pessoa Juridica[PJ]?");
			 String N = Scan.next();
			 if (N.equals("PF")) {
			 System.out.println("Digite o Codigo do Cliente que quer Remover: ");
			 int N1 = Scan.nextInt();
			 for(contador3=0; contador3 < contador; contador3++) {
			 if (N1 == VetorPF[contador3].getCodigo()+1) {
			 	VetorPF[contador3] = new PessoaFisica();
			 	System.out.println("Cliente Removido com Sucesso");
			 }
			 else {
			 	System.out.println("Cliente inexistente");
			 }
			 }
			 }
			 else if (N.equals("PJ")) {
			 System.out.println("Digite o Codigo do Cliente que quer Remover: ");
			 int N2 = Scan.nextInt();
			 for(contador3=0; contador3 < contador2; contador3++) {
			 if (N2 == VetorPJ[contador3].getCodigo()+1) {
			 	VetorPJ[contador3] = new PessoaJuridica();
			 	System.out.println("Cliente Removido com Sucesso");
			 }	
			 else {
			 	System.out.println("Cliente Inexistente");
			 }
			 }
			 }			
		}
		else if (opcao == 3) {
			for(contador3=0; contador3 < contador; contador3++) {
				System.out.println("\nPessoa Fisica");
				System.out.println("Codigo: " + (VetorPF[contador3].getCodigo()+1));
				System.out.println("Nome: " + VetorPF[contador3].getNome());
				System.out.println("CPF: " + VetorPF[contador3].getCpf());
				System.out.println("Endereco: " + VetorPF[contador3].getEndereco());
				System.out.println("Telefone: " + VetorPF[contador3].getTelefone());
			}
			for(contador3=0; contador3 < contador2; contador3++) {
				System.out.println("\nPessoa Juridica");
				System.out.println("Codigo: " + (VetorPJ[contador3].getCodigo()+1));
				System.out.println("Razao Social: " + VetorPJ[contador3].getRazaosocial());
                System.out.println("CNPJ: " + VetorPJ[contador3].getCnpj());
                System.out.println("Endereco: " + VetorPJ[contador3].getEndereco());
                System.out.println("Telefone: " + VetorPJ[contador3].getTelefone());
			}
		}
		else if (opcao == 0) {
			System.out.println("Finalizando Programa");
		}
		else {
			System.out.println("Opcao Invalida");
		}

		} while (opcao != 0);
		Scan.close();
	}

}
