package Exercicio3;

public class Retangulo implements IForma {
	private int Base;
	private int Altura;
	private double Area;
	private String Cor;
	
	@Override
	public double calcularArea() {
		Area = (Base * Altura);
		return Area;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public double getArea() {
		return Area;
	}

	public void setArea(int area) {
		Area = area;
	}
	
}
