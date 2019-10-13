package exercicio1;

public class Test {
	public static void main(String[] args) {
		Racional homem = new Animal("Davi", 2, 1234);
		Irracional cachorro = new Animal("Nego", 4, true);
		Irracional homem1 = new Animal("Davi", 2, 1234);
		homem.getInfo();
		cachorro.getInfo();
		homem1.getInfo();
	}
}
