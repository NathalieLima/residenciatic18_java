package exc1;

import java.util.Scanner;

public class ConversorMoedas {
	public static void main(String[] args) 
	{
		double taxa_cambio, quantidade_dolares;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Taxa de câmbio: ");
		taxa_cambio = entrada.nextDouble();
		
		System.out.print("Quantidade de dólares: ");
		quantidade_dolares = entrada.nextDouble();
		
		System.out.println("Convertendo " + quantidade_dolares + " para a taxa de câmbio " + taxa_cambio + ", tem-se: " + quantidade_dolares * taxa_cambio + " dólares.");
	}
}
