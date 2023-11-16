package usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidade_de_postagens;
	private int pontuacao;
	
	public Usuario() {
		this.postagens = new ArrayList<String>();
		this.quantidade_de_postagens = 0;
		this.pontuacao = 0;
	}
	
	public Usuario(String _nome, String _email, String _nacionalidade) {
		this.nome = _nome;
		this.email = _email;
		this.nacionalidade = _nacionalidade;
		this.postagens = new ArrayList<String>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void adicionarPostagem(String post) {
		this.postagens.add(post);
	}
	
	public int getQtdElementos() {
		return this.postagens.size();
	}
	
	public int alterarPontuacao(int delta) {
		if ( (this.pontuacao + delta) < 0 ) {
			return 1;
		}
		else {
			this.pontuacao += delta;
			
			return 0;
		}
	}
	
	public void mostrarPostagens() {
		// n é maneira ideal, melhor é iterator
		
		for (int i = 0; i < this.postagens.size(); i++) {
			String post = this.postagens.get(i);
			System.out.println("Postagem número " + (i + 1) + post);
		}
	}
	
//	public static void main(String[] args) 
//	{
		// Primeiro main
//		Scanner ler = new Scanner(System.in);
//		String nome, email, nacionalidade;
//		Usuario usuario = new Usuario();
//		
//		System.out.println("Digite o nome do usuário: ");
//		nome = ler.nextLine();
//		
//		System.out.println("Digite o e-mail do usuário: ");
//		email = ler.nextLine();
//		
//		System.out.println("Digite a nacionalidade do usuário: ");
//		nacionalidade = ler.nextLine();
//		
//		usuario.setEmail(email);
//		usuario.setNacionalidade(nacionalidade);
//		usuario.setNome(nome);
//		
//		do {
//			String postagem = ler.nextLine();
//			usuario.adicionarPostagem(postagem);
//		} while ( usuario.getQtdElementos() < 3 );
//	}
	
	
	public static void main(String[] args) 
	{
		// Segundo main
		
		Scanner ler = new Scanner(System.in);
		String nome, email, nacionalidade, sn;
		Usuario usuario = new Usuario();
		ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
		
		do {
			System.out.println("Digite o nome do usuário: ");
			nome = ler.nextLine();
			
			System.out.println("Digite o e-mail do usuário: ");
			email = ler.nextLine();
			
			System.out.println("Digite a nacionalidade do usuário: ");
			nacionalidade = ler.nextLine();
			
			usuario.setEmail(email);
			usuario.setNacionalidade(nacionalidade);
			usuario.setNome(nome);
			
			do {
				String postagem = ler.nextLine();
				usuario.adicionarPostagem(postagem);
			} while ( usuario.getQtdElementos() < 3 );
			
			System.out.println("Postagens desse usuário: ");
			
			usuario.mostrarPostagens();
			lista_usuarios.add(usuario);
			
			System.out.println("Deseja adicionar mais um usuário?");
			sn = ler.nextLine();
		} while ( "s".equals(sn) );
	}
}
