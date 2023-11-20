package calculadora;

public class ConcatenacaoStrings {
	public static void main(String[] args) {
		String str1 = "Boa ", str2 = "noite";
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		
		System.out.println("String concatenada: " + str3 + str4);
	}
}
