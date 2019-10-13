package banco;

public class Menu {
	
	public void menuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println(" 1 - Acesso ADMIN");
		System.out.println(" 2 - Acesso CONTAS ");
		System.out.println(" 0 - SAIR");
	}
	
	public void mostrarMenuAdmin() {
		System.out.println(" -- Menu ADMIN -- ");
		System.out.println(" 1 - Cadastrar conta");
		System.out.println(" 2 - Listar todos");
		System.out.println(" 0 - SAIR");
	}
	
	public void mostrarMenuConta() {
		System.out.println(" == Caixa Eletrônico == ");
		System.out.println(" 1 - SACAR");
		System.out.println(" 2 - DEPOSITAR");
		System.out.println(" 3 - TRANSFERIR");
		System.out.println(" 4 - SALDO");
		System.out.println(" 0 - SAIR");
	}
}
