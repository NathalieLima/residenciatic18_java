package calculadora;

import java.util.Scanner;

public class Maioridade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		
		int idade = entrada.nextInt();
		
		System.out.println("Você " + (idade >= 18 ? "é" : "não é") + " maior de idade.");
	}
}
