package banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op = 999;
		Menu menu = new Menu();
		while (op != 0) {
			menu.menuPrincipal();
			System.out.println("Escolha uma opção: ");
			op = teclado.nextInt();
			if (op == 1) {
				ControladorAdmin controladorAdmin = new ControladorAdmin();
				controladorAdmin.iniciarAdmin();
			} else if (op == 2) {
				ControladorConta controladorConta = new ControladorConta();
				controladorConta.iniciarConta();
			}
		}
		teclado.close();
	}
}
