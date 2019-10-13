package exercicio2;

public abstract class Eletronico {
	int consumo, voltagem;
	boolean status;
	
	public Eletronico(int consumo, int volt) {
		this.consumo = consumo;
		this.voltagem = volt;
		this.status = false;
	}
	
	public abstract void ligar();
	public abstract void desligar();
	
	public void isLigado() {
		if (this.status) {
			System.out.println("Está ligado!");
		} else {
			System.out.println("Está desligado!");
		}
	}
}
