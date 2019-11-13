package model;

import java.util.ArrayList;

public class Grupo {

	private String nome;
	private ArrayList<Alimento> alimentos;
	
	public Grupo(String nome) {
		this.nome = nome;
		alimentos = new ArrayList<Alimento>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Alimento> getAlimentos(){
		return alimentos;
	}
	
	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
	public void cadastraAlimento(String nome, String medida) {
		Alimento alimento = new Alimento(nome, medida);
		alimentos.add(alimento);
	}
	
}
