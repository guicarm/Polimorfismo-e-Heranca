package br.com.fiap.beans;

public class Endereco {

	private String logradouro;

	
	//  CONSTRUTORES
	public Endereco() {
		super();
	}

	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}

	
	// GETTER & SETTER
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
}
