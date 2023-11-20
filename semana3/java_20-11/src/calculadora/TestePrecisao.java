package calculadora;

public class TestePrecisao {
	
	// 4.9E-324 para double e 1.4E-45 para float 
	public static void main(String[] args) {
		float x, y;
		x = 2;
		
		do {
			y = x;
			x = x / 2;
			
		} while (x > 0);
		
		System.out.println(y);
	}
}
