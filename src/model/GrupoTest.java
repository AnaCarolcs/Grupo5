package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GrupoTest {

	@Test
	void grupoTest() throws Exception {
		
		Grupo grupo = new Grupo("Legumes");
		
		grupo.cadastraAlimento("Cenoura", "g");
		grupo.cadastraAlimento("Beterraba", "g");
		grupo.cadastraAlimento("Rabanete", "g");
		
		ArrayList<Alimento> alimentos = grupo.getAlimentos();
		
		assertEquals(grupo.getNome(), "Legumes");
		assertEquals(alimentos.get(0).getNome(), "Cenoura");
	}
}
