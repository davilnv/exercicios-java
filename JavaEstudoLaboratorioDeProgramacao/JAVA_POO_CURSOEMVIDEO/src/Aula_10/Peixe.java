package Aula_10;

public class Peixe extends Animal{
	private String corEscama;
	
	public Peixe(float p, int i, int m, String cor) {
		super(p, i, m);
		this.corEscama = cor;
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo plantas marinhas");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de Peixe");
	}
	
	public String getCorEscama() {
		return this.corEscama;
	}
	public void setCorEscama(String cor) {
		this.corEscama = cor;
	}
}
