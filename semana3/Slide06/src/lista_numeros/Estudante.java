package lista_numeros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudante {
	public String nome, cpf;
	public Date data_nascimento;
	
	Estudante(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;		
	}
	
	public static Date converter(String _data) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		Date x = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		x = sdf1.parse(stx);
		
		return x;
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
}
