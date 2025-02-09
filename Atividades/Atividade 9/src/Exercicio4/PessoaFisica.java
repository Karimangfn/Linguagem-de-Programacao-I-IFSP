package Exercicio4;

import javax.swing.*;

@SuppressWarnings("serial")
public class PessoaFisica extends JDialog {
	
	PessoaFisica(){
		//interface
		setTitle("Clientes - Pessoa Fisica");
		setSize(350,100);
		setLocation(700, 350);
				
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		setModal(true);
	}
}
