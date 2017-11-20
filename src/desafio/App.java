package desafio;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		FilaSequencialEncadeada normais = new FilaSequencialEncadeada();
		FilaSequencialEncadeada prioritarios = new FilaSequencialEncadeada();
		FilaSequencialEncadeada retiradas = new FilaSequencialEncadeada();

		int opcao = 0;
		do {
			opcao = Integer.parseInt((String) JOptionPane.showInputDialog(null,
					"Cartório Muller & Freitas\n\n1 - Registrar Novo Cliente\n2 - Chamar Cliente\n3 - Retirar documento\n4 - Sair\n ",
					"Cartório", JOptionPane.INFORMATION_MESSAGE, Icons.getHome(), null, null));
			switch (opcao) {
			case 1:
				Pessoa cliente = cadastraCliente();
				if (cliente.isPrioritario()) {
					prioritarios.enqueue(cliente);
				} else {
					normais.enqueue(cliente);
				}
				break;
			case 2:
				if (!prioritarios.isEmpty()) {
					Pessoa chamado = prioritarios.dequeue().dado;
					JOptionPane.showMessageDialog(null, chamado.getNome() + "\n\nTipo: PRIORITARIO", "Chamar Pessoa",
							JOptionPane.INFORMATION_MESSAGE, Icons.getUser());
					
					retiradas.enqueue(chamado);
				}else if(!normais.isEmpty()){
					Pessoa chamado = normais.dequeue().dado;
					JOptionPane.showMessageDialog(null, chamado.getNome() + "\n\nTipo: NORMAL", "Chamar Pessoa",
							JOptionPane.INFORMATION_MESSAGE, Icons.getUser());
					
					retiradas.enqueue(chamado);
				}else {
					JOptionPane.showMessageDialog(null, "Ninguém para Chamar", "Chamar Pessoa",
							JOptionPane.INFORMATION_MESSAGE, Icons.getUser());
				}
				break;
			case 3:
				if (!retiradas.isEmpty()) {
					Pessoa chamado = retiradas.dequeue().dado;
					JOptionPane.showMessageDialog(null, chamado.getNome(), "Retirar Documento",
							JOptionPane.INFORMATION_MESSAGE, Icons.getDocumento());
				}else {
					JOptionPane.showMessageDialog(null, "Ninguém para Chamar", "Retirar Documento",
							JOptionPane.INFORMATION_MESSAGE, Icons.getDocumento());
				}
				break;
			default:
				break;
			}

		} while (opcao != 4);

		// while (!minhaFila.isEmpty()) {
		// System.out.print(minhaFila.dequeue());
		// System.out.println(" Total: "+minhaFila.size());
		// }
	}

	public static Pessoa cadastraCliente() {
		String nome = (String) JOptionPane.showInputDialog(null, "Informe o Nome: ", "Registro de Cliente",
				JOptionPane.INFORMATION_MESSAGE,Icons.getUser(), null, null);

		String preferencialResposta = (String) JOptionPane.showInputDialog(null, "Cliente Preferencial?\nSim\nNão",
				"Registro de Cliente", JOptionPane.INFORMATION_MESSAGE, Icons.getUser(), null, null);

		boolean preferencial = (preferencialResposta.toLowerCase().contains("sim")) ? true : false;

		return new Pessoa(nome.toUpperCase(), preferencial);
	}
}
