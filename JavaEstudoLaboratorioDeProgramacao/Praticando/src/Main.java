
public class Main {
	public static void main(String[] args) {
		// Cadastrando Funcionário
		Funcionario funcionario = new Funcionario();
		FuncionarioLimpeza func1 = new FuncionarioLimpeza();
		func1.setNome("Davi");
		func1.setCpf("12345");
		func1.setIdade(20);
		func1.setSalario(900);
		funcionario.cadastrar(func1);
		System.out.println(func1.toString());
		
		
		// Cadastrando Produto
		Produto produto1 = new Produto();
		produto1.cadastrarProduto("Arroz", 2.5f, 300);
		Produto produto2 = new Produto();
		produto2.cadastrarProduto("feijao", 4.6f, 100);
		Produto produto3 = new Produto();
		produto3.cadastrarProduto("Cuzcuz", 1.5f, 100);
		System.out.println("Estoque do " + produto2.getNome() + ": " + produto2.getEstoque());
		// Fazendo Pedidos
		// -- Lista de Itens --
		Item item[] = new Item[3];
		item[0] = new Item(produto1, 2);
		item[1] = new Item(produto2, 3);
		item[2] = new Item(produto3, 2);
		// -- pedido usandi a lista de Itens --
		Pedido pedido1 = new Pedido();
		pedido1.fazerPedido(item);
		pedido1.pagar(item, "Cartão");
		System.out.println("Estoque do " + produto2.getNome() + ": " + produto2.getEstoque());
	}
}
