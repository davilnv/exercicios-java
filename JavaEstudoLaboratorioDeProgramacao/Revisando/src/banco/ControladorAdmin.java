package banco;

import java.util.Scanner;

public class ControladorAdmin {
	public void iniciarAdmin() {
		Scanner teclado = new Scanner(System.in);
		int op = 999;
		Menu menu = new Menu();
		while (op != 0) {
			menu.mostrarMenuAdmin();
			System.out.println("Escolha uma opção: ");
			op = teclado.nextInt();
			if (op == 1) {
				System.out.println("Qual tipo de conta deseja criar?\n[1 - Conta Corrente ou 2 - Conta Poupança]");
				int opc = teclado.nextInt();
				if (opc == 1) {
					ContaCorrente contaCorrente = new ContaCorrente();
					System.out.print("Agencia: ");
					int agencia = teclado.nextInt();
					System.out.print("Número de Conta: ");
					int numeroConta = teclado.nextInt();
					System.out.print("Nome do Titular da Conta: ");
					String nome = teclado.next();
					System.out.print("CPF: ");
					String cpf = teclado.next();
					contaCorrente.setAgencia(agencia);
					contaCorrente.setNumeroConta(numeroConta);
					contaCorrente.setNome(nome);
					contaCorrente.setCpf(cpf);
					System.out.println("A conta corrente de " + nome + " foi cadastrada com sucesso!");
				} else if (opc == 2) {
					ContaPoupanca contaPoupanca = new ContaPoupanca();
					System.out.print("Agencia: ");
					int agencia = teclado.nextInt();
					System.out.print("Número de Conta: ");
					int numeroConta = teclado.nextInt();
					System.out.print("Nome do Titular da Conta: ");
					String nome = teclado.next();
					System.out.print("Agencia: ");
					String cpf = teclado.next();
					contaPoupanca.setAgencia(agencia);
					contaPoupanca.setNumeroConta(numeroConta);
					contaPoupanca.setNome(nome);
					contaPoupanca.setCpf(cpf);
					System.out.println("A conta poupança de " + nome + " foi cadastrada com sucesso!");
				} else {
					System.out.println("Opção Inválida");
				}
			} else if (op == 2) {
				System.out.println("Teste 2");
			}
		}
		teclado.close();
	}
}
