package conta;

public class Conta {
	private int numero;
	private String nome;
	private float saldo;
	
	public Conta (int _numero, String _nome, float _saldo) {
		this.numero = _numero;
		this.nome = _nome;
		this.saldo = _saldo;
	}
	
	public void depositar(float _valor) {
		saldo += _valor;
	}
	
	public void consultar() {
		System.out.println("Seu saldo atual é: " + saldo + " reais.");
	}
	
	public int saque(float _valor) {
		if (_valor > saldo) {
			saldo-= _valor;
			
			return 1;
		}
		else {
			return 0;
		}
	}
}