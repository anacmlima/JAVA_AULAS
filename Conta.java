package Aula1_poo;

public class Conta {

	int numero;
	double saldo;
	int limite;
	String dono;
	
	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
}
