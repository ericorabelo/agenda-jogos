package jogo.modelos;

public class Equipe {
	
	private int id;
	private static int cont = 0;
	
	private String nome;
	
	public Equipe() {
	
	}

	public Equipe(int id, String nome){
		//this.id = id;
		this.id = cont;
		cont++;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nome=" + nome + "]";
	}
		
}
