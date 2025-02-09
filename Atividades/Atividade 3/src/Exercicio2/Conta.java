package Exercicio2;

public class Conta {
	private int idConta;
	private int agencia;
	private String numeroConta;
	private Cliente titular;
	
	protected int getIdConta() {
		return idConta;
	}
	protected void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	protected int getAgencia() {
		return agencia;
	}
	protected void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	protected String getNumeroConta() {
		return numeroConta;
	}
	protected void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	protected Cliente getTitular() {
		return titular;
	}
	protected void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
