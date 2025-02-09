package Aula4.Exercicio2;

public class Retangulo extends Forma {
	private int base;
	private int altura;
	
	@Override
	protected double calcularArea() {
		Area = base * altura;
		return Area;
	}
	 
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}	
}
