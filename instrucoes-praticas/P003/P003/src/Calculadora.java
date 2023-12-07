public class Calculadora 
{
    public static int adicao(int num1, int num2) {
        return num1 + num2;
    }

    // Sobrecarga do método adicao para números do tipo float
    public static float adicao(float num1, float num2) {

        return num1 + num2;
    }

    public static int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    // Sobrecarga do método subtracao para números do tipo float
    public static float subtracao(float num1, float num2) {
        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    // Sobrecarga do método multiplicacao para números do tipo float
    public static float multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

    public static int divisao(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }

        return num1 / num2;
    }

    // Sobrecarga do método divisao para números do tipo float
    public static float divisao(float num1, float num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        float num3 = 5.8f, num4 = 0.0f;
        
        System.out.println("Números " + num1 + " e " + num2);
        System.out.println("Adição: " + Calculadora.adicao(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtracao(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicacao(num1, num2));
        try {
            System.out.println("Divisão: " + Calculadora.divisao(num1, num2));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

        System.out.println("\nNúmeros " + num3 + " e " + num4);
        System.out.println("Adição: " + Calculadora.adicao(num3, num4));
        System.out.println("Subtração: " + Calculadora.subtracao(num3, num4));
        System.out.println("Multiplicação: " + Calculadora.multiplicacao(num3, num4));
        try {
            System.out.println("Divisão: " + Calculadora.divisao(num3, num4));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
