package supermercado;

public class Produto {
	private String tipo;
	private float preco;
	private int quantEstoque;
	public Produto(String tipo, float preco, int quant){
		this.setTipo(tipo);
		this.setPreco(preco);
		this.setQuantEstoque(quant);
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPreco(){
		return this.preco;
	}
	public void setPreco(float preco){
		this.preco = preco;
	}
	public int getQuantEstoque() {
		return this.quantEstoque;
	}
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
}
