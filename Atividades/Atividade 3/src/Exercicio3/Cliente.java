package Exercicio3;

public class Cliente {
	private int codigo = 1;
	private String endereço;
	private String telefone;
	
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected String getEndereço() {
		return endereço;
	}
	protected void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
