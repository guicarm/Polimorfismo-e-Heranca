package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	
	private String razaoSocial;
	private String cnpj;
	
	// ================ MÉTODO CONSTRUTOR ==============
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Construtor com herança
	public PessoaJuridica(String razaoSocial, String cnpj, String nome, String email, int idade, double renda) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// =============== GETTERS & SETTERS =================
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String identificador() {
		return "PJ";
	}
}