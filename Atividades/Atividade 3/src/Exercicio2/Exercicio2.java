package Exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setIdConta(1);
		cliente.setCliente("Rodrigo", "455.654.234-99", "Alameda dos Anjos", "Rodrigo@gmail.com");
		cliente.setAgencia(889);
		cliente.setNumeroConta("0001234-5");
		
		System.out.println("Imprimindo Dados");
		
		System.out.println("\nDados do Cliente");
		System.out.println("Codigo: " + cliente.getIdConta());
		System.out.println("Dados do Titular: " + cliente.getCliente());
		System.out.println("Agencia: " + cliente.getAgencia());
		System.out.println("Numero da Conta: " + cliente.getNumeroConta());
		
		System.out.println("\nTestando a Interdependencia");
		
	    cliente = new Cliente();
		
		System.out.println("\nDados do Cliente");
		System.out.println("Codigo: " + cliente.getIdConta());
		System.out.println("Dados do Cliente: " + cliente.getCliente());
		System.out.println("Agencia: " + cliente.getAgencia());
		System.out.println("Numero da Conta: " + cliente.getNumeroConta());
		
		//Ao instanciar Cliente Novamente os Dados do Cliente e os Dados da conta sao zerados	
	}

}
