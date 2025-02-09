package Exercicio2;

import javax.swing.SwingUtilities;

public class Exercicio2 {

	public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new CalcTemperatura().setVisible(true);
				}
			});

		}

	}