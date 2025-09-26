package Q3;

public class Musicas {
	private String nomeDaMusica;

	public Musicas(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}

	public String getNomeDaMusica() {
		return nomeDaMusica;
	}

	public void setNomeDaMusica(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}

	@Override
	public String toString() {
		return "Musicas = " + nomeDaMusica;
	}
	
	
}
