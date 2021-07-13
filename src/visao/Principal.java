package visao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import jogo.controle.ControladorPartidas;
import jogo.modelos.Equipe;
import jogo.modelos.Partida;
import jogo.repositorio.Repositorio;

public class Principal {

	public static void main(String[] args) {
		
		ControladorPartidas cp  = new ControladorPartidas();
		
		//Equipe e1 = new Equipe(1,"ceará");
		//System.out.println(e1.toString());
			
		Equipe e1, e2;

		
		int opcao;
		Scanner in = new Scanner(System.in);
		boolean terminar = false;
		
		do {
			System.out.println("-------------------------------");
			
			System.out.println("| 1 - Criar uma Partida");
			
//			System.out.println("| 2 - Editar uma Partida");
//			
//			System.out.println("| 3 - Remover uma Partida");
			
			System.out.println("| 4 - Listar Todas as Partidas");
			
			System.out.println("| 0 - Sair");
			
			System.out.println("-------------------------------");
			
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			
			case 1:
				
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
				
				e1 = new Equipe(idEquipe, nomeEquipe1);
				
				Partida aux = new Partida(null, null, e1, 
						null, "", "");
				
				
				if(cp.criarPartida(null, null, e1, null, "", "")) {
					System.out.println("\n\t|Partida Adicionada|\n");
				}else {
					System.err.println("\n\t|Ocorreu um erro ao adicionar a Equipe|\n");
				}
				break;
				
				case 4:
					System.out.println("Lista de Partidas do Repositorio");
					cp.exibirPartidas();
					
			
				break;
				
				default:
					terminar = true;
					break;

			}
		}while(!terminar);
	}
	
}
