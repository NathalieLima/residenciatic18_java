package exc2;

import java.util.Scanner;

public class ConvertorTemperatura {
	public static void main(String[] args) {
		double temperatura, resultado;
		int unidade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura: ");
		temperatura = entrada.nextDouble();
		
		System.out.println("Insira a unidade de origem, com 1 para Fahrenheit e 2 para Celsius: ");
		unidade = entrada.nextInt();
		
		if (unidade == 1) {
			resultado = (temperatura * 9/5) + 32;
			
			System.out.println(temperatura + " Celsius equivalem a " + resultado + " Fahrenheit.");
		} 
		else 
			if (unidade == 2) {
				resultado = (temperatura - 32) / 1.8;
				
				System.out.println(temperatura + " Fahrenheit equivalem a " + resultado + " Celsius.");
			}
			else {
				System.out.println("Insira 1 ou 2 como unidade de origem.");
			}
	}
}
