package Exercicio1;

import javax.swing.SwingUtilities;

public class Exercicio1 {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Calculadora().setVisible(true);
			}
		});

	}

}
