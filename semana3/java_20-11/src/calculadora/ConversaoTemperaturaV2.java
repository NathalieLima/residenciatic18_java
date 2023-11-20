package calculadora;

import java.util.Scanner;

public class ConversaoTemperaturaV2 {
		public static double celciusParaFahr(int _valor_celsius) {
			return (_valor_celsius * 9/5) + 32;
		}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a temperatura em Celsius: ");
		
		int x = entrada.nextInt();
		
	}
}
