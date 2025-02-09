package Exercicio3;

import javax.swing.SwingUtilities;

public class Exercicio3 {

	public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Compra().setVisible(true);
				}
			});

		}

	}
