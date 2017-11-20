package desafio;

public class Pessoa {
	private String nome;
	private boolean prioritario;
	
	public Pessoa(String nome, boolean prioritario) {
		super();
		this.nome = nome;
		this.prioritario = prioritario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isPrioritario() {
		return prioritario;
	}
	
	public void setPrioritario(boolean prioritario) {
		this.prioritario = prioritario;
	}
	
	
	
	
}
