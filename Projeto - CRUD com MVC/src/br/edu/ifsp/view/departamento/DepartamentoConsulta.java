package br.edu.ifsp.view.departamento;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import br.edu.ifsp.controller.DepartamentoController;
import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.model.funcionario.Funcionario;

@SuppressWarnings("serial")
public class DepartamentoConsulta extends JDialog {
	private JLabel lbTitulo;
	private JTable tbDepartamento; // Tabela que exibirá os funcionários cadastrados no banco de dados.
	private DepartamentoModeloTabela mtTabela; // Modelo que definirá a estrutura da tabela e permitirá o carregamento dos dados nela.
	private JScrollPane spTabela; // Painel de rolagem ao qual será vinculado o JTable.
	private Container cp; // Container para organizar os componentes na janela.
	
	public DepartamentoConsulta () {
		// Instanciação e configuração dos componentes de interface.
		setTitle("Consulta de Departamentos"); // Título da janela.
		setSize(700, 320); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true); // Torna a janela "modal" (janela que não permite acesso a outras janelas abertas).
				
		String excecaoDepartamentos = null;
		String excecaoFuncionarios = null;
				
		List<Departamento> departamentos = new DepartamentoController().consultaDepartamentos();
		excecaoDepartamentos = new DepartamentoController().getExcecao();
				
		List<Funcionario> funcionarios = new DepartamentoController().recuperaFuncionarios();
		excecaoFuncionarios = new DepartamentoController().getExcecao();
		
		if (excecaoDepartamentos != null) { // Caso ocorra qualquer tipo de exceção.
			JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados dos departamentos:\n" + excecaoDepartamentos, 
					                      "Erro", JOptionPane.ERROR_MESSAGE);
			mtTabela = new DepartamentoModeloTabela(); // Chama o construtor da classe FuncionarioModeloTabela, que apenas define a estrutura do JTable.
		} else if (excecaoFuncionarios != null) { // Caso ocorra qualquer tipo de exceção.
			JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados dos funcionarios dos departamentos:\n" + excecaoFuncionarios, 
						                  "Erro", JOptionPane.ERROR_MESSAGE);
			mtTabela = new DepartamentoModeloTabela(); // Chama o construtor da classe FuncionarioModeloTabela, que apenas define a estrutura do JTable.
		} else		
			// Chama o construtor da classe FuncionarioModeloTabela, que define a estrutura do JTable e carrega os dados nele.
			mtTabela = new DepartamentoModeloTabela(departamentos, funcionarios);
		
		lbTitulo = new JLabel("Consulta de Departamentos");
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19)); // Ajusta a fonte do JLabel.
		
		// Inclui o modelo da tabela no JTable. Nesse momento, são chamados os métodos da classe FuncionarioModeloTabela.
		tbDepartamento = new JTable(mtTabela);
		spTabela = new JScrollPane(tbDepartamento); // Vincula o JTable ao painel de rolagem.
		
		tbDepartamento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Desabilita o dimensionamento automático das colunas.
		// Configura a largura de cada coluna do JTable (em pixels).
		tbDepartamento.getColumnModel().getColumn(0).setPreferredWidth(50);
		tbDepartamento.getColumnModel().getColumn(1).setPreferredWidth(300);
		tbDepartamento.getColumnModel().getColumn(2).setPreferredWidth(292);
		
		// Configura a fonte do cabeçalho do JTable.
		tbDepartamento.getTableHeader().setFont(new Font(null, Font.BOLD, 12));
				
		// Centraliza o conteúdo da coluna referente ao Id do funcionário (índice 0).
		DefaultTableCellRenderer dtcrCentro = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbDepartamento.getColumnModel().getColumn(0).setCellRenderer(dtcrCentro);
				
		DefaultTableCellRenderer dtcrCentro1 = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbDepartamento.getColumnModel().getColumn(1).setCellRenderer(dtcrCentro1);
						
		// Alinha à direita o conteúdo da coluna referente ao Salário do funcionário (índice 3).
		DefaultTableCellRenderer dtcrCentro2 = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbDepartamento.getColumnModel().getColumn(2).setCellRenderer(dtcrCentro2);
						
				
		tbDepartamento.getTableHeader().setReorderingAllowed(false); // Desabilita a reordenação das colunas do JTable.
		// Habilita o modo de seleção simples, onde é possível selecionar apenas uma linha de cada vez no JTable.
		tbDepartamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		cp.setBackground(new Color(180, 205, 205)); // Configura a cor de fundo do container.

		// Posicionamento dos componentes de interface na janela.
		lbTitulo.setBounds(215, 10, 300, 25); // x, y, largura, altura.
		spTabela.setBounds(20, 40, 645, 182);

		// Adição dos componentes de interface ao container.
		cp.add(lbTitulo);
		cp.add(spTabela);
	}
}
