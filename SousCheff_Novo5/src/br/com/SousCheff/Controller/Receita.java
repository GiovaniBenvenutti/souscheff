package br.com.SousCheff.Controller;

import java.io.Serializable;

public class Receita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String refeição;
	private String ingredientes;
	private String modoDePreparo;

	public Receita() {

	}

	public Receita(String nome, String refeição, String ingredientes, String modoDePreparo) {
		this.nome = nome;
		this.refeição = refeição;
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
	}

	@Override
	public String toString() {
		return "Receita:\t\t" + nome + ", \nRefeição:\t\t" + refeição + ", \nIngredientes:\t\t" + ingredientes
				+ ", \nModo de preparo: \t" + modoDePreparo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRefeição() {
		return refeição;
	}

	public void setRefeição(String refeição) {
		this.refeição = refeição;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}
}
