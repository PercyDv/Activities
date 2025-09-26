package Q3;

public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	private int tamanho;

	public void adicionar(Musicas valor) {
		Celula celula = new Celula();
		celula.setValor(valor);

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		tamanho++;
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public int verificarTamanho() {
		return tamanho;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void listarRegistros() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
			return;
		}

		System.out.println("Professores do curso de Análise da UCSAL:");
		Celula atual = primeiro;
		int contador = 1;

		while (atual != null) {
			System.out.println(contador + ". " + atual.getValor());
			atual = atual.getProximo();
			contador++;
		}
	}
}
