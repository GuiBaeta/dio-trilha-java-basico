package main;

public interface IConta {

	void saca(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestina);
	
	void imprimirExtrato();

}
