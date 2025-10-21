package desafioorientacao;

import java.util.ArrayList;

public class Cliente {
	String nome;
	
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	@Override
	public String toString() {
		double valor = 0;
		for(Compra compra : compras) {
			valor += compra.getTotalValue();
		}
		return "O "+nome+" gastou "+valor;
	}
}
