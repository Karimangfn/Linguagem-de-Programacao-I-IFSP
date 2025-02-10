package Exercicio3;

public class Cliente {
	private int codigo = 1;
	private String endereco;
	private String telefone;
	
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
