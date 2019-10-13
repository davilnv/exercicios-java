
public class Produto {
	private String nome;
	private float preco;
	private int estoque;
	
	public void cadastrarProduto(String nome, float preco, int estoque) {
		this.setNome(nome);
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void reduzirEstoque(int quantidade) {
		this.estoque = this.estoque - quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
