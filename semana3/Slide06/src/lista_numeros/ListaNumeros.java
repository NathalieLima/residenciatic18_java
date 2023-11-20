package lista_numeros;

import java.util.ArrayList;

public class ListaNumeros {
	private ArrayList<Float> numeros;
	
	public void novoNumero(float _f) {
		numeros.add(_f);
	}
	
	public void listaNumeros() {
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}	
	}
	
	public double media() {
		double media = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			media += numeros.get(i);
		}
		
		return media / numeros.size();
	}
	
	public void ordena() {
		
	}
	
	public float mediana() {
		float divisao = numeros.size() / 2;
		if (divisao % 2 == 0) {
			return (divisao + (divisao + 1)) / 2;
		} 
		else {
			return divisao;
		}
	}
}
