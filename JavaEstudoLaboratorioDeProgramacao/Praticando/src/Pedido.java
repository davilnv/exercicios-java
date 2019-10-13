
public class Pedido {
	public void fazerPedido(Item[] item) {
		System.out.println("Lista de Itens");
		for (Item valor : item) {
			System.out.println("Nome: " + valor.getProduto().getNome() + 
					" - Quantidade: " + valor.getQuantidade());
		}
		System.out.println("Pedido feito com sucesso!");
	}
	
	public void pagar(Item[] item, String meioPagamento) {
		float preco;
		float total = 0;
		for (Item valor: item) {
			preco = valor.getProduto().getPreco() * valor.getQuantidade();
			total += preco;
			valor.getProduto().reduzirEstoque(valor.getQuantidade());
		}
		System.out.println("Meio de pagamento: " + meioPagamento + " - Total: R$ " + total);
		System.out.println("Pagamento realizado!");
	}
	
	public void pagar(Item[] item, String pagamentoCartao, int parcelas) {
		if (pagamentoCartao == "Cartão") {
			float preco;
			float total = 0;
			for (Item valor: item) {
				preco = valor.getProduto().getPreco() * valor.getQuantidade();
				total += preco;
			}
			total = total / parcelas;
			System.out.println("Meio de pagamento: " + pagamentoCartao + 
					" - Pagamento: " + parcelas + " x R$ " + total);
			System.out.println("Pagamento realizado!");
		}
	}
}
