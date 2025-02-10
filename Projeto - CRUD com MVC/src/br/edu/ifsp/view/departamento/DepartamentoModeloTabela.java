package br.edu.ifsp.view.departamento;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.model.funcionario.Funcionario;

@SuppressWarnings("serial")
public class DepartamentoModeloTabela extends AbstractTableModel {
	private String[] colunas = {"Código", "Nome do Departamento", "Gerente"};
	private List<Departamento> departamentos; // Lista que conterá os dados a serem exibidos no corpo do JTable.
	private List<Funcionario> funcionarios; // Lista que conterá os dados dos cargos associados a cada funcionário.
	
	public DepartamentoModeloTabela () {
		
	}
	
	public DepartamentoModeloTabela(List<Departamento> departamentos, List<Funcionario> funcionarios) { // Construtor.
		// Obtém um ArrayList de objetos Funcionario, contendo os dados dos funcionários cadastrados.
		this.departamentos = departamentos;
		this.funcionarios = funcionarios;
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
		if (departamentos != null) // Se existir pelo menos um funcionário cadastrado.
			return departamentos.size();	
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
        Departamento departamento = departamentos.get(linha); // Recupera o objeto Funcionario presente na posição "linha" do ArrayList.
        Object valor = null;
		
        switch (coluna) { // Verifica qual atributo do funcionário será recuperado, com base na coluna recebida.
            case 0: // Coluna IdFuncionario
            	valor = departamento.getId(); 
            	break;
            case 1: // Coluna Nome 
            	valor = departamento.getNomeDepto();
            case 2: // Coluna Cargo
				if (funcionarios != null) // Se existir pelo menos um cargo cadastrado.
					for (Funcionario c : funcionarios)
						if (c.getId() == departamento.getGerente().getId())
							valor = c;
            	break;
        }
        return valor;
    }
	
	@Override 
	public boolean isCellEditable(int linha, int coluna) { 
		return false;
	}
}
