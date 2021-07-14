package jogo.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import jogo.modelos.Equipe;
import jogo.modelos.Partida;

class TestePartida {
	Partida partida;
	
	@BeforeEach
	void setUp() {
		partida = new Partida(null, null, null, null, "campeonato", "campeonato");
	}
	
	@Test
	public void testeSetGetId() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetdataDaPartida() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetHora() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetEquipe1() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetEquipe2() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetCampeonato() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@Test
	public void testeSetGetResponsavelPelaTransmissao() {
		partida.setId(1);
		assertEquals(1, partida.getId());
	}
	
	@AfterEach
	void tearDown() {
		partida = null;
	}	
	
}
