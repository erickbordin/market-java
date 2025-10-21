package desafioorientacao;

public class ProgramTest {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("érick");
		Compra compra1 = new Compra();
		Item i1 = new Item();
		Item i2 = new Item();
		
		i1.createProduto(new Produto("Detergete", 5), 3);
		i2.createProduto(new Produto("Sabão", 17.50), 5);

		compra1.addItem(i1); 
		compra1.addItem(i2);
		cliente1.addCompra(compra1);
		compra1.getTotalValue();
		
		System.out.println(cliente1.toString());
		
		

	}
}
