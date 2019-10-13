package supermercado;

public class Item {
	private Produto produto;
	private int quantidade;
	
	public Item(Produto produto, int quant) {
		this.setProduto(produto);
		this.setQuantidade(quant);
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
