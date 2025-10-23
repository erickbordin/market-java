package desafioorientacao;

import java.util.Scanner;

public class ProgramTest{
	public static void main(String[] args) {

		String aux = "um";
		String before = "0 não  - 1 sim: ";
		String after = "0 pedir conta - 1 sim: ";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Olá cliente n* 485!");
		System.out.print("Por favor digite seu nome: ");
		String nomeCliente = entrada.nextLine();
		Cliente c1 = new Cliente(nomeCliente);

		while (true) {

			Compra compra = new Compra();

			while (true) {
				System.out.print("\nQuer comprar " + aux + " produto? " + before);
				int resposta = entrada.nextInt();

				if (resposta == 0) {
					break;
				} else if (resposta == 1) {
					before = after;
					aux = "outro";
					Item item = createProduto(entrada);
					compra.addItem(item);
				}
			}

			c1.addCompra(compra);
			System.out.println(c1.toString());
		}

	}

	public static Item createProduto(Scanner scanner) {
		Item item = new Item();

		System.out.print("Digite o nome do produto: ");
		String resposta = scanner.next();
		System.out.print("Digite o preço do produto: ");
		double preco = scanner.nextDouble();
		System.out.print("Digite a quantidade que comprou: ");
		int quantidade = scanner.nextInt();
		item.createProduto(new Produto(resposta, preco), quantidade);

		return item;
	}

}