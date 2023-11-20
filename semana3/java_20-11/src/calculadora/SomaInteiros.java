package calculadora;

public class SomaInteiros {
	
	public static int somar(int _x, int _y) {
		return _x + _y;
	}
	
	
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 11;
		
		int soma = SomaInteiros.somar(x, y);
		System.out.println(soma);
	}
}
