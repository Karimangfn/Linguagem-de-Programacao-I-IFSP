package Aula4.Exercicio2;

public abstract class Forma {
	protected String Cor;
	protected double Area;
	
	protected abstract double calcularArea();
	
	public double getArea() {
		return Area;
	}

	public void setArea(double area) {
		Area = area;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
}
