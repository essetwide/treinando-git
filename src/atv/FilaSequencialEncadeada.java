package atv;

public class FilaSequencialEncadeada {
	
	//Diferente das demais estruturas que fizemos em aula, optei por usar um Integer nesta estrutura, para fazermos algumas atividades envolvendo n�muros.
	//Usei Integer ao inv�s de int, pois se usarmos int, o vetor vai ser automaticamente preenchido com 0 em todas as posi��es. Com Integer, o valor default ser� null.
	private Nodo primeiro;
	private int index;
	
	public FilaSequencialEncadeada() {
	}
	
	//enqueue(e): insere o elemento e no final da fila
	public void enqueue(String dado) {
		if (primeiro == null) {
			primeiro = new Nodo(dado);
			return;
		}
		
		Nodo aux = primeiro;
		
		while(aux.proximo != null){
			aux = aux.proximo;
		}
		
		aux.proximo = new Nodo(dado);
		
	}	
	
	//dequeue(): remove e retorna o elemento e do in�cio da fila, e retorna null se a fila estiver vazia
	public Nodo dequeue() {		
		if(primeiro == null) { return null; }
		else {
			Nodo retirado = primeiro;
			primeiro = primeiro.proximo;
			
			return retirado;
		}
	}	
	
	
	//head(): retorna, mas n�o remove, o primeiro elemento da fila, e retorna null se a fila estiver vazia
	public Nodo head() {
		if(primeiro == null) { return null; }
		else {
			return primeiro;
		}
	}
		
	//size(): retorna o n�mero de elementos da fila
	public int size() {
		int count = 0;
		
		Nodo aux = primeiro;
		while(aux != null){
			count++;
			aux = aux.proximo;
		}
		
		return count;
	}
	
	//isEmpty(): retorna true se a fila estiver vazia, e false caso contr�rio
	public boolean isEmpty() {
		if(primeiro == null) { return true; }
		else { return false; }
		//Poder�amos usar somente o comando abaixo. O retorno ser� a resposta da pergunta: se o index for igual a 0, ser� retornado true, sen�o, ser� retornado false.
		//return index == 0;
	}
	
	//clear(): esvazia a fila
	public void clear() {
		primeiro = null;
	}	
}
