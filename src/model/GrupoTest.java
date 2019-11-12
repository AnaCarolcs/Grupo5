package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GrupoTest {

	@Test
	void grupoTest() throws Exception {
		ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
		
		String nome = "Legume";
		String medida = "kg";
		
		String legume1 = "Cenoura";
		String legume2 = "Beterraba";
		String legume3 = "Rabanete";
		
		alimentos.add(new Alimento(legume1,medida));
		alimentos.add(new Alimento(legume2,medida));
		alimentos.add(new Alimento(legume3,medida));
		
		Grupo grupo = new Grupo(nome, alimentos);
		ArrayList<Alimento> grupoAlimentos = grupo.getAlimentos();
		
		assertEquals(grupo.getNome(),nome);
		assertEquals(alimentos,grupoAlimentos);
	}
}
