package Exercicio2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class CalcTemperatura extends JFrame {
	private JLabel lbTemperatura, lboperacoes;
	private JTextField tfvalorTemperatura;
	private ButtonGroup bgTemp;
	private static final String valTemp[] = {"Celsius para Fahrenheit","Fahrenheit para Celcius","Celsius para Kelvin",
			"Kelvin para Celsius", "Fahrenheit para Kelvin", "Kelvin para Fahrenheit"};
	private JRadioButton rbTemp[];
	private Container cp;
	
	public CalcTemperatura() {
		lbTemperatura = new JLabel("Temperatura");
		lboperacoes = new JLabel("Operações");
		tfvalorTemperatura = new JTextField();
		bgTemp = new ButtonGroup();
		rbTemp = new JRadioButton[6];
		
		//Interface
		setTitle("Exercicio 2 - Calculadora de Temperatura");
		setSize(300,320);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < rbTemp.length; i++) {
			rbTemp[i] = new JRadioButton(valTemp[i]);
			bgTemp.add(rbTemp[i]);
		}
	
		cp = getContentPane();
		cp.setLayout(null);
		
		//Posicionamento
		lbTemperatura.setBounds(30, 10, 100, 50);
		tfvalorTemperatura.setBounds(120, 25, 100, 20);
		lboperacoes.setBounds(50, 60, 100, 25);
		rbTemp[0].setBounds(40, 90, 180, 25);
		rbTemp[1].setBounds(40, 115, 180, 25);
		rbTemp[2].setBounds(40, 140, 180, 25);
		rbTemp[3].setBounds(40, 165, 180, 25);
		rbTemp[4].setBounds(40, 190, 180, 25);
		rbTemp[5].setBounds(40, 215, 180, 25);
		
		//Adicionar Componentes
		cp.add(lbTemperatura);
		cp.add(tfvalorTemperatura);
		cp.add(lboperacoes);
		cp.add(rbTemp[0]);
		cp.add(rbTemp[1]);
		cp.add(rbTemp[2]);
		cp.add(rbTemp[3]);
		cp.add(rbTemp[4]);
		cp.add(rbTemp[5]);
		
		rbTemp[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = (Temperatura * 1.8) + 32;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
		
		rbTemp[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = (Temperatura - 32) / 1.8;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
		
		rbTemp[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = Temperatura + 273.15;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
		
		rbTemp[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = Temperatura - 273.15;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
		
		rbTemp[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = (Temperatura + 459.67) / 1.8;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
		
		rbTemp[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfvalorTemperatura.getText();
				
				Double Temperatura = Double.parseDouble(tfvalorTemperatura.getText());
				Double Total = (Temperatura * 1.8) - 459.67;
				JOptionPane.showMessageDialog(null,"Temperatura: " + Total);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "1 - Não deixe o Campo de Temperatura Vazio!" + "\n2 - Digite apenas Numeros!");
				}
			}
		});
	
	}
}
	
