package Aula3.Exercicio3;

public class PessoaJuridica extends Cliente {
	 private String razaoSocial;
	 private String cnpj;
	 public void setRazaoSocial(String razaoSocial) {
	 this.razaoSocial = razaoSocial;
	 }
	 public void setCnpj(String cnpj) {
	 this.cnpj = cnpj;
	 }
	 public String getRazaoSocial() {
	 return razaoSocial;
	 }
	 public String getCnpj() {
	 return cnpj;
	 }
	}
