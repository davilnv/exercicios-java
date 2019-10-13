package Aula_01;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada = true;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		String situacao;
		if (this.tampada == true) {
			situacao = "Sim, está tampada";
		} else {
			situacao = "Não, está destampada";
		}
		System.out.println("Está caneta etá tampada? " + situacao);
		System.out.println("Carga: " + this.carga + " %");
		System.out.println("A ponta desta caneta é tamanho: " + this.ponta);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
