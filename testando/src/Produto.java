public class Produto {
    private String nome;
    private float preco;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, float preco, int estoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public void diminuirEstoque(int quantidade) {
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
