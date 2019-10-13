package Aula_02;

public class Aula02 {
	public static void main(String[] args) {
		CanetaVisibilidade caneta = new CanetaVisibilidade();
		caneta.modelo = "BIC Cristal";
		caneta.cor = "Azul";
		// caneta.ponta = 0.5f; // Da erro pois ponta é privado
		caneta.setPonta(0.5f); // Agora eu consigo alterar
		caneta.carga = 40; // Acesso protegido mas funciona
		caneta.tampada = true; // Acesso protegido
		caneta.status();
	}
}
