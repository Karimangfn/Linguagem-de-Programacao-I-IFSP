package Exercicio1;

public class PesquisaFim extends Pesquisa {
	
	public final boolean BuscarString (String cadeiaCaracteres) {
		return getTexto().endsWith(cadeiaCaracteres);
	}

}
