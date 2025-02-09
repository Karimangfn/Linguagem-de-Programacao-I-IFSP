package Exercicio3;

public class Circulo implements IForma {
	private final double pi = 3.14;
	private double Raio;
	private double Area;
	private String Cor;
	
	@Override
	public double calcularArea() {
		Area = (pi * (Raio * Raio));
		return Area;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public double getRaio() {
		return Raio;
	}

	public void setRaio(double raio) {
		Raio = raio;
	}

	public double getArea() {
		return Area;
	}

	public void setArea(double area) {
		Area = area;
	}

	

}
