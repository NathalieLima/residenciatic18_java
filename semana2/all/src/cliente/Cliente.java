package cliente;

import java.util.Scanner;

public class Cliente 
{
	private String nome, cpf;
	private int idade;
	
	public Cliente(String _nome, String _cpf) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.idade = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu CPF: ");
		String cpf = entrada.nextLine();
		
		Cliente meu_cliente = new Cliente(nome, cpf);
		
		System.out.println("Nome: " + meu_cliente.getNome() + " | CPF: " + meu_cliente.getCpf());
		
		System.out.println("ALTERAÇÃO DE DADOS");
		
		System.out.println("Digite outro nome: ");
		String nome2 = entrada.nextLine();
		
		System.out.println("Digite outro CPF: ");
		String cpf2 = entrada.nextLine();
		
		//System.out.println("Digite outra idade: ");
		//String idade = entrada.nextLine();
		
		meu_cliente.setCpf(cpf2);
		meu_cliente.setNome(nome2);
		//meu_cliente.setIdade(idade);
		
		System.out.println("Nome: " + meu_cliente.getNome() + " | CPF: " + meu_cliente.getCpf());
	}
}


