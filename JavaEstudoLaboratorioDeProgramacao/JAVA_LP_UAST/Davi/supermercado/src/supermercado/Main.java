package supermercado;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Produto carne = new Produto("carne", 30.50f, 100);
		Produto arroz = new Produto("arroz", 2.5f, 500);
		Item item1 = new Item(arroz, 2);
		Item item2 = new Item(carne, 3);
		ArrayList<Item> itens;
		itens.add(item1);
		itens.add(item2);
		Pedido pedido1 = new Pedido();
		pedido1.setProdutos(itens);
		
	}
}
