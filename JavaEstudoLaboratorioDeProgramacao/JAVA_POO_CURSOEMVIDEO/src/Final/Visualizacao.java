package Final;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	public Visualizacao(Gafanhoto g, Video v) {
		this.setEspectador(g);
		this.setFilme(v);
		this.espectador.viuMaiUm();
		this.espectador.ganharExp();
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float port) {
		int tot = 0;
		if (port <= 20) {
			tot = 1;
		} else if (port <= 40) {
			tot = 2;
		} else if (port <= 60) {
			tot = 3;
		} else if (port <= 80) {
			tot = 4;
		} else if (port <= 100) {
			tot = 5;
		}
		this.filme.setAvaliacao(tot);
	}
	
	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + "\n" + filme + "	";
	}
	
}
