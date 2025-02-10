package br.edu.ifsp.view.cargo;

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

import br.edu.ifsp.controller.CargoController;
import br.edu.ifsp.controller.FuncionarioController;
import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.departamento.Departamento;

@SuppressWarnings("serial")
public class CargoConsulta extends JDialog {
	private JLabel lbTitulo;
	private JTable tbCargo; // Tabela que exibirá os funcionários cadastrados no banco de dados.
	private CargoModeloTabela mtTabela; // Modelo que definirá a estrutura da tabela e permitirá o carregamento dos dados nela.
	private JScrollPane spTabela; // Painel de rolagem ao qual será vinculado o JTable.
	private Container cp; // Container para organizar os componentes na janela.

	public CargoConsulta () {
		setTitle("Consulta de Cargos"); // Título da janela.
		setSize(700, 320); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true); // Torna a janela "modal" (janela que não permite acesso a outras janelas abertas).
		
		String excecaoCargos = null;
		String excecaoDepartamentos = null;
		
		List<Cargo> cargos = new CargoController().consultaCargos();
		excecaoCargos = new CargoController().getExcecao();
		
		List<Departamento> departamentos = new CargoController().recuperaDepartamentos();
		excecaoDepartamentos = new FuncionarioController().getExcecao();
		
		if (excecaoCargos != null) { // Caso ocorra qualquer tipo de exceção.
			JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados dos cargos:\n" + excecaoCargos, 
					                      "Erro", JOptionPane.ERROR_MESSAGE);
			mtTabela = new CargoModeloTabela(); // Chama o construtor da classe FuncionarioModeloTabela, que apenas define a estrutura do JTable.
		} else if (excecaoDepartamentos != null) { // Caso ocorra qualquer tipo de exceção.
			JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados dos departamentos dos cargos:\n" + excecaoDepartamentos, 
						                  "Erro", JOptionPane.ERROR_MESSAGE);
			mtTabela = new CargoModeloTabela(); // Chama o construtor da classe FuncionarioModeloTabela, que apenas define a estrutura do JTable.
		} else		
			// Chama o construtor da classe FuncionarioModeloTabela, que define a estrutura do JTable e carrega os dados nele.
			mtTabela = new CargoModeloTabela(cargos, departamentos);
		
		lbTitulo = new JLabel("Consulta de Cargos");
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19)); // Ajusta a fonte do JLabel.
		
		// Inclui o modelo da tabela no JTable. Nesse momento, são chamados os métodos da classe FuncionarioModeloTabela.
		tbCargo = new JTable(mtTabela);
		spTabela = new JScrollPane(tbCargo); // Vincula o JTable ao painel de rolagem.
		
		tbCargo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Desabilita o dimensionamento automático das colunas.
		// Configura a largura de cada coluna do JTable (em pixels).
		tbCargo.getColumnModel().getColumn(0).setPreferredWidth(50);
		tbCargo.getColumnModel().getColumn(1).setPreferredWidth(300);
		tbCargo.getColumnModel().getColumn(2).setPreferredWidth(292);
		
		// Configura a fonte do cabeçalho do JTable.
		tbCargo.getTableHeader().setFont(new Font(null, Font.BOLD, 12));
				
		// Centraliza o conteúdo da coluna referente ao Id do funcionário (índice 0).
		DefaultTableCellRenderer dtcrCentro = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbCargo.getColumnModel().getColumn(0).setCellRenderer(dtcrCentro);
		
		DefaultTableCellRenderer dtcrCentro1 = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbCargo.getColumnModel().getColumn(1).setCellRenderer(dtcrCentro1);
				
		// Alinha à direita o conteúdo da coluna referente ao Salário do funcionário (índice 3).
		DefaultTableCellRenderer dtcrCentro2 = new DefaultTableCellRenderer();
		dtcrCentro.setHorizontalAlignment(SwingConstants.CENTER);
		tbCargo.getColumnModel().getColumn(2).setCellRenderer(dtcrCentro2);
				
		tbCargo.getTableHeader().setReorderingAllowed(false); // Desabilita a reordenação das colunas do JTable.
		// Habilita o modo de seleção simples, onde é possível selecionar apenas uma linha de cada vez no JTable.
		tbCargo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
