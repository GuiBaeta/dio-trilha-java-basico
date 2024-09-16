package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> DicionarioMap;

	public Dicionario() {
		this.DicionarioMap = new HashMap<>();
	}

	public void adicionarPalavra(String nome, String definicao) {
		this.DicionarioMap.put(nome, definicao);
	}

	public void removerPalavra(String nome) {
		if (!DicionarioMap.isEmpty()) {
			DicionarioMap.remove(nome);
		} else {
			throw new RuntimeException("Lista está vazia");
		}
	}

	public void exibirPalavras() {
		System.out.println(DicionarioMap);
	}

	public String pesquisarPorPalavra(String palavra) {
		String palavraEncontrada = null;
		if (!DicionarioMap.isEmpty()) {
			palavraEncontrada = DicionarioMap.get(palavra);
		} else {
			throw new RuntimeException("Lista está vazia");
		}
		return palavraEncontrada;
	}
	
	public static void main(String[] args) {
	    Dicionario dicionario = new Dicionario();

	    // Adicionar palavras (linguagens de programação)
	    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
	    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
	    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

	    // Exibir todas as palavras
	    dicionario.exibirPalavras();

	    // Pesquisar palavras
	    String definicaoJava = dicionario.pesquisarPorPalavra("java");
	    System.out.println("Definição da linguagem 'java': " + definicaoJava);

	    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
	    System.out.println(definicaoCSharp);

	    // Remover uma palavra
	    dicionario.removerPalavra("typescript");
	    dicionario.exibirPalavras();
	  }
	
	
	
}
