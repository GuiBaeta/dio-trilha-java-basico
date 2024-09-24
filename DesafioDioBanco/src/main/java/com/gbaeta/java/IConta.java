package com.gbaeta.java;

public interface IConta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestina);

	void imprimirExtrato();

}
