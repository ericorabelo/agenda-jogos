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
		
		System.out.println("| 2 - Editar uma Partida");
		
		System.out.println("| 3 - Remover uma Partida");
		
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
					editarPartida();
				}else if(opcao == 3) {
					apagarPartida();
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
	
	
	
	public void adicionarEquipe() {		
		try {
			
			Scanner in = new Scanner(System.in);
			
			String nomeEquipe1, nomeEquipe2, campeonato, responsavelPelaTransmissao;
			
			LocalDate dataDaPartida = null; 
			LocalTime hora = null; 
			
			
			//equipe1		
			System.out.println("\tDigite o nomeEquipe1");
			nomeEquipe1 = in.nextLine();
			
			//equipe2		
			System.out.println("\tDigite o nomeEquipe2");
			nomeEquipe2 = in.nextLine();
			
			//partida
			System.out.println("\tDigite o campeonato");
			campeonato = in.nextLine();
			
			System.out.println("\tDigite o responsavelPelaTransmissao");
			responsavelPelaTransmissao = in.nextLine();
			
			//ler dataDaPartida; 
			//ler hora; 
			
			Equipe e1 = new Equipe(nomeEquipe1);
			Equipe e2 = new Equipe(nomeEquipe2);
						
			if(cp.criarPartida(dataDaPartida, hora, e1, e2, campeonato, responsavelPelaTransmissao)) {
				System.out.println("Partida adicionada com sucesso!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editarPartida() {	
	    try {
	    	
            Scanner in = new Scanner(System.in);
            int id;
        
            String nomeEquipe1, nomeEquipe2, campeonato, responsavelPelaTransmissao;
            
            LocalDate dataDaPartida = null; 
			LocalTime hora = null; 
            
            System.out.println("Digite o ID da partida que deseja editar: ");
            id = in.nextInt();
            in.nextLine();

            System.out.println("Digite as Informações que deseja mudar");
            
            //equipe1		
			System.out.println("\tDigite o nomeEquipe1");
			nomeEquipe1 = in.nextLine();
			
			//equipe2		
			System.out.println("\tDigite o nomeEquipe2");
			nomeEquipe2 = in.nextLine();
			
			//partida
			System.out.println("\tDigite o campeonato");
			campeonato = in.nextLine();
			
			System.out.println("\tDigite o responsavelPelaTransmissao");
			responsavelPelaTransmissao = in.nextLine();

			Equipe e1 = new Equipe(nomeEquipe1);
			Equipe e2 = new Equipe(nomeEquipe2);
			
			
			Partida p = new Partida(dataDaPartida, hora, e1, e2, campeonato, responsavelPelaTransmissao);
			p.setId(id);
			
            cp.atualizarPartida(p);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
	public void apagarPartida() {	
		
		 Scanner in = new Scanner(System.in);
		 int id;
			
		 System.out.println("Digite id da Partida que deseja apagar ");
		 id= in.nextInt();
		 in.nextLine();

		 cp.apagar(id);
	}
	
	public void ListarEquipes() {
		
		System.out.println("Lista de Partidas do Repositorio");
		
		for (Partida partida : cp.exibirPartidas()) {
			System.out.println(partida.toString());
		}
		
	}
	
}
