package Exercicio4;

import javax.swing.*;

@SuppressWarnings("serial")
public class PessoaJuridica extends JDialog {
	
	PessoaJuridica(){
		//interface
		setTitle("Clientes - Pessoa Juridica");
		setSize(350,100);
		setLocation(700, 350);
				
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		setModal(true);
	}
}
