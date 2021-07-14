package jogo.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import jogo.controle.ControladorPartidas;
import jogo.modelos.Equipe;
import jogo.modelos.Partida;


class TesteControladorPartidas {

	@Test
	void testAdicionarPartidaComSucesso() {
		ControladorPartidas c = new ControladorPartidas();
		
		
		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		//LocalDate.parse("1995-01-01"); 
		LocalTime.parse("10:10:10");
		LocalDate a = LocalDate.parse("1995-01-01"); 
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = true;
		assertEquals(resultadoObitido, resultadoEsperado);
	}
	
	
	@Test
	void testAdicionarPartidaComDataNull() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
			
		assertEquals(null, resultadoObitido);
	}

	@Test
	void testAdicionarPartidaComHoraNull() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
			
		assertEquals(null, resultadoObitido);
	}

	@Test
	void testAdicionarPartidaComEquipe1Null() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, null, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObitido, resultadoEsperado);
	}
	
	@Test
	void testAdicionarPartidaComEquipe2Null() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObitido, resultadoEsperado);
	}
	
	@Test
	void testAdicionarPartidaComCampeonatoNull() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObitido, resultadoEsperado);
	}
	
	@Test
	void testAdicionarPartidaComresponsavelPelaTransmissaoNull() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObitido, resultadoEsperado);
	}
	
	@Test
	void editarPartidaComSucesso() {
		LocalDate dataDaPartida;
		LocalTime hora;
		
		Partida partida = new Partida(dataDaPartida, hora, equipe1, equipe2, campeonato, responsavelPelaTransmissao);
		ControladorPartidas c = new ControladorPartidas();
		
		c.add(partida);
		Item i = new Item("Banco", "Mapear Entidades", "18/07/2021", false);
		
		i.setId(item.getId());
		Item resultadoObtido = chekList.atualizarItem(i);
		
		assertEquals("Banco", resultadoObtido.getTitulo());
		assertEquals("Mapear Entidades", resultadoObtido.getDescricao());
		assertEquals("18/07/2021", resultadoObtido.getData());
		assertEquals(false, resultadoObtido.isFeita());
			
	}
		
	@Test
	void listarPartidas() {
		Item item = new Item("Banco de dados", "Mapear entidades", "20/07/2021", false);
		Item item2 = new Item("VEV", "Testes", "15/07/2021", false);
		ControladorCheckList chekList = new ControladorCheckList();
		chekList.addItem(item);
		chekList.addItem(item2);
		List<Item> resultadoObitido = chekList.listarAtividades();
		assertEquals(2, resultadoObitido.size()); 
	}
	
	@Test
	void removerPartida() {
        Item item = new Item("Banco de dados", "Mapear entidades", "20/07/2021", false);
        ControladorCheckList chekList = new ControladorCheckList();
        chekList.addItem(item);
        boolean resultadoObtido = chekList.removerItem(item);
        assertTrue(resultadoObtido);
        List<Item> listar = chekList.listarAtividades();
        assertEquals(0, listar.size()); 

    }

}
