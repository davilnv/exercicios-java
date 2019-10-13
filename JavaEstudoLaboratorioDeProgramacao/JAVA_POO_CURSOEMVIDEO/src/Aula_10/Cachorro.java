package Aula_10;

public class Cachorro extends Mamifero{

	public Cachorro(float p, int i, int m, String cor) {
		super(p, i, m, cor);
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando Osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	
	public void reagir(String frase) {
		if (frase == "olá" || frase == "quer um petisco?") {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir!");
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
}
