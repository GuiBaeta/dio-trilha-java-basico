package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> CarrinhoDeCompras;
	
	public CarrinhoDeCompras() {
		this.CarrinhoDeCompras = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		CarrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> ItensParaRemover = new ArrayList<>();
		if (!CarrinhoDeCompras.isEmpty()) {
			for (Item i : CarrinhoDeCompras) {
				if (i.getNome().equalsIgnoreCase(nome))	{
					ItensParaRemover.add(i);
				}
			}
			CarrinhoDeCompras.removeAll(ItensParaRemover);
		} else {
			System.out.println("O carrinho está vazio!");
		}
	}
	
	public double calcularValorTotal() {
		if (!CarrinhoDeCompras.isEmpty()) {
			double valorTotal = 0;
			for (Item i : CarrinhoDeCompras) {
				valorTotal = valorTotal + (i.getQuantidade() * i.getPreco());
			}
			return valorTotal;
		} else {
			throw new RuntimeException("O carrinho está vazio!");
		}
	}
	
	public void exibirItens() {
		if (!CarrinhoDeCompras.isEmpty()) {
		      System.out.println(this.CarrinhoDeCompras);
		    } else {
		      System.out.println("O carrinho está vazio!");
		    }
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("O carrinho está com o valor: R$ " + carrinho.calcularValorTotal());
		
		carrinho.adicionarItem("Waffle", 11.98, 2);
		carrinho.adicionarItem("Batata Congelada", 13.99, 4);
		carrinho.adicionarItem("Fraldinha 1.2kg", 35.99, 1);
		carrinho.adicionarItem("Colorado", 13.99, 6);
		
		System.out.println("O carrinho está com o valor: R$ " + carrinho.calcularValorTotal());

		carrinho.removerItem("Fraldinha 1.2kg");
		
		System.out.println("O carrinho está com o valor: R$ " + carrinho.calcularValorTotal());
	
	}
}
