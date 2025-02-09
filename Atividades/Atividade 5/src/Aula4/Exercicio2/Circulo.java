package Aula4.Exercicio2;

public class Circulo extends Forma {
	private final double pi = 3.14;
	private double raio;
	
	@Override
	protected double calcularArea() {
		Area = (pi * (raio * raio));
		return Area;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
