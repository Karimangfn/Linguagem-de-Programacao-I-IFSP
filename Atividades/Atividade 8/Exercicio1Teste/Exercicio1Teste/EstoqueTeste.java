package Exercicio1Teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Exercicio1.Controle;
import Exercicio1.Estoque;
import Exercicio1.Produto;

public class EstoqueTeste {
	
	@Test
	public void deveRetornarProdutosComEstoqueInsuficiente() {
		Estoque estoque = new Estoque("Estoque1");
		estoque.armazena(new Produto("Banana", 5, 10, 30));  
		estoque.armazena(new Produto("Maça", 20, 10, 30)); 
		estoque.armazena(new Produto("Laranja", 30, 10, 20)); 
			
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		assertEquals(3, controle.getProdutosComEstoqueInsuficiente().size(), 0.001);
		assertEquals("Banana", controle.getProdutosComEstoqueInsuficiente().get(0).getNome());
		assertEquals("Maça", controle.getProdutosComEstoqueInsuficiente().get(1).getNome());
		assertEquals("Laranja", controle.getProdutosComEstoqueInsuficiente().get(2).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueExcedente() {
		Estoque estoque = new Estoque("Estoque2");
		estoque.armazena(new Produto("Laranja", 40, 10, 30)); 
		estoque.armazena(new Produto("Tangerina",30, 10, 40));
		estoque.armazena(new Produto("Melancia", 10, 20, 40));
			
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		assertEquals(3, controle.getProdutosComEstoqueExcedente().size(), 0.001);
		assertEquals("Laranja", controle.getProdutosComEstoqueExcedente().get(0).getNome());
		assertEquals("Tangerina", controle.getProdutosComEstoqueExcedente().get(1).getNome());
		assertEquals("Melancia", controle.getProdutosComEstoqueExcedente().get(2).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueZerado() {
		Estoque estoque = new Estoque("Estoque3");
		estoque.armazena(new Produto("Maça", 0, 10, 30));
		estoque.armazena(new Produto("Mamão", 20, 10, 30));
		estoque.armazena(new Produto("Pera", 50, 20, 40));
			
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		assertEquals(3, controle.getProdutosComEstoqueZerado().size(), 0.001);
		assertEquals("Maça", controle.getProdutosComEstoqueZerado().get(0).getNome());
		assertEquals("Mamão", controle.getProdutosComEstoqueZerado().get(1).getNome());
		assertEquals("Pera", controle.getProdutosComEstoqueZerado().get(2).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueAdequado() {
		Estoque estoque = new Estoque("Estoque4");
		estoque.armazena(new Produto("Tangerina", 20, 10, 30));
		estoque.armazena(new Produto("Abacate", 0, 20, 30));
		estoque.armazena(new Produto("Acerola", 10, 20, 50));
			
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		assertEquals(3, controle.getProdutosComEstoqueAdequado().size(), 0.001);
		assertEquals("Tangerina", controle.getProdutosComEstoqueAdequado().get(0).getNome());
		assertEquals("Abacate", controle.getProdutosComEstoqueAdequado().get(1).getNome());
		assertEquals("Acerola", controle.getProdutosComEstoqueAdequado().get(2).getNome());
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutos() {
		Estoque estoque = new Estoque("Estoque5");
		
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		List<Produto> Vazio = controle.getProdutosComEstoqueAdequado(); 
		
		assertEquals(0, Vazio == null ? 0 : Vazio.size());
		assertEquals(null,Vazio);	
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado() {
		Estoque estoque = new Estoque("Estoque6");
		
		Controle controle = new Controle();
		controle.avaliaProduto(estoque);
		
		List<Produto> Vazio = controle.getProdutosComEstoqueZerado(); 
			
		assertEquals(0, Vazio == null ? 0 : Vazio.size());
		assertEquals(null,Vazio);
	}
}
