package atv;

public class App {
	public static void main(String[] args) {
		
                System.out.println("Olá Mundo!");
            
                FilaSequencialEncadeada minhaFila = new FilaSequencialEncadeada();

		minhaFila.enqueue("Dale");
		minhaFila.enqueue("Time");
		minhaFila.enqueue("Banana");
		minhaFila.enqueue("Bolacha");
		minhaFila.enqueue("Refirgerante");
		minhaFila.enqueue("Casa");
		minhaFila.enqueue("Cavalo");
		minhaFila.enqueue("Amperagem");
		minhaFila.enqueue("Tempo");
		minhaFila.enqueue("Teclado");
		minhaFila.enqueue("Cinema");
		minhaFila.enqueue("Caixa");

		while (!minhaFila.isEmpty()) {
			System.out.print(minhaFila.dequeue());
			System.out.println("   Total: "+minhaFila.size());
		}
	}
}
