package Banco;

public class Main {
	public static void main(String[] args) {
		BancoDeDados dados = new BancoDeDados();
		Conta conta1 = new Conta();
		conta1.setNome("Davi");
		conta1.setIdade(20);
		dados.salvarConta(conta1);
		Conta conta2 = new Conta();
		conta2.setNome("Jess");
		conta2.setIdade(18);
		dados.salvarConta(conta2);
		for (int i=0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
}
