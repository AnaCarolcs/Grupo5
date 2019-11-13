package model;

import java.util.ArrayList;
import java.util.Random;

public class Refeicao {

	private String dia;
	private String descricao;
	
	private ArrayList<Alimento> prato;
	
	public Refeicao(String dia, String descricao){
		this.dia = dia;
		this.descricao = descricao;
		prato = new ArrayList<Alimento>();
	}
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ArrayList<Alimento> getPrato() {
		return prato;
	}
	
	public void montaPrato(Grupo g1, Grupo g2, Grupo g3) {
		Random random = new Random();
		Alimento a1 = g1.getAlimentos().get(random.nextInt(g1.getAlimentos().size()));
		prato.add(a1);
		Alimento a2 = g2.getAlimentos().get(random.nextInt(g2.getAlimentos().size()));
		prato.add(a2);
		Alimento a3 = g3.getAlimentos().get(random.nextInt(g3.getAlimentos().size()));
		prato.add(a3);
	}
}
