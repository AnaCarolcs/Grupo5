package model;

public class Alimento {

	private String nome;
	private String medida;
	
	//construtor
	public Alimento(String nome, String medida) {
		this.nome = nome;
		this.medida = medida;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMedida() {
		return medida;
	}
	
	public void setMedida(String medida) {
		this.medida = medida;
	}
}
