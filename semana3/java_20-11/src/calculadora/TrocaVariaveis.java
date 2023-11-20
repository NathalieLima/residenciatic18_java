package calculadora;

public class TrocaVariaveis {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		int num3;
		int a = 25, b = 88;
		
		
		System.out.println("Valor A: " + num1 + " | Valor B: " + num2);
		System.out.println("Valor A: " + a + " | Valor B: " + b);
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
		System.out.println("Valor A: " + num1 + " | Valor B: " + num2);
		System.out.println("Valor A: " + a + " | Valor B: " + b);
		
		
	}
}
