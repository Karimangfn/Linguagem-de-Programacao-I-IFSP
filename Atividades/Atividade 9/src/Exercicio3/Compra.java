package Exercicio3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Compra extends JFrame {
	private JLabel lbValor, lbEstado, lbPostagem, lbvproduto, lbvfrete, lbvtotal, lbvprodutovalor, lbvfretevalor, lbvtotalvalor;
	private JTextField tfValor;
	private JCheckBox ckFidelidade;
	private JComboBox<String> cbEstado;
	private static final String valEstado[] = {"SP", "RJ", "MG", "ES"};
	private ButtonGroup bgPostagem;
	private static final String valPostagem[] = {"Sedex","Sedex 10"};
	private JRadioButton rbPostagem[];
	private JButton btCalcular;
	private Container cp;
	
	public Compra() {
		lbValor = new JLabel("Valor do Produto");
		lbvproduto = new JLabel("Valor do Produto");
		lbvfrete = new JLabel("Valor do Frete:");
		lbvprodutovalor = new JLabel();
		lbvfretevalor = new JLabel();
		lbvtotalvalor = new JLabel();
		lbvtotal = new JLabel("Valor Total");
		lbEstado = new JLabel("Estado");
		lbPostagem = new JLabel("Tipo de Postagem");
		lbvproduto = new JLabel("Valor do Produto:");
		lbvfrete = new JLabel("Valor do Frete:");
		lbvtotal = new JLabel("Valor Total:");
		tfValor = new JTextField();
		ckFidelidade = new JCheckBox("Cliente com fidelidade");
		cbEstado = new JComboBox<>(valEstado);
		bgPostagem = new ButtonGroup();
		rbPostagem = new JRadioButton[2];
		btCalcular = new JButton("Calcular");
		
		//interface
		setTitle("Exercicio 3 - Compra");
		setSize(500,300);
		setLocationRelativeTo(null);
		
		for (int i = 0; i < rbPostagem.length; i++) {
			rbPostagem[i] = new JRadioButton(valPostagem[i]);
			bgPostagem.add(rbPostagem[i]);
		}
		rbPostagem[0].setSelected(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		cp = getContentPane();
		cp.setLayout(null);
		
		//posicionamento
		lbValor.setBounds(40, 30, 100, 25);
		tfValor.setBounds(145, 30, 100, 25);
		ckFidelidade.setBounds(35, 65, 170, 25);
		lbEstado.setBounds(40, 100, 100, 25);
		cbEstado.setBounds(90, 103, 60, 20);
		lbPostagem.setBounds(60, 135, 120, 25);
		rbPostagem[0].setBounds(55, 160, 100, 25);
		rbPostagem[1].setBounds(55, 185, 100, 25);
		btCalcular.setBounds(90, 220, 80, 20);
		lbvproduto.setBounds(280, 30, 100, 25);
		lbvfrete.setBounds(280, 60, 100, 25);
		lbvtotal.setBounds(280, 90, 100, 25);
		lbvprodutovalor.setBounds(390, 30, 100, 25);
		lbvfretevalor.setBounds(390, 60, 100, 25);
		lbvtotalvalor.setBounds(390, 90, 100, 25);
		
		
		//adicionar componentes
		cp.add(lbValor);
		cp.add(tfValor);
		cp.add(ckFidelidade);
		cp.add(lbEstado);
		cp.add(cbEstado);
		cp.add(lbPostagem);
		cp.add(rbPostagem[0]);
		cp.add(rbPostagem[1]);
		cp.add(btCalcular);
		cp.add(lbvproduto);
		cp.add(lbvfrete);
		cp.add(lbvtotal);
		cp.add(lbvprodutovalor);
		cp.add(lbvfretevalor);
		cp.add(lbvtotalvalor);
		
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				try {
				switch (cbEstado.getSelectedItem().toString()) {
				case "SP":
					tfValor.getText();		 
					if (ckFidelidade.isSelected()) {
						if (rbPostagem[0].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.10);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));		
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.30);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
					else {
						if (rbPostagem[0].isSelected()) {
							Double Produto = Double.parseDouble(tfValor.getText());
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));	
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText()));
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.30);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
				break;
				
				case "RJ":
					tfValor.getText();
					 
					if (ckFidelidade.isSelected()) {
						if (rbPostagem[0].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.15);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));		
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.35);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
					else {
						if (rbPostagem[0].isSelected()) {
							Double Produto = Double.parseDouble(tfValor.getText());
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Double.parseDouble(tfValor.getText()) * 0.15);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));	
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText()));
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.35);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
				break;
					
				case "MG":
					tfValor.getText();
					 
					if (ckFidelidade.isSelected()) {
						if (rbPostagem[0].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.15);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));		
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.35);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
					else {
						if (rbPostagem[0].isSelected()) {
							Double Produto = Double.parseDouble(tfValor.getText());
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Double.parseDouble(tfValor.getText()) * 0.15);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));	
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText()));
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.35);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
				break;
					
				case "ES":
					tfValor.getText();
					 
					if (ckFidelidade.isSelected()) {
						if (rbPostagem[0].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.20);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));		
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText())) - (Double.parseDouble(tfValor.getText()) * 0.10);
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.40);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
					else {
						if (rbPostagem[0].isSelected()) {
							Double Produto = Double.parseDouble(tfValor.getText());
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Double.parseDouble(tfValor.getText()) * 0.20);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));	
						}
						if (rbPostagem[1].isSelected()) {
							Double Produto = (Double.parseDouble(tfValor.getText()));
							lbvprodutovalor.setText(String.valueOf(Produto));
							Double Frete = (Produto * 0.40);
							lbvfretevalor.setText(String.valueOf(Frete));
							Double Total = Produto + Frete;
							lbvtotalvalor.setText(String.valueOf(Total));
						}
					}
				break;
				}
			} catch (Exception a) {
				JOptionPane.showMessageDialog(null, "1- Não Deixe o Valor do Produto em Branco!" + "\n2- Digite apenas Numeros!");
			}
			}	
		});	
	}
}
