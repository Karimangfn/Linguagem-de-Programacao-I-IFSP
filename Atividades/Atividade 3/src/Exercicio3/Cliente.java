package Exercicio3;

public class Cliente {
	private int codigo = 1;
	private String enderešo;
	private String telefone;
	
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected String getEnderešo() {
		return enderešo;
	}
	protected void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
