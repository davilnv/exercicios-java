package Aula_10;

public class Ave extends Animal{
	private String corPena;
	
	public Ave(float p, int i, int m) {
		super(p, i, m);
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando!");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo sementes");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de Ave");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
