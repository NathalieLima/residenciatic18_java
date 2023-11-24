package exc1;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) 
	{
		int num1, num2, operacao, resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira dois números: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		System.out.println("Agora escolha uma das operações a seguir: \n"
				+ "1 - Adição \n"
				+ "2 - Subtração \n"
				+ "3 - Multiplicação \n"
				+ "4 - Divisão \n\n"
				+ "Operação: ");
		operacao = entrada.nextInt();
		
		if ( operacao == 1 ) {
			resultado = num1 + num2;
			
			System.out.println("Adição entre " + num1 + " e " + num2 + ": " + resultado);
		}
		else 
			if ( operacao == 2 ) {
				resultado = num1 - num2;
				
				System.out.println("Subtração entre " + num1 + " e " + num2 + ": " + resultado);
			}
			else 
				if ( operacao == 3 ) {
					resultado = num1 * num2;
					
					System.out.println("Multiplicação entre " + num1 + " e " + num2 + ": " + resultado);
				}
				else 
					if ( operacao == 4 ) {
						resultado = num1 / num2;
						
						System.out.println("Divisão entre " + num1 + " e " + num2 + ": " + resultado);
					}
					else {
						System.out.println("Insira um número entre 1 e 4.");
					}
	}
}
