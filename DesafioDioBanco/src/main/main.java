package main;

public class main {

	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		
		Conta cc = new ContaCorrente(guilherme);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(guilherme);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
