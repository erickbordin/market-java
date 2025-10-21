package desafioorientacao;

import java.util.ArrayList;

public class Compra {
	
	double somar;
	Item item;

	ArrayList<Item> itens = new ArrayList<>();

	void addItem(Item i) {
		itens.add(i);
	}

	double getTotalValue() {
		double somar = 0;
		for(Item x : itens) {
			somar += x.produto.preco * x.quantidade;
		}
		return somar;
	}
}
