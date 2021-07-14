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
	
	public Partida atualizarPartida(Partida partida) {
		System.out.println("333333333");
		 for(Partida p: listaDePartidas) {
			 if(partida.getId() == p.getId()){
				 System.out.println("sadasdasd");
               p.setDataDaPartida(partida.getDataDaPartida());
               p.setHora(partida.getHora());
               p.setEquipe1(partida.getEquipe1());
               p.setEquipe2(partida.getEquipe2());
               p.setCampeonato(partida.getCampeonato());
               p.setResponsavelPelaTransmissao(partida.getResponsavelPelaTransmissao());
               
               return p;
           }
		 }
		 return null;
	}
	
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