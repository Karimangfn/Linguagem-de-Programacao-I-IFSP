package br.edu.ifsp.view.cargo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.departamento.Departamento;

@SuppressWarnings("serial")
public class CargoModeloTabela extends AbstractTableModel {
	private String[] colunas = {"Código", "Cargo", "Departamento"};
	private List<Cargo> cargos; // Lista que conterá os dados a serem exibidos no corpo do JTable.
	private List<Departamento> departamentos; // Lista que conterá os dados dos cargos associados a cada funcionário.
	
	public CargoModeloTabela () {
		
	}
	
	public CargoModeloTabela(List<Cargo> cargos, List<Departamento> departamentos) { // Construtor.
		// Obtém um ArrayList de objetos Funcionario, contendo os dados dos funcionários cadastrados.
		this.cargos = cargos;
		this.departamentos = departamentos;
	}
	
	// Método da interface TableModel (implementação obrigatória). 
	// Retorna a quantidade de colunas do modelo da tabela.
	@Override
	public int getColumnCount() { 
		return colunas.length;
	}
	
    // Método da classe abstrata AbstractTableModel (implementação opcional). 
	// Retorna o nome da coluna recebida como argumento.
    // Sem este método, os nomes das colunas são exibidos no JTable como: A, B, C, D etc. 
	@Override
	public String getColumnName(int coluna) {
		return colunas[coluna];
	}

	// Método da interface TableModel (implementação obrigatória). 
	// Retorna a quantidade de linhas do modelo da tabela. 
	@Override
	public int getRowCount() {
		if (cargos != null) // Se existir pelo menos um funcionário cadastrado.
			return cargos.size();	
		return 0;
	}
	
	// Método da classe abstrata AbstractTableModel (implementação opcional). 
	// Retorna a classe da coluna recebida como argumento.
    // Sem este método, a coluna Plano de Saúde do JTable exibe valores true ou false, em vez de checkboxes.
	@Override
	public Class<?> getColumnClass(int coluna) {
		return getValueAt(0, coluna).getClass(); // A linha é zero, mas poderia ser qualquer número de linha,
		                                         // pois o que importa é a classe da coluna.
	}
	
	@Override
    public Object getValueAt(int linha, int coluna) {
        Cargo cargo = cargos.get(linha); // Recupera o objeto Funcionario presente na posição "linha" do ArrayList.
        Object valor = null;
		
        switch (coluna) { // Verifica qual atributo do funcionário será recuperado, com base na coluna recebida.
            case 0: // Coluna IdFuncionario
            	valor = cargo.getId(); 
            	break;
            case 1: // Coluna Nome 
            	valor = cargo.getDescricao();
            	break;
            case 2: // Coluna Cargo
				if (departamentos != null) // Se existir pelo menos um cargo cadastrado.
					for (Departamento d : departamentos)
						if (d.getId() == cargo.getDepartamento().getId())
							valor = d;
            	break;
        }
        return valor;
    }
	
	@Override 
	public boolean isCellEditable(int linha, int coluna) { 
		return false;
	}
	
}
