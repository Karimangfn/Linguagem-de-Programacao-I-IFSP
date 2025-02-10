package br.edu.ifsp.view.cargo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.ifsp.controller.CargoController;
import br.edu.ifsp.model.departamento.Departamento;

@SuppressWarnings("serial")
public class CargoCadastro extends JDialog {
	private JLabel lbTitulo, lbcargo, lbdepartamento;
	private JTextField tfcargo;
	private JButton btcadastro;
	private JComboBox <Departamento> cbDepartamento;
	private Container cp;
	
	public CargoCadastro () {
		setTitle("Cadastro de Cargos"); // Título da janela.
		setSize(500, 260); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true); // Torna a janela "modal" (janela que não permite acesso a outras janelas abertas).
		
		lbTitulo = new JLabel("Cadastro de Cargos");
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
		
		lbcargo = new JLabel("Cargo");
		btcadastro = new JButton("Cadastrar");
		lbdepartamento = new JLabel("Departamento");
		tfcargo = new JTextField();
		cbDepartamento = new JComboBox<>();
		List<Departamento> departamentos = new ArrayList<Departamento>();
		
		departamentos = new CargoController().recuperaDepartamentos();
		if (departamentos != null) // Se existir pelo menos um cargo cadastrado.
			for (Departamento c : departamentos)
				cbDepartamento.addItem(c);
		
		String erro = new CargoController().getExcecao();
		
		if (erro != null) // Caso ocorra qualquer tipo de exceção.
			JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados dos cargos:\n" + erro, 
					                      "Erro", JOptionPane.ERROR_MESSAGE);
		
		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		cp.setBackground(new Color(180, 205, 205)); // Configura a cor de fundo do container.
		
		// Posicionamento dos componentes de interface na janela.
		lbTitulo.setBounds(160, 10, 300, 25); // x, y, largura, altura.
		lbcargo.setBounds(20, 50, 100, 25);
		lbdepartamento.setBounds(20, 100, 220, 25);
		tfcargo.setBounds(110, 50, 360, 25);
		cbDepartamento.setBounds(110, 100, 220, 25);
		btcadastro.setBounds(200, 155, 100, 25);
				
		// Adição dos componentes de interface ao container.
		cp.add(lbTitulo);
		cp.add(lbcargo);
		cp.add(lbdepartamento);
		cp.add(tfcargo);
		cp.add(btcadastro);
		cp.add(cbDepartamento);
		
		btcadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				btcadastroAction();
			}
		});
	}
	
	private void btcadastroAction() {
		
		
		List<String> erros = new ArrayList<String>();
		
		// Envia os dados do funcionário (informados no formulário) ao controller. 
		// O controller retorna então um ArrayList contendo os erros encontrados.
		erros = new CargoController().insereCargo(tfcargo.getText(), (Departamento) cbDepartamento.getSelectedItem());
		
		if (erros.get(0) == null) { // Se o primeiro elemento do ArrayList for null.
			JOptionPane.showMessageDialog(this, "Cargo cadastrado com sucesso.", 
					                      "Informação", JOptionPane.INFORMATION_MESSAGE);
			this.setVisible(false); // Fecha a janela.
		} else { // Se o primeiro elemento do ArrayList não for null.
			String mensagem = "Não foi possível cadastrar o Cargo:\n";
			for (String e : erros) // Cria uma mensagem contendo todos os erros armazenados no ArrayList.
				mensagem = mensagem + e + "\n";
			JOptionPane.showMessageDialog(this, mensagem, "Erros", JOptionPane.ERROR_MESSAGE);
		}
	}
}
