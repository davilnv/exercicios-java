package Aula_10;

public class Tartaruga extends Reptil{

	public Tartaruga(float p, int i, int m, String cor) {
		super(p, i, m, cor);
	}

	@Override
	public void locomover() {
		System.out.println("Andando lentamente");
	}
}
