package projetocadastrarClientes.br.com;

import java.util.ArrayList;
import java.util.Scanner;






public class MeusClientes {

	private String nomecompleto;
	private String cpf;
	private String email;
	private String contatos;
	private String endereco;

	ArrayList<MeusClientes> clientes = new ArrayList<>();
	Scanner cad = new Scanner(System.in);

	public MeusClientes() {
		super();
	}

	public MeusClientes(String nomecompleto, String cpf, String email, String contatos, String endereco) {
		super();
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.email = email;
		this.contatos = contatos;
		this.endereco = endereco;
	}

	public void cadastrarUser() {

		System.out.println("Digite o nome completo: ");
		String nomecompleto = cad.nextLine();
		
		
		
		
		
		
		
		
		
		System.out.println("Digite o Cpf: ");
		String cpf = cad.nextLine();
		System.out.println("Digite seu Email: ");
		String email = cad.nextLine();
		System.out.println("Digite o telefone para contato: ");
		String contatos = cad.nextLine();
		System.out.println("Digite o Endereço Completo: ");
		String endereco = cad.nextLine();


		if(nomecompleto.equals("")) {		
			
			System.out.println("Campos não preenchidos,não foi possível cadastrar,escolha a opção novamente");
		}else if (cpf.equals("") || cpf.length()< 11) {
			System.out.println("Campos não preenchidos,não foi possível cadastrar,escolha a opção novamente");
		}else if(email.equals("")) {
			System.out.println("Campos não preenchidos,não foi possível cadastrar,escolha a opção novamente");
		}else if(contatos.equals("")) {
			System.out.println("Campos não preenchidos,não foi possível cadastrar,escolha a opção novamente");
		}else if(endereco.equals("")) {
		System.out.println("Campos não preenchidos,não foi possível cadastrar,escolha a opção novamente");
		}else {
				
		
		MeusClientes n = new MeusClientes();

		n.setNomecompleto(nomecompleto);
		n.setCpf(cpf);
		
		n.setEmail(email);
		n.setContatos(contatos);
		n.setEndereco(endereco);
		clientes.add(n);

		System.out.println("cliente cadastrado com sucesso");
		}
	}

	public void ListarClientes() {

		System.out.println("Listagem de Clientes Cadastrados");
		for (int i = 0; i < clientes.size(); i++) {

			MeusClientes n1 = clientes.get(i);
			System.out.println("Clientes: " + i);
			System.out.println("Nome Completo : " + clientes.get(i).getNomecompleto());
			System.out.println("CPF: " + clientes.get(i).getCpf());
			System.out.println("Email: " + clientes.get(i).getEmail());
			System.out.println("Contatos: " + clientes.get(i).getContatos());
			System.out.println("Endereço: " + clientes.get(i).getEndereco());

		}

	}

	public void BuscarCliente() {

		System.out.println("Digite o Cpf que deseja buscar: ");
		String cpf = cad.nextLine();
		boolean achou = false;
		for (int i = 0; i < clientes.size(); i++) {

			MeusClientes u = clientes.get(i);
			if (cpf.equals(u.getCpf())) {
				System.out.println("Cliente encontrado");
				System.out.println("Nome Completo : " + u.getNomecompleto());
				System.out.println("Email: " + u.getEmail());
				System.out.println("Contatos: " + u.getContatos());
				System.out.println("Endereço: " + u.getEndereco());
				achou = true;

			}

		}

		if (!achou) {
			System.out.println("Não foi encontrado nenhum cliente com este cpf");
		}

	}

	public void atualizarCliente() {

	}

	public void removerCliente() {

	}

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
		
		
		
		
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContatos() {
		return contatos;
	}

	public void setContatos(String contatos) {
		this.contatos = contatos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
