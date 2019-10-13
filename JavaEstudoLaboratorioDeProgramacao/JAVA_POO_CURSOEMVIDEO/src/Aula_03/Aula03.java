package Aula_03;

public class Aula03 {
	public static void main(String[] args) {
		//CanetaMetodosEpeciais
		CanetaMetodosEpeciais caneta = new CanetaMetodosEpeciais("BIC", "Preto", 0.5f);
		// Com a criação do construtor, fica mais acessivel
		/*
		caneta.setModelo("BIC");
		caneta.setCor("Azul");
		// caneta.ponta = 0.5f; // Não funciona, pois é privado
		caneta.setPonta(0.5f); // Alternativa para o erro de cima
		*/
		System.out.println("Tenho uma caneta " + caneta.getModelo());
		caneta.status();
	}
}
