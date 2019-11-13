package model;

public class Alimento {

	private String nome;
	private String medida;
	
	public Alimento(String nome, String medida) {
		this.nome = nome;
		this.medida = medida;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMedida() {
		return medida;
	}
	
}
