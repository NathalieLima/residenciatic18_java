package exercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	public static int[] criarArrayDoUsuario() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do array:");
        int tamanho = entrada.nextInt();
        
        int[] array = new int[tamanho];
        
        System.out.println("Informe os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = entrada.nextInt();
        }

        return array;
    }
	
	public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
	}
	
	public static int somarValores(int[] numeros) {
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		return soma;
	}
	
	public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        
        for (int numero : array) {
            if (numero > maior) {
                maior = numero;
            }
        }
        
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        
        for (int numero : array) {
            if (numero < menor) {
                menor = numero;
            }
        }
        
        return menor;
    }
    
    public static void exibirValores(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        
        System.out.println(); // quebrar linha após execução
    }
    
    public static void main(String[] args) {
    	int[] valores = {1, 58, 99, 32, 7};
    	int menor, maior, soma;
    	
		menor = ManipulaArray.encontrarMenorValor(valores);
		maior = ManipulaArray.encontrarMaiorValor(valores);
		soma = ManipulaArray.somarValores(valores);
		
		ManipulaArray.exibirValores(ManipulaArray.criarArrayDoUsuario());
    	ManipulaArray.exibirValores(criarArrayAleatorio(5));
		System.out.println("Menor valor: " + menor + " | Maior valor: " + maior + " | Soma: " + soma);
	}
}
