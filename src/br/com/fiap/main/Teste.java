package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	// ============= MÉTODO STATIC ================
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	// ============ SAÍDA DE DADOS ================
	public static void main(String[] args) {
		

		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Razão social da empresa: "),
															 texto("CNPJ da empresa: "),
															 texto("Nome da empresa: "),
															 texto("Email da empresa: "),
															 inteiro("Idade da empresa: "),
															 decimal("Renda da empresa: "));
		
	
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Nome do cliente: "),
															 texto("Email do cliente: "),
															 inteiro("Idade do cliente: "),
															 decimal("Renda do cliente: "),
															 texto("RG do cliente: "),
															 texto("CPF do cliente: "));
		
		
		Endereco objEnderecoPessoaJuridica = new Endereco(texto("Digite o logradouro da empresa: "));

		Endereco objEnderecoPessoaFisica = new Endereco(texto("Digite o logradouro da sua casa: "));
		
		
		objPessoaJuridica.setEndereco(objEnderecoPessoaJuridica);
		objPessoaFisica.setEndereco(objEnderecoPessoaFisica);
		
		/*Endereco objEndereco = new Endereco(texto("Digite o logradouro: "));
		objPessoaFisica.setEndereco(objEndereco);
		objPessoaJuridica.setEndereco(objEndereco);*/
		
		
		
		// ======= SYSTEM OUT ========
		
		System.out.println("============ DADOS DA EMPRESA ============" +
				   "\nRazão social da empresa: " + objPessoaJuridica.getRazaoSocial() +
				   "\nCNPJ da empresa: " + objPessoaJuridica.getCnpj() +
				   "\nNome da empresa: " + objPessoaJuridica.getNome() +
				   "\nEmail da empresa: " + objPessoaJuridica.getEmail() +
				   "\nEndereço: " + objPessoaJuridica.getEndereco().getLogradouro() +
				   "\nIdade da empresa: " + objPessoaJuridica.getIdade() +
				   "\nRenda da empresa: " + objPessoaJuridica.getRenda() +
				   "\n============ DADOS DO CLIENTE ============" +
				   "\nNome:  " + objPessoaFisica.getNome() +
				   "\nEmail: " + objPessoaFisica.getEmail() +
				   "\nIdade: " + objPessoaFisica.getIdade() +
				   "\nRenda: " + objPessoaFisica.getRenda() +
				   "\nEndereço: " + objPessoaFisica.getEndereco().getLogradouro() +
				   "\nRG: " + objPessoaFisica.getRg() +
				   "\nCPF: " + objPessoaFisica.getCpf());
	}
}
