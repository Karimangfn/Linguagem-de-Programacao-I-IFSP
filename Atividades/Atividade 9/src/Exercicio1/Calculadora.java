package Exercicio1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	private JLabel lbvalor1, lbvalor2, lboperacao;
	private JTextField tfvalor1, tfvalor2;
	private JComboBox<String> cboperacao;
	private static final String valOp[] = {"+","-","x","/","%"}; 
	private JButton btCalcular;
	private Container cp;
	
	public Calculadora() {
		lbvalor1 = new JLabel("Valor 1");
		lbvalor2 = new JLabel("Valor 2");
		tfvalor1 = new JTextField();
		tfvalor2 = new JTextField();
		lboperacao = new JLabel("Operação");
		cboperacao = new JComboBox<>(valOp);
		btCalcular = new JButton("Calcular");
		
		//interface
		setTitle("Exercicio 1 - Calculadora");
		setSize(500,250);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		cp = getContentPane();
		cp.setLayout(null);
		
		//Posicionamento
		lbvalor1.setBounds(50, 20, 50, 50);
		lbvalor2.setBounds(50, 70, 50, 50);
		tfvalor1.setBounds(120, 35, 70, 20);
		tfvalor2.setBounds(120, 85, 70, 20);
		lboperacao.setBounds(50, 120, 80, 50);
		cboperacao.setBounds(120, 135, 50, 20);
		btCalcular.setBounds(220, 135, 90, 20);
		
		//Adicionar componentes
		cp.add(lbvalor1);
		cp.add(lbvalor2);
		cp.add(tfvalor1);
		cp.add(tfvalor2);
		cp.add(lboperacao);
		cp.add(cboperacao);
		cp.add(btCalcular);
		
				
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				switch (cboperacao.getSelectedItem().toString()) {
				case "+":
					tfvalor1.getText();
					tfvalor2.getText();
		
				double soma = Double.parseDouble(tfvalor1.getText()) + Double.parseDouble(tfvalor2.getText());
				JOptionPane.showMessageDialog(null,"Resultado: " + soma);
				break;
				
				case "-":
					tfvalor1.getText();
					tfvalor2.getText();
					
					double subtracao = Double.parseDouble(tfvalor1.getText()) - Double.parseDouble(tfvalor2.getText());
					JOptionPane.showMessageDialog(null,"Resultado: " + subtracao);
				break;
				
				case "x":
					tfvalor1.getText();
					tfvalor2.getText();
					
					double multiplicacao = Double.parseDouble(tfvalor1.getText()) * Double.parseDouble(tfvalor2.getText());
					JOptionPane.showMessageDialog(null,"Resultado: " + multiplicacao);
				break;
					
				case "/":
					tfvalor1.getText();
					tfvalor2.getText();
					
					Double divisao = Double.parseDouble(tfvalor1.getText()) / Double.parseDouble(tfvalor2.getText());
					JOptionPane.showMessageDialog(null,"Resultado: " + divisao);
				break;
				
			    case "%":
			    	try {
			    	tfvalor1.getText();
					tfvalor2.getText();
					
					int resto = Integer.parseInt(tfvalor1.getText()) % Integer.parseInt(tfvalor2.getText());
					JOptionPane.showMessageDialog(null,"Resultado: " + resto);
			    	} catch (Exception c) {
			    		JOptionPane.showMessageDialog(null, "Digite Apenas Numeros Inteiros pra resto da divisão!");
			    	}
			    break;
			}
			} catch (Exception a) {
				JOptionPane.showMessageDialog(null, "1- Não Deixe os Campos Valor 1 e Valor 2 em Branco!" + "\n2- Digite apenas Numeros nos Campos Valor 1 e Valor 2");
			}
		    }
		    });
	}
}
