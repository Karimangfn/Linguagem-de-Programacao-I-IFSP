package Exercicio2;

public class Cliente extends Conta {
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	public String getCliente() {
		return ("\n Nome: " + nome +
				"\n CPF: " + cpf +
				"\n endereco: " + endereco +
				"\n email: " + email);
	}
	
    public void setCliente(String nome, String cpf, String endereco, String email) {
    	this.nome = nome;
    	this.cpf = cpf;
    	this.endereco = endereco;
    	this.email = email;
    }
    
    
}
