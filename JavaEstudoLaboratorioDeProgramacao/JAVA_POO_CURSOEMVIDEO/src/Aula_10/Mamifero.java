package Aula_10;

public class Mamifero extends Animal{
	private String corPelo; 
	public Mamifero(float p, int i, int m, String cor) {
		super(p, i, m);
		this.corPelo = cor;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamífero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
}
