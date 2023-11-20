package calculadora;

import java.util.Scanner;

public class Paridade {
	public static boolean verificar(int _x) {
		return _x % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número inteiro: ");
		
		int x = entrada.nextInt();
		boolean is_par = Paridade.verificar(x);
		
		System.out.println("Este número é " + (is_par ? "par" : "ímpar"));
	}
}
