package Aula_04;

public class Aula04 {
	public static void main(String[] args) {
		/*
		// Minha Conta
		Conta conta = new Conta(123, "cp", "Davi Lima");
		conta.abrirConta(123);
		conta.status();
		conta.sacar(50);
		conta.status();
		conta.depositar(200);
		conta.status();
		conta.pagarMensal();
		conta.status();
		*/
		
		// ContaResposta - Vídeo Aula
		ContaResposta p1 = new ContaResposta();
		p1.setNumConta(123);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
		
		ContaResposta p2 = new ContaResposta();
		p2.setNumConta(456);
		p2.setDono("Creuza");
		p2.abrirConta("cp");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}
}
