package Aula_02;

public class CanetaVisibilidade {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + this.tampada);
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! A caneta esta tampada");
		} else {
			System.out.println("Pode rabiscar!");
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
}
