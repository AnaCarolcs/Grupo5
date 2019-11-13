package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RefeicaoTest {

	@Test
	void refeicaoTest() {
		String dia = "Quarta-feira";
		String descricao = "Jantar";
		
		Refeicao refeicao = new Refeicao(dia, descricao);
		
		assertEquals(dia, refeicao.getDia());
		assertEquals(descricao, refeicao.getDescricao());
	}
}
