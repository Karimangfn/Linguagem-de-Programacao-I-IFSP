package Aula3.Exercicio3;

public class Cliente {
	 private int codigo;
	 private String endereco;
	 private String telefone;
	 
	 protected void setCodigo(int codigo) {
	 this.codigo = codigo;
	 }
	 protected void setEndereco(String endereco) {
	 this.endereco = endereco;
	 }
	 protected void setTelefone(String telefone) {
	 this.telefone = telefone;
	 }
	 protected int getCodigo() {
	 return codigo;
	 }
	 protected String getEndereco() {
	 return endereco;
	 }
	 protected String getTelefone() {
	 return telefone;
	 }
	}