package banco;

import java.util.Scanner;

public class ControladorConta {
	public void iniciarConta() {
		Scanner teclado = new Scanner(System.in);
		int op = 999;
		Menu menu = new Menu();
		while (op != 0) {
			menu.mostrarMenuConta();
			System.out.println("Escolha uma opção: ");
			op = teclado.nextInt();
			if (op == 1) {
				System.out.println("Teste 1");
			} else if (op == 2) {
				System.out.println("Teste 2");
			}
		}
		teclado.close();
	}
}
