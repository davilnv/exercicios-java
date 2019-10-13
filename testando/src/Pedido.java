import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;

    public Pedido() {
    }

    public Pedido(ArrayList<Item> itens) {
        this.setItens(itens);
    }

    public void cadastrar(Pedido pedido) {
        Pedido pedido1 = new Pedido();
        pedido1.setItens(pedido.getItens());
        System.out.println("Pedido cadastrado com sucesso!");
        System.out.println();
    }

    public void mostrar() {
        float total = 0;
        System.out.println("Nome | Quantidade | Preço unit. | Preço Total ");
        for (Item elemento: itens) {
            total = total + (elemento.getProduto().getPreco() * elemento.getQuantidade());
            System.out.println(elemento.getProduto().getNome() + " | " + elemento.getQuantidade() +
                    " | " + elemento.getProduto().getPreco() + " |");
        }
        System.out.println("----------------------------------- R$ " + total);
        System.out.println();
    }

    public float total() {
        float total = 0;
        for (Item elemento: itens) {
            total = total + (elemento.getProduto().getPreco() * elemento.getQuantidade());
        }
        return total;
    }

    public void atualizarEstoque() {
        for (Item item: itens) {
            item.getProduto().diminuirEstoque(item.getQuantidade());
        }
    }

    public void pagar(float valor) {
        if (valor > this.total()) {
            System.out.println("O valor total a ser pago é R$ " + this.total());
            System.out.println("Pagamento realizado, seu troco é de R$ " + (valor - this.total()));
            this.atualizarEstoque();
        } else if (valor == this.total()) {
            System.out.println("O valor total a ser pago é R$ " + this.total());
            System.out.println("Pagamento realizado com sucesso!");
            this.atualizarEstoque();
        } else {
            System.out.println("O valor é inferior ao total a ser pago, impossivel realizar pagamento");
        }
        System.out.println();
    }

    public void pagar(float valorCheque, int tempo) {
        if (valorCheque == this.total()) {
            System.out.println("O valor total a ser pago é R$ " + this.total());
            System.out.println("Pagamento realizado com cheque tem " + tempo + " dias para receber");
            this.atualizarEstoque();
        } else if (valorCheque < this.total() || valorCheque > this.total()) {
            System.out.println("Pagamento não pode ser realizado");
        }
        System.out.println();
    }

    public void pagar(int senha, int parcelas) {
        if (senha > 1111 && senha < 9999) {
            System.out.println("O valor total a ser pago é R$ " + this.total());
            System.out.println("Pagamento realizado com o cartão em " + parcelas + " x" + " de R$ "
                    + (this.total()/parcelas));
            this.atualizarEstoque();
        } else {
            System.out.println("Pagamento não pode ser realizado");
        }
        System.out.println();
    }

    public void mostrarEstoque() {
        for (Item item : itens) {
            System.out.println("O produto " + item.getProduto().getNome() + " tem um estoque de "
                    + item.getProduto().getEstoque());
        }
        System.out.println();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
