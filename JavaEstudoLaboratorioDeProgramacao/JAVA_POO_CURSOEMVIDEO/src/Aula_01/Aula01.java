package Aula_01;

public class Aula01 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.modelo = "BIC";
		c2.cor = "Vermelha";
		c2.carga = 60;
		c2.ponta = 0.7f;
		c2.status();
		c2.rabiscar();
		System.out.println("");
		c2.destampar();
		c2.status();
		c2.rabiscar();
		System.out.println();
		
		Carro carro1 = new Carro();
		carro1.nome = "Celta";
		carro1.ano = 2010;
		carro1.cor = "Preto";
		carro1.modelo = "1.0 com AR";
		carro1.ativacao = false;
		carro1.status();
		System.out.println();
		carro1.ligar();
		carro1.status();
		carro1.andar();
		System.out.println();
		
		ControleTV controle = new ControleTV();
		controle.numeroCanal = 1;
		controle.volume = 10;
		controle.situacao = true;
		controle.status();
		
	}
}
