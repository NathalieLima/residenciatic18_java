package lista_numeros;

public class CalculosEstatiscos {
	static int fatorial(int _x) {
		int fatorial = 1;
		
		for (int i = 1; i <= _x; i++) {
			fatorial *= i;
		}
		
		return fatorial;
	}
	
	static int arranjo(int _n, int _p) {
		return CalculosEstatiscos.fatorial(_n) / CalculosEstatiscos.fatorial(_n - _p);
	}
	
	static int combinacao(int _n, int _p) {
		return CalculosEstatiscos.fatorial(_n) / (CalculosEstatiscos.fatorial(_p) * CalculosEstatiscos.fatorial(_n - _p));
	}
	
	public static void main(String[] args) 
	{
		int fatorial = CalculosEstatiscos.fatorial(5);
		int arranjo = CalculosEstatiscos.arranjo(7, 4);
		int combinacao = CalculosEstatiscos.combinacao(7, 4);
		
		System.out.println("Fatorial de 10: " + fatorial);
		System.out.println("Arranjo de 7, 4: " + arranjo);
		System.out.println("Combinação de  7, 4: " + combinacao);
	}
}
