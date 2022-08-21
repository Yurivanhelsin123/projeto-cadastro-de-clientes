package projetocadastrarClientes.br.com;

import java.util.Scanner;

public class Cadastrodeclientes {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		MeusClientes n = new MeusClientes();
		boolean rodando = true;

		while (rodando) {

			System.out.println("Escolha uma opcao");
			System.out.println("1-PARA CADASTRAR CLIENTE");
			System.out.println("2-PARA LISTAR CLIENTE");
			System.out.println("3-PARA BUSCAR CLIENTE");
			System.out.println("4-PARA ATUALIZAR CLIENTE");
			System.out.println("5-PARA REMOVER CLIENTE");
			System.out.println("6-SAIR");

			Integer opcao = dados.nextInt();

			switch (opcao) {

			case 1:
				n.cadastrarUser();

				break;

			case 2:
				n.ListarClientes();
				break;
			case 3:
				n.BuscarCliente();

				break;
			case 4:
				break;
			case 5:
				break;
			case 6:

				rodando = false;
				System.out.println("vc saiu do sistema");

				break;

			default:
				System.out.println(" opção inválida");

				break;

			}

		}

	}

}


