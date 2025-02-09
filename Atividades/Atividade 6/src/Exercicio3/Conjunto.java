package Exercicio3;

import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
	Set<String> Produto = new TreeSet<>();
	
	Set<String> Produto2 = new TreeSet<>();
	
	public void InserirProd1(String produto) {
		Produto.add(produto);
	}
	
	public void InserirProd2(String produto2) {
		Produto2.add(produto2);
	}
	
	public Set<String> Consultar2Conj() {
	    Produto.addAll(Produto2);
		return Produto;
	}
	
	public Set<String> ConsultarComum() {
		Produto.retainAll(Produto2);
		return Produto;
	}
	
	public Set<String> Consultar1NExisteNo2() {
		Produto.removeAll(Produto2);
		return Produto;
	}
	
	public boolean Consultar() {
		return Produto2.containsAll(Produto);
	}

}
