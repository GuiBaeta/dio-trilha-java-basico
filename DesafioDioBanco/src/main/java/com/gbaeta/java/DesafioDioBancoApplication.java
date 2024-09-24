package com.gbaeta.java;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDioBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioBancoApplication.class, args);
		
		System.out.println();
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		
		Conta cc = new ContaCorrente(guilherme);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(guilherme);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	
	// Solicitando um empréstimo para a conta corrente
    BigDecimal valorEmprestimo = new BigDecimal("500.00");
    int numeroParcelas = 12;
    cc.solicitarEmprestimo(valorEmprestimo, numeroParcelas);

    // Exibindo o extrato após o empréstimo
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

	}
}
