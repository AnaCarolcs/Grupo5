package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlimentoTest {

	@Test
	void alimentoTest() throws Exception {
		Alimento alimento = new Alimento("Cenoura", "kg");
		assertEquals("Cenoura", alimento.getNome());
		assertEquals("kg", alimento.getMedida());
	}
}
