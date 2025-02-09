package Aula3.Exercicio1;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
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
	
	public double getpreco() {
		return preco;
	}
	
	public void setpreco(double preco) {
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