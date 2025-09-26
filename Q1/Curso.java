package Q1;

public class Curso implements ICurso {
	private String nomeDisciplina;
	private String nomeProf;
	private double media;
	
	public Curso(String nomeDisciplina, String nomeProf, double media) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProf = nomeProf;
		this.media = media;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public boolean adicionar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
