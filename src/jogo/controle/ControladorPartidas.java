package jogo.controle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jogo.modelos.Equipe;
import jogo.modelos.Partida;
import jogo.repositorio.Repositorio;

public class ControladorPartidas {
	private Repositorio rep = new Repositorio();  
	
	public boolean criarPartida(LocalDate dataDaPartida, LocalTime hora, Equipe equipe1, Equipe equipe2, String campeonato, String responsavelPelaTransmissao)
	{
			
		Partida novaPartida = new Partida(
				dataDaPartida, hora, equipe1, 
				equipe2, campeonato, responsavelPelaTransmissao
		);
		
			
		rep.adicionarPartida(novaPartida);
		
		return true;
	}
	
	public Partida buscar(int id) {
		Partida p = rep.buscar(id);
		if(p==null) {
			throw new RuntimeException("NÃO ACHO");
		}
		return p;
	}
	
	public boolean atualizarPartida(Partida p) {
		Partida partida = rep.atualizarPartida(p);
        if(p==null) {
            throw new RuntimeException("PArtida atualizada");
        }

        return true;
    }
	
	public boolean apagar(int id) {
		boolean p = rep.apagar(id);
		if(!p) {
			throw new RuntimeException("NÃO APAGOU");
		}
		return true;
	}
	
	public List<Partida> exibirPartidas() {
		return rep.listarPartidasDoRepositorio();
	}
}
