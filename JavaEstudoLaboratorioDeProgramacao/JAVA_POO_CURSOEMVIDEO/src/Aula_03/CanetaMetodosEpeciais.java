package Aula_03;

public class CanetaMetodosEpeciais {
	public String modelo;
	public String cor;
	private float ponta;
	private int carga;
	protected boolean tampada;
	
	public CanetaMetodosEpeciais(String m, String c, float p) { // Método Construtor
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.carga = 100;
		this.tampar();
	}
	public void status() {
		System.out.println("Informações da Caneta");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Esta caneta está tampada? " + this.tampada);
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return this.carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean getTampada() {
		return this.tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
	public void rabiscar( ) {
		if (this.tampada == true) {
			System.out.println("ERRO! A caneta está tampada!");
		} else {
			System.out.println("Pode rabiscar...");
		}
	}
}
