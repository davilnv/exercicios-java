package exercicio1;

public class Animal implements Racional, Irracional{
	private String nome;
	private int pernas;
	private boolean rabo;
	private int rg;
	
	public Animal(String n, int p, boolean r) {
		this.nome = n;
		this.pernas = p;
		this.rabo = r;
	}
	
	public Animal(String n, int p, int rg) {
		this.nome = n;
		this.pernas = p;
		this.rg = rg;
	}

	@Override
	public void latir() {
		System.out.println("Latindo");
	}

	@Override
	public void falar() {
		System.out.println("Falando");
	}

	@Override
	public void getInfo() {
		if (this.pernas == PERNAS) {
			this.falar();
		}
		if (this.pernas == PATAS) {
			this.latir();
		}
		
	}

	@Override
	public boolean getRabo() {
		return rabo;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getPernas() {
		return pernas;
	}

	@Override
	public int getRg() {
		return rg;
	}
}
