
public class FilaSequencial {
	
	//Diferente das demais estruturas que fizemos em aula, optei por usar um Integer nesta estrutura, para fazermos algumas atividades envolvendo n�muros.
	//Usei Integer ao inv�s de int, pois se usarmos int, o vetor vai ser automaticamente preenchido com 0 em todas as posi��es. Com Integer, o valor default ser� null.
	private Integer fila[];
	private int index;
	
	public FilaSequencial(int tamanho) {
		fila = new Integer[tamanho];
		index = 0;
	}
	
	//enqueue(e): insere o elemento e no final da fila
	public void enqueue(int valor) {
		fila[index] = valor;
		index++;
	}	
	
	//dequeue(): remove e retorna o elemento e do in�cio da fila, e retorna null se a fila estiver vazia
	public Integer dequeue() {		
		if(index == 0) { return null; }
		else {
			Integer valorRetornado = fila[0];
			//devido ao fato de termos removido o primeiro, devemos reajustar o vetor, passando o segundo elemento
			//para o lugar do primeiro, o terceiro para o lugar do segundo, e assim por diante.
			for(int i=0;i<index;i++) {
				fila[i] = fila[i+1];
			}
			//� importante "limpar"o �ltimo elemento, lembrando que ao passarmos um valor de uma posi��o para outra
			//estamos apenas criando uma c�pia do valor, e colocando essa c�pia na posi��o anterior do vetor. 
			//Assim, os dois �ltimos conte[udos ficar�o duplicados.
			fila[index-1] = null;
			index--;
			return valorRetornado;
		}
	}	
	
	
	//head(): retorna, mas n�o remove, o primeiro elemento da fila, e retorna null se a fila estiver vazia
	public Integer head() {
		if(index == 0) { return null; }
		else {
			return fila[0];
		}
	}
		
	//size(): retorna o n�mero de elementos da fila
	public int size() {
		return index;
	}
	
	//isEmpty(): retorna true se a fila estiver vazia, e false caso contr�rio
	public boolean isEmpty() {
		if(index == 0) { return true; }
		else { return false; }
		//Poder�amos usar somente o comando abaixo. O retorno ser� a resposta da pergunta: se o index for igual a 0, ser� retornado true, sen�o, ser� retornado false.
		//return index == 0;
	}
	
	//clear(): esvazia a fila
	public void clear() {
		while(!isEmpty()) {
			dequeue();
		}
	}	
}
