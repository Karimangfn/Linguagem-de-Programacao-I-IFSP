package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	List<String> Produto = new ArrayList<>();

	public void InserirProduto(String elemento) {
		Produto.add(elemento);
	}
	
	public void InserirProdutoPosicaoEspecifica(int posicao, String elemento) {
		Produto.add(posicao,elemento);
	}
	
	public boolean ConsultarProdutoNome(String elemento) {
		return  Produto.contains(elemento);
	}
	
	public String ConsultarProdutoPosicao(int posicao) {
		return Produto.get(posicao);
	}
	
	public void SubstituirProduto(int posicao, String elemento) {
		Produto.set(posicao, elemento);
	}
	
	public void RemoverProdutoNome(String elemento) {
		Produto.remove(elemento);
	}
	
	public void RemoverProdutoPosicao(int posicao) {
		Produto.remove(posicao);
	}
}
