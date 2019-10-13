package Aula_01;

public class Carro {
	String nome;
	int ano;
	String modelo;
	String cor;
	boolean ativacao;
	void status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano: " + this.ano);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		String situacao;
		if (this.ativacao == true) {
			situacao = "ligado";
		} else {
			situacao = "desligado";
		}
		System.out.println("O carro está " + situacao);
	}
	void ligar() {
		this.ativacao = true;
	}
	
	void desligar() {
		this.ativacao = false;
	}
	
	void andar() {
		if (this.ativacao == true) {
			System.out.println("O carro está andando...");
		} else {
			System.out.println("O carro está desligado, ligue para fazer-lo andar!");
		}
	}
}
