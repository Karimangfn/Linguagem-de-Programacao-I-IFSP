package Exercicio2;

import java.util.Deque;
import java.util.LinkedList;

public class Fila {
	Deque<String> Pessoa = new LinkedList<>();

	public Deque<String> getFila() {
		return Pessoa;
	}

	public void setFila(Deque<String> Pessoa) {
		this.Pessoa = Pessoa;
	}
    
	public void InserirPessoa(String nome) {
		Pessoa.addLast(nome);
	}
	
	public void RemoverPessoa() {
		Pessoa.pollFirst();
	}
}
