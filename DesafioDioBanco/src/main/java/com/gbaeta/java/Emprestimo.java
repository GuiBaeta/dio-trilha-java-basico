package com.gbaeta.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Emprestimo {

    private BigDecimal valorEmprestimo;
    private int numeroParcelas;
    private static final BigDecimal TAXA_JUROS = new BigDecimal("0.02"); // 2% de juros

    private Conta conta; // Referência à conta associada ao empréstimo

    public Emprestimo(Conta conta, BigDecimal valorEmprestimo, int numeroParcelas) {
        this.conta = conta;
        this.valorEmprestimo = valorEmprestimo;
        this.numeroParcelas = numeroParcelas;
    }

    public BigDecimal simularEmprestimo() {
        BigDecimal juros = valorEmprestimo.multiply(TAXA_JUROS).multiply(new BigDecimal(numeroParcelas));
        BigDecimal valorFinal = valorEmprestimo.add(juros);
        return valorFinal.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void solicitarEmprestimo() {
        // Adiciona apenas o valor do empréstimo ao saldo da conta
        conta.depositar(valorEmprestimo.doubleValue());
        
        BigDecimal valorComJuros = simularEmprestimo(); // Calcula o valor total com juros
        
        System.out.println("Empréstimo solicitado: " + valorEmprestimo + " em " + numeroParcelas + " parcelas.");
        System.out.println("Valor total a ser pago (com juros): " + valorComJuros);
        System.out.println("Saldo atualizado da conta: " + conta.getSaldo());
        System.out.println();
    }
}

