package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Menu {
	
	public static ArrayList<Grupo> inicializa() throws IOException {
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Carboidratos");
		nomes.add("Verduras e Legumes");
		nomes.add("Frutas");
		nomes.add("Leites e Derivados");
		nomes.add("Carnes e Ovos");
		nomes.add("Leguminosas e Oleagenosas");
		nomes.add("Óleos e Gorduras");
		nomes.add("Açúcares e Doces");
		for(int i = 0; i < 8; i++) {
			grupos.add(new Grupo(nomes.get(i)));
			grupos.get(i).setAlimentos(Arquivo.leGrupo("data/" + nomes.get(i) + ".txt"));
		}
		return grupos;
	}
	
	public static void finaliza(ArrayList<Grupo> grupos) throws IOException {
		for(int i = 0; i < 8; i++) {
			Arquivo.reescreveArquivo("data/" + grupos.get(i).getNome() + ".txt", grupos.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException {
		/*
		ArrayList<Grupo> grupos = inicializa();
		for(int i = 0; i < grupos.size(); i++) {
			for(int j = 0; j < grupos.get(i).getAlimentos().size(); j++) {
				System.out.print(grupos.get(i).getAlimentos().get(j).getNome() + " ");
				System.out.println(grupos.get(i).getAlimentos().get(j).getMedida());
			}
			System.out.println();
		}
		
		grupos.get(0).cadastraAlimento("Pão","g");
		
		finaliza(grupos);
		*/
		
		/*
		ArrayList<Grupo> grupos = inicializa();
		Refeicao r = new Refeicao("sexta-feira","jantar");
		r.montaPrato(grupos.get(0), grupos.get(1), grupos.get(2));
		System.out.println(r.getPrato().get(0).getNome());
		System.out.println(r.getPrato().get(1).getNome());
		System.out.println(r.getPrato().get(2).getNome());
		*/
		
		ArrayList<String> semana = new ArrayList<String>();
		semana.add("Segunda");
		semana.add("Terça");
		semana.add("Quarta");
		semana.add("Quinta");
		semana.add("Sexta");
		semana.add("Sábado");
		semana.add("Domingo");
		
		ArrayList<Grupo> grupos = inicializa();
		
		ArrayList<Refeicao> cardapio = new ArrayList<Refeicao>();
		
		for(int i = 0; i < 7; i++) {
			Refeicao r = new Refeicao(semana.get(i),"Almoço");
			System.out.println("Insira 3 números referentes aos grupos do almoço de " + semana.get(i) + ": ");
			Scanner scanner = new Scanner(System.in);
			Grupo g1 = new Grupo("Grupo 1");
			int aux = scanner.nextInt();
			g1 = grupos.get(aux-1);
			Grupo g2 = new Grupo("Grupo 2");
			aux = scanner.nextInt();
			g2 = grupos.get(aux-1);
			Grupo g3 = new Grupo("Grupo 3");
			aux = scanner.nextInt();
			g3 = grupos.get(aux-1);
			r.montaPrato(g1, g2, g3);
			cardapio.add(r);
			
			Refeicao r2 = new Refeicao(semana.get(i),"Jantar");
			System.out.println("Insira 3 números referentes aos grupos do jantar de " + semana.get(i) + ": ");
			aux = scanner.nextInt();
			g1 = grupos.get(aux-1);
			aux = scanner.nextInt();
			g2 = grupos.get(aux-1);
			aux = scanner.nextInt();
			g3 = grupos.get(aux-1);
			r2.montaPrato(g1, g2, g3);
			cardapio.add(r2);
		}
		
		System.out.println();
		System.out.println("CARDÁPIO SEMANAL:");
		for(int i = 0; i < 14; i++) {
			System.out.print(cardapio.get(i).getDia() + " - ");
			System.out.print(cardapio.get(i).getDescricao() + ": ");
			System.out.print(cardapio.get(i).getPrato().get(0).getNome() + ", ");
			System.out.print(cardapio.get(i).getPrato().get(1).getNome() + ", ");
			System.out.println(cardapio.get(i).getPrato().get(2).getNome() + ".");
		}
	}
}
