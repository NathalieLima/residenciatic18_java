package lista_numeros;

public class GeradorPrimos {
	public static void listarDivisores(int _n) {
		for (int i = 1; i <= _n; i++) {
			if (_n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static int calcularTotalDivisores(int _n) {
		int total = 0;
		
		for (int i = 1; i <= _n; i++) {
			if (_n % i == 0) {
				total += 1;
			}
		}
		
		return total;
	}
	
	public static boolean isPrimo(int _n) {
		if (GeradorPrimos.calcularTotalDivisores(_n) == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void exibirPrimosAteNumero(int _n) {
		for (int i = 1; i <= _n; i++) {
			if (GeradorPrimos.isPrimo(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void exibirPrimeirosPrimos(int _n) {
		int quantidade = _n;
		
		for (int i = 1; quantidade <= _n; i++) {
			
			if (GeradorPrimos.isPrimo(i)) {
				quantidade++;
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int numero = 10;
		
		GeradorPrimos.listarDivisores(numero);
		System.out.println(GeradorPrimos.calcularTotalDivisores(numero));
		GeradorPrimos.exibirPrimosAteNumero(numero);
		GeradorPrimos.exibirPrimeirosPrimos(numero);
	}
}
