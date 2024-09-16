package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> EstoqueMap;

	public EstoqueProdutos() {
		this.EstoqueMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		this.EstoqueMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(EstoqueMap);

	}

	public Double calcularValorTotalEstoque() {
		Double estoqueTotal = 0d;
		if (!EstoqueMap.isEmpty()) {
			for (Produto p : EstoqueMap.values()) {
				estoqueTotal += p.getQuantidade() * p.getPreco();
			}
		}
		return estoqueTotal;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!EstoqueMap.isEmpty()) {
			for (Produto p : EstoqueMap.values()) {
				if (p.getPreco() > maiorPreco) {
					maiorPreco = p.getPreco();
					produtoMaisCaro = p;
				}
			}
		} else {
			throw new RuntimeException("Lista está vazia");
		}
		return produtoMaisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if (!EstoqueMap.isEmpty()) {
			for (Produto p : EstoqueMap.values()) {
				if (menorPreco > p.getPreco()) {
					menorPreco = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		} else {
			throw new RuntimeException("Lista está vazia");
		}
		return produtoMaisBarato;
	}

	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorValor = null;
		double maiorValor = Double.MIN_VALUE;
		double ValorTotalDoProduto = 0d;
		if (!EstoqueMap.isEmpty()) {
			for (Produto p : EstoqueMap.values()) {
				ValorTotalDoProduto = p.getQuantidade() * p.getPreco();
				if (ValorTotalDoProduto > maiorValor) {
					maiorValor = ValorTotalDoProduto;
					produtoMaiorValor = p;
				}
			}
		} else {
			throw new RuntimeException("Lista está vazia");
		}
		return produtoMaiorValor;
	}

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();

		// Exibe o estoque vazio
		estoque.exibirProdutos();

		// Adiciona produtos ao estoque
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
		estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

		// Exibe os produtos no estoque
		estoque.exibirProdutos();

		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

		// Obtém e exibe o produto mais caro
		Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);

		// Obtém e exibe o produto mais barato
		Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
		System.out.println("Produto mais barato: " + produtoMaisBarato);

		// Obtém e exibe o produto com a maior quantidade em valor no estoque
		Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
		System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}
}
