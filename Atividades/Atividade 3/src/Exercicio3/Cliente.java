package Exercicio3;

public class Cliente {
	private int codigo = 1;
	private String endere�o;
	private String telefone;
	
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected String getEndere�o() {
		return endere�o;
	}
	protected void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
