package calculadora;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void montarMenu() {
		System.out.println("A-adição \n S-subtração \n M-multiplicação \n D-divisão");
	}
	
	public static int somar(int _x, int _y) {
		return _x + _y;
	}
	
	public static int somar(int _x, int _y) {
		return _x + _y;
	}
	
	public static int somar(int _x, int _y) {
		return _x + _y;
	}
	
	public static int somar(int _x, int _y) {
		return _x + _y;
	}
	
	public static void main(String[] args) {
		int x, y;
		String opcao_usuario;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		x = entrada.nextInt();
		
		System.out.println("Segundo número: ");
		y = entrada.nextInt();
		
		CalculadoraSimples.montarMenu();
		
		System.out.println("Escolha uma opção: ");
		opcao_usuario = entrada.nextLine();
		
		
		
	}
}
