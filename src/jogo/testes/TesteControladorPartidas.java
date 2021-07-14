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
		
		LocalDate a;
		LocalTime b;
		
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = true;
		assertEquals(resultadoObitido, resultadoEsperado);
	}


	@Test
	void testAdicionarPartidaComTimeNull() {
		ControladorPartidas c = new ControladorPartidas();

		Equipe e1 = new Equipe("Flamengo");
		Equipe e2 = new Equipe("Ceará");
		
		boolean resultadoObitido = c.criarPartida(null, null, e1, e2, "campeonato", "responsavelPelaTransmissao");
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObitido, resultadoEsperado);
	}
//
//	@Test
//	void testAdicionarItemDescricaoNull() {
//		ControladorCheckList chekList = new ControladorCheckList();
//		Item item = new Item("V&V", null, "05/07/2021", false);
//		boolean resultadoObitido = chekList.addItem(item);
//		boolean resultadoEsperado = false;
//		Assert.assertEquals(resultadoObitido, resultadoEsperado);
//	}
//
//	@Test
//	void testAdicionarItemDataNull() {
//		ControladorCheckList chekList = new ControladorCheckList();
//		Item item = new Item("V&V", "testes de Software", null, false);
//		boolean resultadoObitido = chekList.addItem(item);
//		boolean resultadoEsperado = false;
//		Assert.assertEquals(resultadoObitido, resultadoEsperado);
//	}
//
//	@Test
//	void editarItem() {
//		Item item = new Item("Banco de dados", "Mapear entidades", "20/07/2021", false);
//		ControladorCheckList chekList = new ControladorCheckList();
//		chekList.addItem(item);
//		Item i = new Item("Banco", "Mapear Entidades", "18/07/2021", false);
//		i.setId(item.getId());
//		Item resultadoObtido = chekList.atualizarItem(i);
//
//		assertEquals("Banco", resultadoObtido.getTitulo());
//		assertEquals("Mapear Entidades", resultadoObtido.getDescricao());
//		assertEquals("18/07/2021", resultadoObtido.getData());
//		assertEquals("false", resultadoObtido.isFeita());
//
//
//	}
//
//	void editarItemTituloNull() {
//		Item item = new Item("Banco de dados", "Mapear entidades", "20/07/2021", false);
//		ControladorCheckList chekList = new ControladorCheckList();
//		chekList.addItem(item);
//		Item i = new Item(null, "Mapear Entidades", "18/07/2021", false);
//		i.setId(item.getId());
//		Item resultadoObtido = chekList.atualizarItem(i);
//
//		assertEquals("Banco", resultadoObtido.getTitulo());
//
//
//
//	}
//
//	@Test
//	void listarItem() {
//		Item item = new Item("Banco de dados", "Mapear entidades", "20/07/2021", false);
//		Item item2 = new Item("VEV", "Testes", "15/07/2021", false);
//		ControladorCheckList chekList = new ControladorCheckList();
//		chekList.addItem(item);
//		chekList.addItem(item2);
//		List<Item> resultadoObitido = chekList.listarAtividades();
//		assertEquals(2, resultadoObitido.size()); 
//	}

}
