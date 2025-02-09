package Exercicio1;

public class Produto {
	private int codigo;
	private String descricao;
	private float preco;
	private boolean ativo;
	
	public int getcodigo() {
		return codigo;
	}
	
	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getdescricao() {
		return descricao;
	}
	
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getpreco() {
		return preco;
	}
	
	public void setpreco(float preco) {
		this.preco = preco;
	}
	
	public boolean getativo() {
		return ativo;
	}
	
	public void setativo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Produto() {
		codigo = 0;
		descricao = "";
		preco = 0;
		ativo = false;
	}

}