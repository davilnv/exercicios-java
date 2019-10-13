import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Davi");
        func.setCpf("12345678911");
        func.setIdade(20);
        func.setSalario(1544.55f);
        func.cadastrar(func);
        System.out.println(func.toString());
        /*
        Gerente gerente = new Gerente();
        gerente.setNome("Geraldo");
        gerente.setCpf("12323221132");
        gerente.setIdade(35);
        gerente.setSalario(3232.4f);
        gerente.setAcesso("geraldo45");
        gerente.cadastrar(gerente);
        System.out.println(gerente.toString());

        OperadorDeCaixa operador = new OperadorDeCaixa();
        operador.setNome("José");
        operador.setCpf("78544221122");
        operador.setIdade(40);
        operador.setSalario(1022.65f);
        operador.setRegistroFinanceiro(4000);
        operador.cadastrar(operador);
        System.out.println(operador.toString());
         */

        Produto produto[] = new Produto[3];
        produto[0] = new Produto();
        produto[0].setNome("Feijão");
        produto[0].setEstoque(2000);
        produto[0].setPreco(4.65f);
        produto[1] = new Produto();
        produto[1].setNome("Arroz");
        produto[1].setEstoque(1000);
        produto[1].setPreco(2.55f);
        produto[2] = new Produto();
        produto[2].setNome("Café");
        produto[2].setEstoque(500);
        produto[2].setPreco(5.45f);

        ArrayList<Item> itens = new ArrayList<>();
        Item item[] = new Item[3];
        item[0] = new Item();
        item[0].setProduto(produto[0]);
        item[0].setQuantidade(2);
        item[1] = new Item();
        item[1].setProduto(produto[1]);
        item[1].setQuantidade(4);
        item[2] = new Item();
        item[2].setProduto(produto[2]);
        item[2].setQuantidade(5);

        itens.add(item[0]);
        itens.add(item[1]);
        itens.add(item[2]);

        Pedido pedido1 = new Pedido(itens);
        pedido1.mostrarEstoque();
        pedido1.cadastrar(pedido1);
        pedido1.mostrar();
        pedido1.pagar(1234, 2);
        pedido1.mostrarEstoque();
    }
}
