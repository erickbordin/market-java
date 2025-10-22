package desafioorientacao;

import java.util.Scanner;

public class ProgramTest {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá cliente!");
		System.out.print("Digite seu nome: ");
		Cliente cliente1 = new Cliente(entrada.nextLine());

		Scanner entrada1 = new Scanner(System.in);

		System.out.print("Quantas compras você fez? ");
		int resultCompras = entrada1.nextInt();

		switch (resultCompras) {
		case 1:
			Compra compra = new Compra();
			cliente1.addCompra(compra);

			Scanner entrada2 = new Scanner(System.in);
			System.out.print("Quantos itens você comprou? ");
			int qtdItens = entrada2.nextInt();

			switch (qtdItens) {
			case 1:
				Item item = new Item();
				Scanner nome = new Scanner(System.in);
				System.out.print("Qual produto é?: ");
				String nomeProduto = nome.nextLine();

				Scanner preco = new Scanner(System.in);
				System.out.print("Qual o preço?: ");
				double precoProduto = preco.nextDouble();

				Scanner unidade = new Scanner(System.in);
				System.out.print("Quantas unidades você comprou?: ");
				int quantidade = unidade.nextInt();
				compra.addItem(item);
				item.createProduto(new Produto(nomeProduto, precoProduto), quantidade);
				break;
				
			case 2:
				Item i1 = new Item();
				Scanner nome1 = new Scanner(System.in);
				System.out.print("Qual produto é?: ");
				String nomeProduto1 = nome1.nextLine();

				Scanner preco1 = new Scanner(System.in);
				System.out.print("Qual o preço?: ");
				double precoProduto1 = preco1.nextDouble();

				Scanner unidade1 = new Scanner(System.in);
				System.out.print("Quantas unidades você comprou?: ");
				int quantidade1 = unidade1.nextInt();
				compra.addItem(i1);
				i1.createProduto(new Produto(nomeProduto1, precoProduto1), quantidade1);
				
				System.out.println("\nAgora vamos para o Item 2... \n");
				
				Item i2 = new Item();
				Scanner nome2 = new Scanner(System.in);
				System.out.print("Qual produto é?: ");
				String nomeProduto2 = nome2.nextLine();

				Scanner preco2 = new Scanner(System.in);
				System.out.print("Qual o preço?: ");
				double precoProduto2 = preco2.nextDouble();

				Scanner unidade2 = new Scanner(System.in);
				System.out.print("Quantas unidades você comprou?: ");
				int quantidade2 = unidade2.nextInt();
				compra.addItem(i2);
				i2.createProduto(new Produto(nomeProduto2, precoProduto2), quantidade2);
				break;
				
				
			}

			break;
		case 2:
			Compra compra1 = new Compra();
			cliente1.addCompra(compra1);
			Scanner itensCompra1 = new Scanner(System.in);
			System.out.print("Quantos itens você comprou? ");
			int qtdItensCompra1 = itensCompra1.nextInt();
			
			Compra compra2 = new Compra();
			cliente1.addCompra(compra2);

			break;

		}

		entrada.close();

		entrada1.close();

		System.out.println(cliente1.toString());

	}
}
