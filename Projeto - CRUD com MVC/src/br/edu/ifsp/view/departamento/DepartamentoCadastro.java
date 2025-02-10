package br.edu.ifsp.view.departamento;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.ifsp.controller.DepartamentoController;

@SuppressWarnings("serial")
public class DepartamentoCadastro extends JDialog {
	private JLabel lbTitulo, lbdepartamento;
	private JTextField tfdepartamento;
	private JButton btcadastro;
	private Container cp;
	
	public DepartamentoCadastro () {
		setTitle("Cadastro de Departamentos"); // Título da janela.
		setSize(500, 200); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true); // Torna a janela "modal" (janela que não permite acesso a outras janelas abertas).
		
		lbTitulo = new JLabel("Cadastro de Departamentos");
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
		
		lbdepartamento = new JLabel("Departamento");
		btcadastro = new JButton("Cadastrar");
		tfdepartamento = new JTextField();
		
		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		cp.setBackground(new Color(180, 205, 205)); // Configura a cor de fundo do container.
		
		// Posicionamento dos componentes de interface na janela.
		lbTitulo.setBounds(130, 10, 300, 25); // x, y, largura, altura.
		lbdepartamento.setBounds(20, 50, 100, 25);
		tfdepartamento.setBounds(110, 50, 360, 25);
		btcadastro.setBounds(200, 100, 100, 25);
				
		// Adição dos componentes de interface ao container.
		cp.add(lbTitulo);
		cp.add(lbdepartamento);
		cp.add(tfdepartamento);
		cp.add(btcadastro);
		
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
		erros = new DepartamentoController().insereDepartamento(tfdepartamento.getText(), null);
		
		if (erros.get(0) == null) { // Se o primeiro elemento do ArrayList for null.
			JOptionPane.showMessageDialog(this, "Departamento cadastrado com sucesso.", 
					                      "Informação", JOptionPane.INFORMATION_MESSAGE);
			this.setVisible(false); // Fecha a janela.
		} else { // Se o primeiro elemento do ArrayList não for null.
			String mensagem = "Não foi possível cadastrar o Departamento:\n";
			for (String e : erros) // Cria uma mensagem contendo todos os erros armazenados no ArrayList.
				mensagem = mensagem + e + "\n";
			JOptionPane.showMessageDialog(this, mensagem, "Erros", JOptionPane.ERROR_MESSAGE);
		}
	}
}
