package model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArquivoTest {

	@Test
	void leGrupoTest() throws IOException {
		ArrayList<Alimento> alimentos = Arquivo.leGrupo("data/Teste.txt");
		assertEquals(alimentos.get(0).getNome(), "Testando");
		assertEquals(alimentos.get(0).getMedida(), "123");
	}
	
	@Test
	void reescreveArquivoTest() throws IOException {
		Grupo grupo = new Grupo("Teste");
		grupo.cadastraAlimento("Comida", "g");
		Arquivo.reescreveArquivo("data/Teste.txt", grupo);
		ArrayList<Alimento> alimentos = Arquivo.leGrupo("data/Teste.txt");
		assertEquals(alimentos.get(0).getNome(), "Comida");
		assertEquals(alimentos.get(0).getMedida(), "g");
		
		Grupo inicial = new Grupo("Inicial");
		inicial.cadastraAlimento("Testando", "123");
		Arquivo.reescreveArquivo("data/Teste.txt", inicial);
	}

}
