package Exercicio4;

import javax.swing.SwingUtilities;

public class Exercicio4 {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Cadastro().setVisible(true);
			}
		});

	}
	
	public static void miCadFornecedores() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Fornecedor().setVisible(true);
			}
		});
	}
	
	
	public static void miCadClientesFisica() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PessoaFisica().setVisible(true);
			}
		});
	}
	
	public static void miCadClientesJuridica() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PessoaJuridica().setVisible(true);
			}
		});
	}
}
