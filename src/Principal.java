
public class Principal {

	public static void main(String[] args) {

		
		//Instaciada fila com tamanho máximo de 100 posições
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
		A classe Numero, presente neste projeto, pré-estabelece um vetor com 60 valores inteiros.
		Seu desafio é o seguinte:
		
		1-Percorrer o vetor, colocando cada um dos números na filaResultado
		2-PORÉM... No momento em que o valor encontrado for o -1, após isso seu código deverá também, remover da fila a quantidade de elementos que este valor representa, ou seja, após -1, se aparecer um valor 3, vocë deverá adiciona-lo ao
		final da fila, mas também precisará remover 3 elementos do começo da fila.
		
		SUA MISSÃO: Descobrir qual o valor que esvaziou a fila totalmente. Informe também a posição em que este valor estava no vetor.		
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
				System.out.println("Index após o -1: "+(i-index));
				System.out.println("Index no vetor Total: "+i);
				break;
			}
			
			
		}
		
		
	}

}
