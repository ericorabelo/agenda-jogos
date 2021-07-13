package jogo.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import jogo.modelos.Equipe;

@TestMethodOrder(OrderAnnotation.class)
class TesteEquipe {
	Equipe equipe;
	
	@BeforeEach
	void setUp() {
		equipe = new Equipe();
	}
	
	@Test
	@DisplayName("Definir e retornar Nome")
	@Order(1)
	public void testeSetGetNome() {
		equipe.setNome("Flamengo");
		assertEquals("Flamengo", equipe.getNome());
	}
	
	@Test
	@DisplayName("Definir e retornar Id")
	@Order(1)
	public void testeSetGetId() {
		equipe.setId(1);
		assertEquals(1, equipe.getId());
	}
	
	@AfterEach
	void tearDown() {
		equipe = null;
	}

}
