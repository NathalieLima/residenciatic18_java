package calculadora;

import java.util.Scanner;

public class MediaPonderada {
	
	
	
	
	
	public static float somar(float _num1, float _num2, float _num3, int _peso1, int _peso2, int _peso3) {
		return (_num1 * _peso1 + _num2 * _peso2 + _num3 * _peso3) / (_peso1 + _peso2 + _peso3);
	}
	
	
	public static void main(String[] args) {
		float x, y, z;
		int peso1, peso2, peso3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		x = entrada.nextFloat();	
		
		System.out.println("Digite o primeiro peso: ");
		peso1 = entrada.nextInt();	
		
		System.out.println("Digite a segunda nota: ");
		y = entrada.nextFloat();	
		
		System.out.println("Digite o segundo peso: ");
		peso2 = entrada.nextInt();	
		
		System.out.println("Digite a terceira nota: ");
		z = entrada.nextFloat();	
		
		System.out.println("Digite o terceiro peso: ");
		peso3 = entrada.nextInt();	
		
		float soma = MediaPonderada.somar(x, y, z, peso1, peso2, peso3);
		System.out.println(soma);
	}
}