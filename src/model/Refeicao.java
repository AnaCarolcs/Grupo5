package model;

public class Refeicao {

	private String dia;
	private String descricao;
	
	public Refeicao(String dia, String descricao){
		this.dia = dia;
		this.descricao = descricao;
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
}
