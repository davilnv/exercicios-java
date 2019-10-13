package Aula_10;

public class Aula10 {
	public static void main(String[] args) {
		// Animal animal = new Animal(); da erro, pois Animal é abstrato
		Mamifero jumento = new Mamifero(50, 2, 4, "Cinza");
		jumento.emitirSom();
		Reptil calango = new Reptil(25, 4, 4, "Terra");
		calango.locomover();
		Tartaruga tartarugaMarinha = new Tartaruga(20, 20, 4, "Marrom");
		tartarugaMarinha.locomover();
		Cachorro cachorro = new Cachorro(30, 10, 4, "Preto");
		cachorro.reagir(cachorro.getIdade(), cachorro.getPeso());
	}
}
