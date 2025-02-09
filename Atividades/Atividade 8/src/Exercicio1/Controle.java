package Exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Controle {
	private List<Produto> produtosComEstoqueInsuficiente;
	private List<Produto> produtosComEstoqueExcedente;
	private List<Produto> produtosComEstoqueZerado;
	private List<Produto> produtosComEstoqueAdequado;
	
	public void controlaEstoques(Estoque estoque) {
		this.produtosComEstoqueInsuficiente = new ArrayList<Produto>();
		this.produtosComEstoqueExcedente = new ArrayList<Produto>();
		this.produtosComEstoqueZerado = new ArrayList<Produto>();
		this.produtosComEstoqueAdequado = new ArrayList<Produto>();
	}
	
	public List<Produto> getProdutosComEstoqueInsuficiente() {
		return produtosComEstoqueInsuficiente;
	}

	public List<Produto> getProdutosComEstoqueExcedente() {
		return produtosComEstoqueExcedente;
	}

	public List<Produto> getProdutosComEstoqueZerado() {
		return produtosComEstoqueZerado;
	}

	public List<Produto> getProdutosComEstoqueAdequado() {
		return produtosComEstoqueAdequado;
	}
	
	public void avaliaProduto(Estoque estoque) {
		for(Produto produto: estoque.getProdutos()) {
			if (produto.getQuantidade() < produto.getEstoqueMinimo()) {
				produtosComEstoqueInsuficiente = estoque.getProdutos();
			}
			
			if (produto.getQuantidade() > produto.getEstoqueMaximo()) {
				produtosComEstoqueExcedente = estoque.getProdutos();
			}
			
			if (produto.getQuantidade() == 0) {
				produtosComEstoqueZerado = estoque.getProdutos();
			}
			
			if (produto.getQuantidade() > produto.getEstoqueMinimo() && produto.getQuantidade() < produto.getEstoqueMaximo()) {
				produtosComEstoqueAdequado = estoque.getProdutos();
			}
			
		}
	}

}
