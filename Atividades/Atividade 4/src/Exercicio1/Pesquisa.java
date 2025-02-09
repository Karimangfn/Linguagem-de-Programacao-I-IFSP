package Exercicio1;

public class Pesquisa {
	
private static String texto;
	
	public boolean BuscarString (String cadeiaCaracteres) {
		return texto.contains(cadeiaCaracteres);
	}

	 public void setTexto(String txt) {
	  texto = txt;
	}
	 
	public String getTexto() {
		return texto;
	}
}
