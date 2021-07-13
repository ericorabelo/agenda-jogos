package visao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import jogo.controle.ControladorPartidas;
import jogo.modelos.Equipe;
import jogo.modelos.Partida;

public class StartandoVisao {
	public void Start(){
	
		System.out.println("-------------------------------");
		
		System.out.println("| 1 - Criar uma Partida");
		
//		System.out.println("| 2 - Editar uma Partida");
//		
//		System.out.println("| 3 - Remover uma Partida");
		
		System.out.println("| 4 - Listar Todas as Partidas");
		
		System.out.println("| 0 - Sair");
		
		System.out.println("-------------------------------");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
				System.out.println("Digite sua opção:");
				
				int opcao = s.nextInt();
				
				if(opcao == 1) {
					 adicionarEquipe();
				}else if(opcao == 2) {
					
				}else if(opcao == 3) {
					
				}else if(opcao == 4) {
					ListarEquipes();
				}else {
					break;
				}
		}			
	}
	
	ControladorPartidas cp;
	
	public StartandoVisao() {
		this.cp = new ControladorPartidas();
	}
	
	public void ListarEquipes() {
		
		System.out.println("Lista de Partidas do Repositorio");
		
		for (Partida partida : cp.exibirPartidas()) {
			System.out.println(partida.toString());
		}
		
	}
	
	public void adicionarEquipe() {		
		try {
			Scanner in = new Scanner(System.in);
			String nomeEquipe1, nomeEquipe2, campeonato, responsavelPelaTransmissao;
			int idEquipe, idPartida; 
			//golsEquipe1, golsEquipe2
			LocalDate dataDaPartida; 
			LocalTime hora; 
			
			
			//equipe1
			System.out.println("\tDigite o id da Equipe1");
			idEquipe = in.nextInt();	
			in.nextLine();
			
			System.out.println("\tDigite o nomeEntidade");
			nomeEquipe1 = in.nextLine();
			
			//partida
			System.out.println("\tDigite o id da Partida");
			idPartida = in.nextInt();
			in.nextLine();
			
			Equipe e1 = new Equipe(idEquipe, nomeEquipe1);
			
			Partida aux = new Partida(null, null, e1, 
					null, "", "");
			
			cp.criarPartida(null, null, e1, null, "", "");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
