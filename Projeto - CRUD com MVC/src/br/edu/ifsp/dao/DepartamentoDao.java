package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.model.funcionario.Funcionario;

public class DepartamentoDao extends GenericDao {
	private String instrucaoSql;
	private PreparedStatement comando; // Atributo usado para preparar e executar instruções SQL.
	private ResultSet registros; // Atributo que recebe os dados retornados por uma instrução SQL.
	private static String excecao = null; // Atributo para armazenar mensagens de exceção.
	
	public String insereDepartamento(Departamento departamento) {
		instrucaoSql = "INSERT INTO Departamento (NomeDepto, IDFuncionario) VALUES (?,?)";
		return insere(instrucaoSql, departamento.getNomeDepto(), departamento.getGerente());
	}
	
	public List<Funcionario> recuperaFuncionarios(){
		Funcionario funcionario;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		instrucaoSql = "SELECT * FROM Funcionario";
		
		try {
        	excecao = ConnectionDatabase.conectaBd(); // Abre a conexão com o banco de dados.
        	if (excecao == null) {
                // Obtém os dados de conexão com o banco de dados e prepara a instrução SQL.
                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                
                // Executa a instrução SQL e retorna os dados ao objeto ResultSet.
                registros = comando.executeQuery();
                
                if (registros.next()) { // Se for retornado pelo menos um registro.
                    registros.beforeFirst(); // Retorna o cursor para antes do 1º registro.
        	        while (registros.next()) {
                        // Atribui o Id e a Descrição do cargo ao objeto Cargo por meio dos métodos set e
                        // adiciona este objeto ao ArrayList funcionarios.
        	            funcionario = new Funcionario();
        	            funcionario.setId(registros.getInt("IDFuncionario"));
        	            funcionario.setNome(registros.getString("Nome"));
        	            funcionarios.add(funcionario);
        	        }
        	    }
                registros.close(); // Libera os recursos usados pelo objeto ResultSet.
                comando.close(); // Libera os recursos usados pelo objeto PreparedStatement.
                // Libera os recursos usados pelo objeto Connection e fecha a conexão com o banco de dados.
                ConnectionDatabase.getConexaoBd().close(); 
            }
        } catch (Exception e) {
        	excecao = "Tipo de Exceção: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
        	funcionarios = null; // Caso ocorra qualquer exceção.
        }
        return funcionarios; // Retorna o ArrayList de objetos Cargo.
	}
	
	public String getExcecao() {
		return excecao;
	}
	
	public List<Departamento> consultaDepartamentos() {
        Departamento departamento;
        Funcionario funcionario;
        List<Departamento> departamentos = new ArrayList<Departamento>();
        instrucaoSql = "SELECT * FROM Departamento";
  
        try {
        	excecao = ConnectionDatabase.conectaBd(); // Abre a conexão com o banco de dados.
        	if (excecao == null) {
                // Obtém os dados de conexão com o banco de dados e prepara a instrução SQL.
                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                
                // Executa a instrução SQL e retorna os dados ao objeto ResultSet.
                registros = comando.executeQuery(); 
                
                if (registros.next()) { // Se for retornado pelo menos um registro.
                    registros.beforeFirst(); // Retorna o cursor para antes do 1º registro.
        	        while (registros.next()) {
                        // Atribui os dados do funcionário ao objeto Funcionario por meio dos métodos set e
                        // adiciona este objeto ao ArrayList funcionarios.
        	            departamento = new Departamento();
        	            departamento.setId(registros.getInt("IDDepartamento"));
        	            departamento.setNomeDepto(registros.getString("NomeDepto"));

        	            funcionario = new Funcionario();
        	            funcionario.setId(registros.getInt("IDFuncionario"));
        	            departamento.setGerente(funcionario);
        	            departamentos.add(departamento);
        	        }
        	    }
                registros.close(); // Libera os recursos usados pelo objeto ResultSet.
                comando.close(); // Libera os recursos usados pelo objeto PreparedStatement.
                // Libera os recursos usados pelo objeto Connection e fecha a conexão com o banco de dados.
                ConnectionDatabase.getConexaoBd().close(); 
            }
        } catch (Exception e) {
        	excecao = "Tipo de Exceção: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
        	departamentos = null; // Caso ocorra qualquer exceção.
        }
        return departamentos; // Retorna o ArrayList de objetos Funcionário.
    }
}
