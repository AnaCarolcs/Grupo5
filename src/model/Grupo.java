package model;

import java.util.ArrayList;

public class Grupo {

	private String nome;
	
	private ArrayList<Alimento> alimentos;
	
	public Grupo(String nome, ArrayList<Alimento> alimentos) {
		this.nome = nome;
		this.alimentos = alimentos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Alimento> getAlimentos(){
		return alimentos;
	}
	
	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
}
