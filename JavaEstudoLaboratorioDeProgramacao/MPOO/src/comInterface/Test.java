package comInterface;

public class Test {
	public static void main(String[] args) {
		Caixa a = new Funcionario("Davi", 12457, 0, 1457.36);
		Gerente b = new Funcionario("Rico", "001-G", 1, 3214.60);
		a.getInfoFuncao();
		b.getInfoFuncao();
	}
}
