package jogo.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partida {
		
	private int id;
	private static int cont = 0;
	
	private LocalDate dataDaPartida;
	private LocalTime hora;
	
	private Equipe equipe1;
	private Equipe equipe2;
	

	
	private String campeonato;
	private String responsavelPelaTransmissao;
	

	
	public Partida(LocalDate dataDaPartida, LocalTime hora, Equipe equipe1, Equipe equipe2, String campeonato, String responsavelPelaTransmissao) 
	{
		this.id = cont;
		cont++;
		this.dataDaPartida = dataDaPartida;
		this.hora = hora;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.campeonato = campeonato;
		this.responsavelPelaTransmissao = responsavelPelaTransmissao;
	}
	
	public String toString() {
		return "\n-----------------------------------------------------------"
				+ "\n id:" + id + 
				"\n dataDaPartida: " + dataDaPartida 
				+ "\n hora: " + hora 
				+ "\n equipe1: " + equipe1
				+ "\n equipe2: " + equipe2 
				+ "\n campeonato: " + campeonato
				+ "\n responsavelPelaTransmissao: " + responsavelPelaTransmissao 
				+ "\n-----------------------------------------------------------\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Partida.cont = cont;
	}

	public LocalDate getDataDaPartida() {
		return dataDaPartida;
	}

	public void setDataDaPartida(LocalDate dataDaPartida) {
		this.dataDaPartida = dataDaPartida;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Equipe getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public String getResponsavelPelaTransmissao() {
		return responsavelPelaTransmissao;
	}

	public void setResponsavelPelaTransmissao(String responsavelPelaTransmissao) {
		this.responsavelPelaTransmissao = responsavelPelaTransmissao;
	}
	

	
}
