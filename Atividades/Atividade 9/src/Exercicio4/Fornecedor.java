package Exercicio4;

import javax.swing.*;

@SuppressWarnings("serial")
public class Fornecedor extends JDialog {
	
	  Fornecedor(){
		//interface
		setTitle("Fornecedores");
		setSize(350,100);
		setLocation(700, 350);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		setModal(true);
	  }
}
