package jogo.repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jogo.modelos.Partida;

public class Repositorio {
	
	private List<Partida> listaDePartidas = new ArrayList<Partida>();
	
	
	public boolean adicionarPartida(Partida partida) {
		listaDePartidas.add(partida);
		return true;
	}
	
//	public boolean editar(Partida partida) {
//		listaDePartidas.add(partida);
//		return true;
//	}
	
	public boolean apagar(int id) {
		for(Partida p : listaDePartidas) {
			if(id== p.getId()) {
				listaDePartidas.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public Partida buscar(int id) {
		for(Partida p : listaDePartidas) {
			if(id == p.getId()) {
				return p;
			}
		}
		return null;
	}

	public List<Partida> listarPartidasDoRepositorio() {
		return listaDePartidas;
	}
}