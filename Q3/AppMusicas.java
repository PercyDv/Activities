package Q3;

import java.util.Scanner;

public class AppMusicas {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ListaEncadeada lista = new ListaEncadeada();
		AppMusicas app = new AppMusicas();

		String menu = """
				==== Menu ====
				1. Adicionar
				2. Verificar Tamanho
				3. Listar
				0. Encerrar Programa
				==============
				 """;
		int op;

		do {
			System.out.println(menu);
			op = kb.nextInt();

			switch (op) {
			case 1:
				System.out.println("Você tem os seguintes Professores adicionados: ");

				app.addMusicas(lista);
				while (lista.temProximo()) {
					System.out.println(lista.getPosicaoAtual().getValor().getNomeDaMusica());
				}

				break;
			case 2:
				System.out.println("Tamanho da lista: "+lista.verificarTamanho());
				break;
			case 3:
				lista.listarRegistros();
				break;
			default: System.out.println("Sistema Encerrado");
				break;
			}

		} while (op != 0);
		kb.close();
	}

	public void addMusicas(ListaEncadeada listaEncadeada) {
		Musicas musica1 = new Musicas("Like Him");
		Musicas musica2 = new Musicas("505");
		Musicas musica3 = new Musicas("Pink White");
		Musicas musica4 = new Musicas("Quem Sabe");

		listaEncadeada.adicionar(musica1);
		listaEncadeada.adicionar(musica2);
		listaEncadeada.adicionar(musica3);
		listaEncadeada.adicionar(musica4);
	}

}
