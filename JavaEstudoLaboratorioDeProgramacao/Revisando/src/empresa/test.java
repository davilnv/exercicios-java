package empresa;

public class test {
	public static void main(String[] args) {
		Funcionario func;
		func = new Funcionario("Davi", 20, "1234", 1234.5f);
		Editor editor = new Editor();
		editor.setNome("Davi L.");
		editor.setIdade(20);
		editor.setCpf("12345678911");
		editor.setSalario(4525.7f);
		System.out.println(func.toString());
		System.out.println(editor.toString());
	}
}
