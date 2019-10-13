package Aula_01;

public class ControleTV {
	boolean situacao;
	String nomeCanal;
	int numeroCanal;
	int volume;
	public void status() {
		System.out.println("Nome do canal: " + this.nomeCanal);
		System.out.println("Número do Canal: " + this.numeroCanal);
		System.out.println("Volume: "+ this.volume);
	}
	public boolean getSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public int getNumeroCanal() {
		return numeroCanal;
	}
	public void setNumeroCanal(int numeroCanal) {
		this.numeroCanal = numeroCanal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
