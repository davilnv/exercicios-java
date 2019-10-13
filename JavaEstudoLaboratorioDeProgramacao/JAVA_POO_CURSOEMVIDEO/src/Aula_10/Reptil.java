package Aula_10;

public class Reptil extends Animal{
	private String corEscama;

	public Reptil(float p, int i, int m, String cor) {
		super(p, i, m);
		this.setCorEscama(cor);
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de Réptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
