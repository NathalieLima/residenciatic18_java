package calculadora;

public class AreaRetangulo {
	public static double calcular(double _largura, double _altura) {
		return _largura * _altura;
	}
	
	public static void main(String[] args) {
		double largura = 50, altura = 60;
		double area = AreaRetangulo.calcular(largura, altura);
		
		System.out.println("A área do retângulo com altura de é" + area);
	}
}
