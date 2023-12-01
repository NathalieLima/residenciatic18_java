package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Random rand = new Random();	  
	    int valor_aleatorio = rand.nextInt(100) + 1;
	    int valor_usuario = 0;
	    Scanner entrada = new Scanner(System.in);
	    
	    do {
	    	System.out.println("Qual é o número? ");
	    	valor_usuario = entrada.nextInt();
	    	
	    	if ( valor_usuario == valor_aleatorio ) {
	    		System.out.println("Parabéns, você acertou!");
	    	}
	    	else if ( valor_usuario > valor_aleatorio ) {
	    		System.out.println("Muito alto, tente novamente!");
	    	}
	    	else {
	    		System.out.println("Muito baixo, tente novamente!");
	    	}
	    } while (valor_usuario != valor_aleatorio);
	}
}
