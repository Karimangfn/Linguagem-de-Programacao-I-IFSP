package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.departamento.Departamento;

public class CargoDao extends GenericDao {
	private String instrucaoSql; // Atributo para armazenar a instrução SQL a ser executada.
	private PreparedStatement comando; // Atributo usado para preparar e executar instruções SQL.
	private ResultSet registros; // Atributo que recebe os dados retornados por uma instrução SQL.
	private static String excecao = null; // Atributo para armazenar mensagens de exceção.
	
	public String insereCargo(Cargo cargo) {
		instrucaoSql = "INSERT INTO CARGO (Descricao, IDDepartamento) VALUES (?,?)";
		return insere(instrucaoSql, cargo.getDescricao(), cargo.getDepartamento().getId());		
	}
	
	 public List<Departamento> recuperaDepartamentos() {
		 Departamento departamento;
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
	                    registros.beforeFirst(); // Retorna o cursor para antes do 1ª registro.
	        	        while (registros.next()) {
	                        // Atribui o Id e a Descrição do cargo ao objeto Cargo por meio dos métodos set e
	                        // adiciona este objeto ao ArrayList funcionarios.
	        	            departamento = new Departamento();
	        	            departamento.setId(registros.getInt("IDDepartamento"));
	        	            departamento.setNomeDepto(registros.getString("NomeDepto"));
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
	        return departamentos; // Retorna o ArrayList de objetos Cargo.
	        
	 }
	 
	 public String getExcecao() {
			return excecao;
		}
	 
	 public List<Cargo> consultaCargos() {
	        Cargo cargo;
	        Departamento departamento;
	        List<Cargo> cargos = new ArrayList<Cargo>();
	        instrucaoSql = "SELECT * FROM Cargo";
	  
	        try {
	        	excecao = ConnectionDatabase.conectaBd(); // Abre a conexão com o banco de dados.
	        	if (excecao == null) {
	                // Obtém os dados de conexão com o banco de dados e prepara a instrução SQL.
	                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
	                
	                // Executa a instrução SQL e retorna os dados ao objeto ResultSet.
	                registros = comando.executeQuery(); 
	                
	                if (registros.next()) { // Se for retornado pelo menos um registro.
	                    registros.beforeFirst(); // Retorna o cursor para antes do 1ª registro.
	        	        while (registros.next()) {
	                        // Atribui os dados do funcionário ao objeto Funcionario por meio dos métodos set e
	                        // adiciona este objeto ao ArrayList funcionarios.
	        	            cargo = new Cargo();
	        	            cargo.setId(registros.getInt("IDCargo"));
	        	            cargo.setDescricao(registros.getString("Descricao"));

	        	            departamento = new Departamento();
	        	            departamento.setId(registros.getInt("IDDepartamento"));
	        	            cargo.setDepartamento(departamento);
	        	            cargos.add(cargo);
	        	        }
	        	    }
	                registros.close(); // Libera os recursos usados pelo objeto ResultSet.
	                comando.close(); // Libera os recursos usados pelo objeto PreparedStatement.
	                // Libera os recursos usados pelo objeto Connection e fecha a conexão com o banco de dados.
	                ConnectionDatabase.getConexaoBd().close(); 
	            }
	        } catch (Exception e) {
	        	excecao = "Tipo de Exceção: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
	        	cargos = null; // Caso ocorra qualquer exceção.
	        }
	        return cargos; // Retorna o ArrayList de objetos Funcionário.
	    }
}
