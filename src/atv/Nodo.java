package atv;

public class Nodo {
	protected String dado;
	protected Nodo proximo;
	
	public Nodo(String dado){
		this.dado = dado;
	}
	
	public String toString(){
		return "Dado: "+dado;
	}
}
