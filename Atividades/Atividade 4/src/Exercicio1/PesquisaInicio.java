package Exercicio1;

public class PesquisaInicio extends Pesquisa {
	
	public final boolean BuscarString (String cadeiaCaracteres) {
		return getTexto().startsWith(cadeiaCaracteres);
	}
    
}
