package calculadora;

import java.util.Scanner;

public class ConversaoTemperaturaV1 {
		public static double fahrParaCelsius(double _valor_fahr) {
			return (_valor_fahr - 32) / 1.8;
		}
		
		public static double celciusParaFahr(double _valor_celsius) {
			return (_valor_celsius * 9/5) + 32;
		}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Você prefere entrar com a temperatura em Fahrenheit (0) ou Celsius (1)? ");
		
		int opcao_usuario = entrada.nextInt();
		boolean tipo_conversao = opcao_usuario;
		
		System.out.println("Valor em : ");
		double valor_temperatura = entrada.nextDouble();
		
		
		if ( tipo_conversao ) {
			ConversaoTemperaturaV1.fahrParaCelsius(valor_temperatura);
		} 
		else {
			ConversaoTemperaturaV1.celciusParaFahr(valor_temperatura);
		}
		
		
	}
}
