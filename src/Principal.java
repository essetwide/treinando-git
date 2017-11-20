
public class Principal {

	public static void main(String[] args) {

		
		//Instaciada fila com tamanho m�ximo de 100 posi��es
		FilaSequencial minhaFila = new FilaSequencial(100);
		
		//adicionando itens na fila
		minhaFila.enqueue(5);
		minhaFila.enqueue(10);
		minhaFila.enqueue(15);
		minhaFila.enqueue(20);
		minhaFila.enqueue(25);
		minhaFila.enqueue(30);
		
		System.out.println("Primeiro da fila");
		System.out.println(minhaFila.head());
		
		System.out.println("Tamanho da Fila");
		System.out.println(minhaFila.size());
		
		System.out.println("Percorrendo a fila");
		while(!minhaFila.isEmpty()) {
			System.out.println(minhaFila.dequeue());
		}
		
		/*DESAFIO
		A classe Numero, presente neste projeto, pr�-estabelece um vetor com 60 valores inteiros.
		Seu desafio � o seguinte:
		
		1-Percorrer o vetor, colocando cada um dos n�meros na filaResultado
		2-POR�M... No momento em que o valor encontrado for o -1, ap�s isso seu c�digo dever� tamb�m, remover da fila a quantidade de elementos que este valor representa, ou seja, ap�s -1, se aparecer um valor 3, voc� dever� adiciona-lo ao
		final da fila, mas tamb�m precisar� remover 3 elementos do come�o da fila.
		
		SUA MISS�O: Descobrir qual o valor que esvaziou a fila totalmente. Informe tamb�m a posi��o em que este valor estava no vetor.		
		*/
		
		int valores[] = Numeros.getNumeros();
		FilaSequencial filaResultado = new FilaSequencial(60);
		int index = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i]==-1){
				index = i;
				break;
			}
			filaResultado.enqueue(valores[i]);
		}
		
		for (int i = index; i < valores.length; i++) {
			
			filaResultado.enqueue(valores[i]);
			
			for (int j = 0; j < valores[i]; j++) {
				filaResultado.dequeue();
			}
			
			if(filaResultado.size() == 0){
				System.out.println("Valor: "+valores[i]);
				System.out.println("Index ap�s o -1: "+(i-index));
				System.out.println("Index no vetor Total: "+i);
				break;
			}
			
			
		}
		
		
	}

}
