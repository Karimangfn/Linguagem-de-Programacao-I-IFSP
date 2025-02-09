package Exercicio4;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Cadastro extends JFrame {
		private JMenuBar mbBarra;
		private JMenu mnCadastro;
		
		private JMenu mnCadClientes;
		private JMenuItem miCadClientes[];
		private static final String	cadClientesItens[] = {"Pessoa Fisica", "Pessoa Juridica"};
		private JMenuItem miCadFornecedores;
		private JMenuItem miCadSair;
		
		Cadastro() {
			mbBarra = new JMenuBar();
			mnCadastro = new JMenu("Cadastro");
			mnCadClientes = new JMenu("Clientes");
			miCadClientes = new JMenuItem[2];
			miCadFornecedores = new JMenuItem("Fornecedores");
			miCadSair = new JMenuItem("Sair");
			
			//interface
			setTitle("Exercicio 4 - Cadastro");
			setSize(350,300);
			setLocationRelativeTo(null);
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			for (int i = 0; i < miCadClientes.length; i++) {
				miCadClientes[i] = new JMenuItem(cadClientesItens[i]);
				mnCadClientes.add(miCadClientes[i]);
			}
			
			//adicionar componentes
			setJMenuBar(mbBarra);
			mbBarra.add(mnCadastro);
			mnCadastro.add(mnCadClientes);
			mnCadastro.add(miCadFornecedores);
			mnCadastro.addSeparator();
			mnCadastro.add(miCadSair);
			
			miCadClientes[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					Exercicio4.miCadClientesFisica(); 
				}	
			});
			
			miCadClientes[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					Exercicio4.miCadClientesJuridica(); 
				}	
			});
			
			miCadFornecedores.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					Exercicio4.miCadFornecedores(); 
				}
			});
			
			miCadSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					System.exit(0);
				}	
			});
					
	}
		
}
