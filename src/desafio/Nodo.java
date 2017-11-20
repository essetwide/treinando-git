package desafio;

public class Nodo {
	protected Pessoa dado;
	protected Nodo proximo;
	
	public Nodo(Pessoa dado){
		this.dado = dado;
	}
	
	public String toString(){
		return "Dado: "+dado;
	}
}
